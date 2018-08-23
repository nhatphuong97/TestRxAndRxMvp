package com.example.nhatphuong.httpurlconnection;

import android.app.DownloadManager;
import android.content.Context;
import android.content.Intent;
import android.media.AudioManager;
import android.media.MediaPlayer;
import android.net.Uri;
import android.os.AsyncTask;
import android.os.Bundle;
import android.os.Environment;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import com.example.nhatphuong.httpurlconnection.model.Song;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.ArrayList;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

import static com.example.nhatphuong.httpurlconnection.Contrant.GENRES_COUNTRY;

public class MainActivity extends AppCompatActivity {
    public Button mButton;
    DownloadManager mDownloadManager;
    TextView mTextView;
    MediaPlayer mediaPlayer;
    ArrayList<Song> mSongList;
    public Song mSong;
    public Song mSong1;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        mButton = findViewById(R.id.button_download);
        mTextView = findViewById(R.id.texxt);

        mButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mSongList = new ArrayList<>();
                Intent setParce = new Intent(MainActivity.this, Main2Activity.class);
                mSong = new Song();

                mSong.setId(123);
                mSong.setName("tao là bố mày");
              //  mSong.setLink("http.com");
                mSong1 = new Song();
                mSong1.setId(123);
                mSong1.setName("tao là bố mày");
             //   mSong1.setLink("http.com");

                mSongList.add(mSong);
                mSongList.add(mSong1);
                setParce.putParcelableArrayListExtra("mSongArrayList",mSongList);
                startActivity(setParce);
       //  new JSONTask().execute(GENRES_COUNTRY);

                                mDownloadManager = (DownloadManager) getSystemService(Context
                 .DOWNLOAD_SERVICE);
                                Uri uri = Uri.parse("https://zmp3-mp3-s1.zadn
                 .vn/4071419594d17d8f24c0/8580673733891366349?authen=exp=1532404693~acl
                 =/4071419594d17d8f24c0hmac=673bdec1ca991c33a35bfd25d93b2f6f&filename=Sai
                 -Nguoi-Sai-Thoi-Diem.mp3");
                                DownloadManager.Request mRequest = new DownloadManager.Request
                 (uri);
                                mRequest.setNotificationVisibility(DownloadManager.Request
                 .VISIBILITY_VISIBLE_NOTIFY_COMPLETED);
                             mRequest.setDestinationUri(Uri.parse
                 ("file://sdcard/Download/cc.mp3"));
                                mRequest.setDestinationInExternalPublicDir(Environment
                 .DIRECTORY_DOWNLOADS,"/cc.mp3");
                    Long reference = mDownloadManager.enqueue(mRequest);
//                                String url = "https://api.soundcloud.com/tracks/258984003/stream"+ Contrant.ClIENT_ID; // your URL here
//                          mediaPlayer = new MediaPlayer();
//                //
//                             //   mediaPlayer.setAudioStreamType(AudioManager.STREAM_MUSIC);
//                                mediaPlayer.setAudioStreamType(AudioManager.STREAM_MUSIC);
//                                try {
//
//                                    mediaPlayer.setDataSource(url);
//                                    mediaPlayer.prepare();
//                                } catch (IOException e) {
//                                    e.printStackTrace();
//                                }
//                              // might take long! (for buffering, etc)
//                                mediaPlayer.start();
//                System.out.println(mediaPlayer.getDuration());


            }
        });
    }

    public void testParcelable() {
        mSongList = new ArrayList<>();
        Intent setParce = new Intent(this, Main2Activity.class);
        mSong = new Song();
        mSong.setId(123);
        mSong.setName("tao là bố mày");
        mSong.setLink("http.com");
        mSong1 = new Song();
        mSong1.setId(123);
        mSong1.setName("tao là bố mày");
        mSong1.setLink("http.com");

        mSongList.add(mSong);
        mSongList.add(mSong1);
        setParce.putExtra("msong",mSong);
        startActivity(setParce);


    }

    public class JSONTask extends AsyncTask<String, String, String> {

        @Override
        protected String doInBackground(String... strings) {
            HttpURLConnection mHttpURLConnection = null;
            BufferedReader reader = null;
            try {// Connect
                URL url = new URL(strings[0]);
                mHttpURLConnection = (HttpURLConnection) url.openConnection();
             mHttpURLConnection.setRequestMethod("GET");
                mHttpURLConnection.connect();
                InputStream minputStream = mHttpURLConnection.getInputStream();
                reader = new BufferedReader(new InputStreamReader(minputStream));
                StringBuffer mStringBuffer = new StringBuffer();
                String line = "";
                //vong lap lay ra cac
                while ((line = reader.readLine()) != null) {
                    mStringBuffer.append(line);
                }

                String buffer = mStringBuffer.toString();
                //ĐỐI TƯỢNG LỚN 1 TRANG
                JSONObject jsonObject = new JSONObject(buffer);
                //MẢNG LỚN COLLECION CHỨA NHIỀU ĐỐI TƯỢNG
                JSONArray jsonArray = jsonObject.getJSONArray("collection");

                StringBuffer buffer1 = new StringBuffer();
                for (int i = 0; i < jsonArray.length(); i++) {
                //ĐỐI TƯỢNG 1 trong MẢNG COLLECTION
                    JSONObject jsonObjectSONG = jsonArray.getJSONObject(i);
                    int id = jsonObjectSONG.getInt("id");
                    String genres = jsonObjectSONG.getString("uri");
                    String stream = jsonObjectSONG.getString("stream_url");






                 //đối tượng user
                   JSONObject artistJsonObject = jsonObjectSONG.getJSONObject("user");
                   int user_id = artistJsonObject.getInt("id");
                  String user_avatar = artistJsonObject.getString("avatar_url");
                    String user_name = artistJsonObject.getString("username");
                   System.out.println(user_id +user_avatar +user_name);
                    buffer1.append("    "+i+"   "
                                    + "// " + id + "  " + genres + "   " + stream+"\n"
         +user_id+"   "+user_avatar+"  "+user_name+"   "
                    );
                }
                return buffer1.toString() ;
            } catch (MalformedURLException e) {
                e.printStackTrace();
            } catch (IOException e) {
                e.printStackTrace();
            } catch (JSONException e) {
                e.printStackTrace();
            } finally {
                if (mHttpURLConnection != null) {
                    mHttpURLConnection.disconnect();
                }
                try {
                    if (reader != null) {
                        reader.close();
                    }
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
            return null;
        }

        @Override
        protected void onPostExecute(String s) {
            super.onPostExecute(s);
            mTextView.setText(s);
        }
    }
}

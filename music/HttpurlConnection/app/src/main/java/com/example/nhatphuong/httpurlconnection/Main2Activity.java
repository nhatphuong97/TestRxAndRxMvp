package com.example.nhatphuong.httpurlconnection;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.TextView;
import com.example.nhatphuong.httpurlconnection.model.Song;
import java.util.ArrayList;

public class Main2Activity extends AppCompatActivity {
    TextView mTextView;
    Song mSong;
    ArrayList<Song> mSongArrayList;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        mTextView = findViewById(R.id.text);
        //        mSong= (Song)getIntent().getParcelableExtra("msong");
        //        System.out.println(mSong.getId()+mSong.getName()+mSong.getLink());
        //        mTextView.setText(mSong.getId()+" "+mSong.getName()+" "+mSong.getLink());
        mSongArrayList = getIntent().getParcelableArrayListExtra("mSongArrayList");
        for (int i = 0; i < mSongArrayList.size(); i++) {
            System.out.println(
                    i + "   " + mSongArrayList.get(i).getId() + "    " + mSongArrayList.get(i)
                            .getName() + mSongArrayList.get(i).getLink()+ "\n");
        }
        //mTextView.setText(mSong);
    }
}

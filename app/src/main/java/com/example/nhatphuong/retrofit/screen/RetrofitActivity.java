package com.example.nhatphuong.retrofit.screen;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import com.example.nhatphuong.retrofit.R;
import com.example.nhatphuong.retrofit.data.model.Sonng;
import com.example.nhatphuong.retrofit.data.repository.SongRepository;
import com.example.nhatphuong.retrofit.data.source.RepositoryDataSoure;
import com.example.nhatphuong.retrofit.data.source.remote.RemoteDataSource;
import java.util.ArrayList;
import java.util.List;

public class RetrofitActivity extends AppCompatActivity implements RetrofitContract.View{
    private RetrofitPrenter mRetrofitPrenter;
    private List<Sonng> mSonngs;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_retrofit);
        Button button = findViewById(R.id.button_text);
        SongRepository songRepository = SongRepository.getsInstance(new RemoteDataSource());
        mRetrofitPrenter = new RetrofitPrenter(songRepository);

        mRetrofitPrenter.setView(this);

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mSonngs = new ArrayList<>();
                mRetrofitPrenter.getListData("d3bb97412667a7812924715ea66498af");
            }
        });

    }

    @Override
    public void getSongList(List<Sonng> sonngs) {
        mSonngs = sonngs;
        for (int i =0 ;i<mSonngs.size();i++){
            /**
             * để test
             */
            System.out.println(mSonngs.get(i).getTitle());
        }
    }

    @Override
    public void showError(String s) {
        System.out.println(s); // xuất lỗi
    }
}

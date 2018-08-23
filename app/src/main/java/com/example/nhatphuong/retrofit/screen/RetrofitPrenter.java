package com.example.nhatphuong.retrofit.screen;

import com.example.nhatphuong.retrofit.data.model.Sonng;
import com.example.nhatphuong.retrofit.data.repository.SongRepository;
import com.example.nhatphuong.retrofit.data.source.remote.retrofit_config.APIUntils;
import com.example.nhatphuong.retrofit.data.source.remote.retrofit_config.DataClient;
import io.reactivex.Observable;
import io.reactivex.Observer;
import io.reactivex.android.schedulers.AndroidSchedulers;
import io.reactivex.disposables.Disposable;
import io.reactivex.schedulers.Schedulers;
import java.util.ArrayList;
import java.util.List;

public class RetrofitPrenter implements RetrofitContract.Presenter {

    private RetrofitContract.View mView;
    private SongRepository mSongRepository;

    public void setView(RetrofitContract.View view) {
        mView = view;
    }

    public RetrofitPrenter(SongRepository songRepository){
        mSongRepository = songRepository;
    }

    @Override
    public void getListSong() {
        DataClient dataClient = APIUntils.getData();
        //retrofit2.Call<List<Sonng>> call = dataClient.getDataTrack("country");
//        call.enqueue(new Callback<List<Sonng>>() {
//            @Override
//            public void onResponse(Call<List<Sonng>> call, Response<List<Sonng>> response) {
//                mView.getSongList(response.body());
//            }
//
//            @Override
//            public void onFailure(Call<List<Sonng>> call, Throwable t) {
//                mView.showError(t.getMessage());
//            }
//        });
    }

    @Override
    public void getListData(String id) {
        List<Sonng> list = mSongRepository.getDataSong(id);
        if(list !=null){
            System.out.println("123" +list.get(1).getTitle());
         //   System.out.println("List khác null" + list.get(5).getTitle());
            mView.getSongList(list);
        }



    }



}

package com.example.nhatphuong.retrofit.data.source.remote;

import com.example.nhatphuong.retrofit.data.model.Sonng;
import com.example.nhatphuong.retrofit.data.source.RepositoryDataSoure;
import com.example.nhatphuong.retrofit.data.source.remote.retrofit_config.APIUntils;
import com.example.nhatphuong.retrofit.data.source.remote.retrofit_config.DataClient;
import io.reactivex.Observable;
import io.reactivex.Observer;
import io.reactivex.android.schedulers.AndroidSchedulers;
import io.reactivex.disposables.Disposable;
import io.reactivex.schedulers.Schedulers;
import java.util.ArrayList;
import java.util.List;

public class RemoteDataSource implements RepositoryDataSoure.RemoteDataSource {

    private List<Sonng> mSonngs;


    @Override
    public List<Sonng> getDataSong(String id) {
       // mSonngs = new ArrayList<>();
        DataClient dataClient = APIUntils.getData();
        Observable<List<Sonng>> observable =
                dataClient.getDataById(id, "country");
        observable.subscribeOn(Schedulers.io())
                .observeOn(AndroidSchedulers.mainThread())//Chạy trên Main Thread
                .subscribe(new Observer<List<Sonng>>() {
                    @Override
                    public void onSubscribe(Disposable d) {
                    }

                    @Override
                    public void onNext(List<Sonng> value) {
                        mSonngs = value;
                        System.out.println("remote" + mSonngs.get(1).getArtworkUrl());

                    }

                    @Override
                    public void onError(Throwable e) {

                    }

                    @Override
                    public void onComplete() {

                        System.out.println("Completed");
                    }
                });
        return mSonngs;
    }
}

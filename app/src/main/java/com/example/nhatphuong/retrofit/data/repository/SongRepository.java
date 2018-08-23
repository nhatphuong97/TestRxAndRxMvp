package com.example.nhatphuong.retrofit.data.repository;

import com.example.nhatphuong.retrofit.data.model.Sonng;
import com.example.nhatphuong.retrofit.data.source.RepositoryDataSoure;
import com.example.nhatphuong.retrofit.data.source.remote.RemoteDataSource;
import java.util.List;

public class SongRepository implements RepositoryDataSoure.RemoteDataSource {

    private static SongRepository sInstance;
    private RemoteDataSource mSongRemoteDataSource;

    private SongRepository(RemoteDataSource remoteDataSource) {
        mSongRemoteDataSource = remoteDataSource;
    }

    public static SongRepository getsInstance(RemoteDataSource remoteDataSource) {

        sInstance = new SongRepository(remoteDataSource);
        return sInstance;
    }

    @Override
    public List<Sonng> getDataSong(String id) {
        return mSongRemoteDataSource.getDataSong(id);
    }
}

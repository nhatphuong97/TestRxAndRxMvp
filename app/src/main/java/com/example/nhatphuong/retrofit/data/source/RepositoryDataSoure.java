package com.example.nhatphuong.retrofit.data.source;

import com.example.nhatphuong.retrofit.data.model.Sonng;
import java.util.List;

public interface RepositoryDataSoure {

    interface RemoteDataSource {
        List<Sonng> getDataSong(String id);
    }
}

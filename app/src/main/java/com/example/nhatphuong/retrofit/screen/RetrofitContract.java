package com.example.nhatphuong.retrofit.screen;

import com.example.nhatphuong.retrofit.data.model.Sonng;
import java.util.List;

public interface RetrofitContract {
    interface View{
        void getSongList(List<Sonng> sonngs);

        void showError(String s);


    }
    interface Presenter{
        void getListSong();
        void getListData(String id);
    }
}

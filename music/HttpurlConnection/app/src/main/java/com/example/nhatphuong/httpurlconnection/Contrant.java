package com.example.nhatphuong.httpurlconnection;

public final class Contrant {
    public static final String  BASE_URL = "https://api.soundcloud.com/tracks";
    public static final String  API_KEY="d3bb97412667a7812924715ea66498af";
    public static final String ClIENT_ID = "?client_id="+API_KEY;
        public static final String GENRES_URL = BASE_URL +ClIENT_ID+"&linked_partitioning=1";
        public static final String LIMIT_50 = "&limit=100";
        public static final String LIMIT_10 = BASE_URL +ClIENT_ID+"&linked_partitioning=1";

    public static final String  GENRES_COUNTRY =GENRES_URL+ "&genres=country"+LIMIT_50;
    public static final String  GENRES_ROCK = BASE_URL +ClIENT_ID+"&genres=rock";
    public static final String  GENRES_AMBIENT = BASE_URL +ClIENT_ID+"&genres=ambient";

}

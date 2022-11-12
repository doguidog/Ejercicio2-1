package com.example.ejercicio2_1.SQLite;

public class Video {

    public static final String NameDatabase = "ejercicio21";

    public static String TbVideos = "videos";

    public static final String id = "id";
    public static final String video = "video";

    public static final String CreateTableVideo = "CREATE TABLE IF NOT EXISTS " + TbVideos+
            "(id INTEGER PRIMARY KEY AUTOINCREMENT,"+"video TEXT UNIQUE)";

    public static final String DropTableVideo = "DROP TABLE " + TbVideos;


}

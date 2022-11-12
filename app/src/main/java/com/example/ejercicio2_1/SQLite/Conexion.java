package com.example.ejercicio2_1.SQLite;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

public class Conexion extends SQLiteOpenHelper {

    public Conexion(Context context,
                          String dbname,
                          SQLiteDatabase.CursorFactory factory,
                          int version){

        super(context,dbname,factory,version);
    }

    @Override
    public void onCreate(SQLiteDatabase db) {

        db.execSQL(Video.CreateTableVideo);
    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int i, int i1) {

        db.execSQL(Video.DropTableVideo);
        onCreate(db);
    }

}

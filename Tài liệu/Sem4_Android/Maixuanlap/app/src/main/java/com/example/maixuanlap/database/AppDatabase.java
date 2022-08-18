package com.example.maixuanlap.database;

import android.content.Context;

import androidx.room.Database;
import androidx.room.Room;
import androidx.room.RoomDatabase;

import com.example.maixuanlap.dao.ProductDao;
import com.example.maixuanlap.entity.Product;

@Database(entities = {Product.class}, version = 1)
public abstract class AppDatabase extends RoomDatabase {
    private static AppDatabase appDatabase;

    public abstract ProductDao userDao();

    public static AppDatabase getAppDatabase(Context context){
        if(appDatabase == null){
            appDatabase = Room.databaseBuilder(context,
                    AppDatabase.class,"Product").allowMainThreadQueries().build();
        }
        return appDatabase;
    }

}
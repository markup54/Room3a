package com.example.room3a;

import android.content.Context;

import androidx.room.Database;
import androidx.room.Room;
import androidx.room.RoomDatabase;

@Database(entities = Produkt.class,
        exportSchema = false,
        version = 1)
public abstract class ProduktDatabase
        extends RoomDatabase {

    private static final String DB_NAME = "produktyDB";
    public abstract ProduktDao produktDao();
    private static ProduktDatabase instance;
    public static ProduktDatabase getInstance(Context context)
    {
        if(instance == null){
            instance = Room.databaseBuilder(
                    context.getApplicationContext(),
                    ProduktDatabase.class,
                    DB_NAME
            )
                    .allowMainThreadQueries()
                    .fallbackToDestructiveMigration()
                    .build();
        }
        return instance;
    }
}

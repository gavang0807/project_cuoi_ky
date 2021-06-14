package com.example.baitaplon.data;

import android.content.ContentValues;
import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import android.util.Log;

import androidx.annotation.Nullable;

import com.example.baitaplon.model.User;

public class DataBaseManager extends SQLiteOpenHelper {
    private final String TAG = "DBManager";
    private static final String DATABASE_NAME = "USER_MANAGER";
    private static final String TABLE_NAME = "users";
    private static final String ID = "id";
    private static final String USERNAME = "username";
    private static final String PASSWORD = "password";
    private static int VERSION = 1;
    private Context context;

    private String SQLQuery = "CREATE TABLE "+TABLE_NAME+" ("+
            ID+" integer primary key, "+
            USERNAME+" TEXT, "+
            PASSWORD+" TEXT)";

    public DataBaseManager(@Nullable Context context) {
        super(context, DATABASE_NAME, null, 1);
        this.context = context;
        Log.d(TAG, "DataBaseManager: ");
    }

    @Override
    public void onCreate(SQLiteDatabase db) {
        db.execSQL(SQLQuery);
        Log.d(TAG, "onCreate: ");
    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {
        Log.d(TAG, "onUpgrade: ");
    }
    public void addUser(User user){
        SQLiteDatabase db = this.getWritableDatabase();
        ContentValues values = new ContentValues();
        values.put(USERNAME, user.getmUsername());
        values.put(PASSWORD, user.getmPassword());
        db.insert(TABLE_NAME, null, values);
        db.close();
        Log.d(TAG, "addUser Successfully");
    }
}

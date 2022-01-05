package com.example.momen.test;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

/**
 * Created by momen mohamed on 31/05/2018.
 */

public class DatabaseHelper extends SQLiteOpenHelper {
    public static final String DATABASE_NAME="register.db";
    public static final String TABLE_NAME="registeration";
    public static final String COL_1="ID";
    public static final String COL_2="FirstName";
    public static final String COL_3="LastName";
    public static final String COL_4="Password";
    public static final String COL_5="Email";
    public static final String COL_6="Phone";
    public DatabaseHelper(Context context) {
        super(context, DATABASE_NAME, null, 1);
    }

    @Override
    public void onCreate(SQLiteDatabase db) {
        db.execSQL("CREATE TABLE " + TABLE_NAME + " (ID INTEGER PRIMARY KEY AUTOINCREMENT,FirstName TEXT,LastName TEXT,Password TEXT,Email TEXT,Phone TEXT)");
    }
    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {
        db.execSQL("DROP TABLE IF EXISTS " +TABLE_NAME); //Drop older table if exists
        onCreate(db);
    }
    public void addProduct1(products product) {
        ContentValues values = new ContentValues();
        values.put(COL_2, product.get_productname());
        values.put(COL_3, product.get_productname());
        values.put(COL_4, product.get_productname());
        values.put(COL_5, product.get_productname());
        values.put(COL_6, product.get_productname());//Where, what. (Not writing to database yet.)
        SQLiteDatabase sqLiteDatabase = getWritableDatabase();
        sqLiteDatabase.insert(TABLE_NAME, null, values); //Writing to database now.
        sqLiteDatabase.close();
    }

    //Delete a product from the database.
    public void deleteProduct1(String productName) {
        SQLiteDatabase sqLiteDatabase = getWritableDatabase();
        String query = "DELETE FROM " + TABLE_NAME + " WHERE " + COL_2 +COL_3+COL_4+COL_5+COL_6+ "=\"" + productName + "\"";
        sqLiteDatabase.execSQL(query);
    }

    //Print out the database as a string.
    public String databaseToString1() {
        String dbString = "";
        SQLiteDatabase sqLiteDatabase = getWritableDatabase();
        String query = "SELECT * FROM " + TABLE_NAME + " WHERE 1"; //Select every column, select every row.

        Cursor cursor = sqLiteDatabase.rawQuery(query, null); //Cursor point to a location in results.
        cursor.moveToFirst(); //Move to the first row in results.
        while (!cursor.isAfterLast()) {
            if (cursor.getString(cursor.getColumnIndex("FirstName")) != null) {
                dbString += cursor.getString(cursor.getColumnIndex("FirstName"));
                dbString += "\n";
            }
            cursor.moveToNext();
        }
        cursor.close();

        sqLiteDatabase.close();
        return dbString;
    }
}

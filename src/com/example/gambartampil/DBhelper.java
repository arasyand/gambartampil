package com.example.gambartampil;

import android.content.Context;
import android.database.Cursor;
import android.database.SQLException;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

public class DBhelper extends SQLiteOpenHelper {
	
	private Object localException;

	String DB_PATH = null;
	// variabel statis
	private static final int DATABASE_VERSION = 1;
	// nama database
	private static final String DATABASE_NAME = "gambar.db";

	private SQLiteDatabase dbase;

	public DBhelper(Context context) {
		super(context, DATABASE_NAME, null, DATABASE_VERSION);
		// TODO Auto-generated constructor stub

	}

	@Override
	public void onCreate(SQLiteDatabase db) {
		// TODO Auto-generated method stub

	}

	@Override
	public void onUpgrade(SQLiteDatabase arg0, int arg1, int arg2) {
		// TODO Auto-generated method stub

	}

	public void openDB() throws SQLException {
		if (this.dbase == null) {
			this.dbase = this.getWritableDatabase();
		}
	}
	
	
	public String ambilgambar(int ID) {
		try {
			this.dbase = getReadableDatabase();
			Cursor localCursor = this.dbase.rawQuery("select gambar from gambar where id=" + ID, null);
			localCursor.moveToFirst();
			String str = localCursor.getString(localCursor.getColumnIndex("gambar"));
			localCursor.close();
			return str;
		} catch (Exception localException) {
			localException.printStackTrace();
		}
		return localException.toString();
	}
	
	
	

	
	
	
}
	
	


package com.example.gambartampil;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class LihatData extends Activity {
	
	private DBhelper DB = new DBhelper(this);
	
	public void onCreate (Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.lihatdata);
		
		Button b_gambar = (Button) findViewById (R.id.btngambar);
		
		
			b_gambar.setOnClickListener(new View.OnClickListener() {

			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				Intent intent = new Intent(LihatData.this, PenampilGambar.class);
				startActivity(intent);
				
			}
		});
	
	
		
		
	
	}

}

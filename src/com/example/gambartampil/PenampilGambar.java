package com.example.gambartampil;

import java.text.BreakIterator;

import android.app.Activity;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.drawable.AnimationDrawable;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.os.CountDownTimer;
import android.os.Handler;
import android.util.Log;
import android.widget.ImageView;

public class PenampilGambar extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.penampilgambar);
		looping();
		

	}

	public void looping(){

		ImageView gambar = (ImageView) findViewById(R.id.imggambar);
		int[] array = { R.drawable.alpukat,  R.drawable.apel, R.drawable.pir};

		
	 
		
//		AnimationDrawable anim = new AnimationDrawable();
//		int[] drawables = {R.drawable.alpukat,R.drawable.pir,R.drawable.apel}; 
//		Drawable[] drawa = new Drawable[drawables.length];
//
//		for (int j=0;j<6;j++) {
//		  anim.addFrame(drawa, 200);
//		}
//
//		gambar.setBackgroundDrawable(anim);
//		anim.setOneShot(false);
//		anim.start();
//		
//		
//			try {
//				ImageView gambar = (ImageView) findViewById(R.id.imggambar);
//				
//				
//				for(int i=0; i<drawables.length; i++){
//					Log.d("cek gambar", drawables.toString());
//					gambar.setBackgroundResource(drawables[i]);
//				Thread.sleep(5000);
//				}
//			} catch (InterruptedException e) {
//				// TODO Auto-generated catch block
//				e.printStackTrace();
//			}
		
	}
	
	

	public void delay(int seconds) {
		final int milliseconds;
		milliseconds = seconds * 1000;
		runOnUiThread(new Runnable() {
			@Override
			public void run() {
				final Handler handler = new Handler();
				handler.postDelayed(new Runnable() {
					@Override
					public void run() {
						System.out.println("XXX"); // add your code here
					}
				}, milliseconds);
			}
		});
	}
}

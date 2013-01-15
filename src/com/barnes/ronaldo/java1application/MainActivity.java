package com.barnes.ronaldo.java1application;

import com.rbarnes.lib.appdata;

import android.os.Bundle;
import android.app.Activity;
import android.view.Menu;
import android.widget.LinearLayout;

public class MainActivity extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		
		LinearLayout lLayout = new LinearLayout(this);
		
		LinearLayout textBox = appdata.EntryWithButton(this, "Type Please", "Press Me");
		
		lLayout.addView(textBox);
		
		setContentView(lLayout);
		
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.activity_main, menu);
		return true;
	}

}

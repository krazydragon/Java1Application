//Ronaldo Barnes
//Java 1 week 2
//Full Sail University

package com.barnes.ronaldo.java1application;

import com.rbarnes.lib.appdata;

import android.os.Bundle;
import android.app.Activity;
import android.util.Log;
import android.view.Menu;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.LinearLayout;

public class MainActivity extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		
		LinearLayout lLayout = new LinearLayout(this);
		
		LinearLayout textBox = appdata.EntryWithButton(this, "Type Please", "Press Me");
		
		Button testButton = (Button) textBox.findViewById(2);
		
		testButton.setOnClickListener(new View.OnClickListener() {
			
			@Override
			public void onClick(View v) {
				
				EditText testText = (EditText) v.getTag();
				Log.i("BUTTON CLICKED:", testText.getText().toString());
			}
		});
		
		
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

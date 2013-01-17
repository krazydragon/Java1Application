//Ronaldo Barnes
//Java 1 week 2
//Full Sail University

package com.barnes.ronaldo.java1application;

import java.util.ArrayList;

import com.rbarnes.lib.Appdata;
import com.rbarnes.other.Dessert;

import android.os.Bundle;
import android.app.Activity;
import android.util.Log;
import android.view.Menu;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.LinearLayout;
import android.widget.RadioGroup;

public class MainActivity extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		
		LinearLayout lLayout = new LinearLayout(this);
		
		LinearLayout textBox = Appdata.EntryWithButton(this, "Type Please", "Press Me");
		
		Button testButton = (Button) textBox.findViewById(2);
		
		testButton.setOnClickListener(new View.OnClickListener() {
			
			@Override
			public void onClick(View v) {
				
				EditText testText = (EditText) v.getTag();
				Log.i("BUTTON CLICKED:", testText.getText().toString());
			}
		});
		ArrayList<Dessert> desserts = new ArrayList<Dessert>();
		desserts.add(new Dessert("Cookies", 47));
		desserts.add(new Dessert("Cakes", 106));
		desserts.add(new Dessert("Pies", 7));
		desserts.add(new Dessert("Cobblers", 9));
		desserts.add(new Dessert("Candy", 15));
		
		String[] dessertNames = new String[desserts.size()];
		for(int i=0; i<desserts.size(); i++){
			dessertNames[i] = desserts.get(i).getName();
		}
		
		RadioGroup dessertOptions = Appdata.getGroup(this, dessertNames);
		
		lLayout.addView(dessertOptions);
		
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

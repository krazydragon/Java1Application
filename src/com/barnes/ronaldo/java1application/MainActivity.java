//Ronaldo Barnes
//Java 1 week 2
//January 2013
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
import android.widget.RadioButton;
import android.widget.TextView;
import android.widget.LinearLayout.LayoutParams;
import android.widget.RadioGroup;

public class MainActivity extends Activity {

	RadioGroup dessertOptions;
	ArrayList<Dessert> desserts;
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		
		LinearLayout lLayout = new LinearLayout(this);
		LayoutParams lParams = new LayoutParams(LayoutParams.MATCH_PARENT,LayoutParams.MATCH_PARENT);
		lLayout.setLayoutParams(lParams); 
		lLayout.setOrientation(LinearLayout.VERTICAL);
		
		TextView tview = new TextView(this);
	    tview.setText(getString(R.string.intro_text));
		LinearLayout textBox = Appdata.EntryWithButton(this, getString(R.string.text_hint), getString(R.string.button_text));
		
		Button testButton = (Button) textBox.findViewById(2);
		
		testButton.setOnClickListener(new View.OnClickListener() {
			
			@Override
			public void onClick(View v) {
				
				int selectedButtonId = dessertOptions.getCheckedRadioButtonId();
				RadioButton selectedButton = (RadioButton) dessertOptions.findViewById(selectedButtonId);
				String buttonText = (String) selectedButton.getText();
				
				int quantity = 0;
				int newQuantity = 0;
				
				for(int i=0; i<desserts.size(); i++){
					if(buttonText.compareTo(desserts.get(i).getName())==0){
						
						quantity = desserts.get(i).getStock();
	
					}
					
				}
				
				EditText amountText = (EditText) v.getTag();
				
				
				 newQuantity = quantity -  Integer.parseInt(amountText.getText().toString());
				 
				 Log.i("BUTTON CLICKED:", amountText.getText().toString());
				
				
				
				
			}
		});
		
		//Set up desserts
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
		
		dessertOptions = Appdata.getGroup(this, dessertNames);
		
		lLayout.addView(tview);
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

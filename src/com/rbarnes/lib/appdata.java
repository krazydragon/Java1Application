//Ronaldo Barnes
//Java 1 week 2
//Full Sail University
package com.rbarnes.lib;

import android.content.Context;
import android.widget.Button;
import android.widget.EditText;
import android.widget.LinearLayout;
import android.widget.LinearLayout.LayoutParams;
import android.widget.RadioButton;
import android.widget.RadioGroup;

public class Appdata {

	public static LinearLayout EntryWithButton(Context context, String hint, String bText){
		LinearLayout lLayout = new LinearLayout(context);
		LayoutParams lParams = new LayoutParams(LayoutParams.MATCH_PARENT,LayoutParams.WRAP_CONTENT);
		lLayout.setLayoutParams(lParams);
		
		EditText eText = new EditText(context);
		lParams = new LayoutParams(0, LayoutParams.WRAP_CONTENT, 1.0f);
		eText.setHint(hint);
		eText.setLayoutParams(lParams);
		eText.setId(1);
		
		Button b = new Button(context);
		b.setText(bText);
		b.setId(2);
		b.setTag(eText);
		
		lLayout.addView(eText);
		lLayout.addView(b);
		
		return lLayout;
		
		
	}
	
	public static RadioGroup getGroup(Context context, String[] group){
		RadioGroup boxes = new RadioGroup(context);
		
		for(int i=0; i<group.length; i++){
			
			RadioButton rButton = new RadioButton(context);
			rButton.setText(group[i]);
			boxes.addView(rButton);
		}
		
		return boxes;
	}
	
	
}

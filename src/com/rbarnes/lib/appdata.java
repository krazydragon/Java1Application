package com.rbarnes.lib;

import android.content.Context;
import android.widget.Button;
import android.widget.EditText;
import android.widget.LinearLayout;
import android.widget.LinearLayout.LayoutParams;

public class appdata {

	public static LinearLayout EntryWithButton(Context context, String hint, String bText){
		LinearLayout lLayout = new LinearLayout(context);
		LayoutParams lParams = new LayoutParams(LayoutParams.MATCH_PARENT,LayoutParams.WRAP_CONTENT);
		lLayout.setLayoutParams(lParams);
		
		EditText eText = new EditText(context);
		lParams = new LayoutParams(0, LayoutParams.WRAP_CONTENT, 1.0f);
		eText.setHint(hint);
		eText.setLayoutParams(lParams);
		
		Button b = new Button(context);
		b.setText(bText);
		
		lLayout.addView(eText);
		lLayout.addView(b);
		
		return lLayout;
		
		
	}
	
	
}

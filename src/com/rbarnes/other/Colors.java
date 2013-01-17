//Ronaldo Barnes
//Java 1 week 2
//Full Sail University
package com.rbarnes.other;

import java.util.HashMap;

public enum Colors {
	RED(1),
	GREEN(2),
	BLUE(3),
	WHITE(4),
	BLACK(5);
	
	private final int value;
	
	Colors(int value){
		this.value = value;
		
	}
	
	public static HashMap<Colors, Integer> getColors(){
		
		HashMap<Colors, Integer> colors = new HashMap<Colors, Integer>();
		Colors[] colorList = {RED,GREEN,BLUE,WHITE,BLACK};
		for(int i=0; i<colorList.length; i++){
			Colors color = colorList[i];
			colors.put(color, i);
		}
		return colors;
	}
	
	
	
	
	
		
		
	

}

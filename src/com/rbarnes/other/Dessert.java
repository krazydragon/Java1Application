//Ronaldo Barnes
//Java 1 week 2
//January 2013
//Full Sail University
package com.rbarnes.other;



public class Dessert implements Inventory {

	
	String name;
	int stock;
	
	public Dessert(String name, int stock){
		setName(name);
		setStock(stock);
	}
	
	@Override
	public boolean setName(String name) {
		this.name = name;
		return true;
	}

	@Override
	public boolean setStock(int stock) {
		this.stock = stock;
		return true;
	}

	@Override
	public String getName() {
		// TODO Auto-generated method stub
		return this.name;
	}

	@Override
	public int getStock() {
		// TODO Auto-generated method stub
		return this.stock;
	}

}

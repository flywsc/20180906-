package com.wsc2018091401;

public abstract class animal {
	public   String name;
	public  int legnum;
	
	
	
	public animal(String name, int legnum) {
		super();
		this.name = name;
		this.legnum = legnum;
	}
	public animal() {
		super();
		// TODO Auto-generated constructor stub
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getLegnum() {
		return legnum;
	}
	public void setLegnum(int legnum) {
		this.legnum = legnum;
	}
	
}

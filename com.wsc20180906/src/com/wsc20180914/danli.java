package com.wsc20180914;

public class danli {
  public  String name;
    String ing;
	static danli dd;
	
    
    public static danli getDd() {
		if(dd==null) {
			
		}
    	return new danli();
	}
	private danli(String name, String ing) {
		super();
		this.name = name;
		this.ing = ing;
	}
    private danli() {};
   
    
  
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getIng() {
		return ing;
	}
	public void setIng(String ing) {
		this.ing = ing;
	}
    void play (){
    	System.out.println("我叫"+name);
    }
}

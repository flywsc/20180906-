package com.wsc201809012;

public class test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        per pe=new per();
        pain qe=new pain();
        pet pet=new dog();
        pet ca=new cat();
        qe.eat();
        pe.play(pet);
        pet.eat();
      if(pet instanceof dog) {
    	  pe.fly(pet);
      }else if(pet instanceof cat){
    	  ca.fly(pet);
      }
	}

}

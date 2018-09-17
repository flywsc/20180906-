package com.wsc2018091703;

import java.util.HashMap;
import java.util.Map;

public class dog {
	public static void main(String[] args) {
		Map map = new HashMap();
		pets pet=new pets("aa","男");
		map.put(pet.getName(),pet);
		
		pets pet1=new pets("a1","女");
		map.put(pet1.getName(),pet1);
		
		pets pet2=new pets("a2","女");
		map.put(pet2.getName(),pet2);
		
		pets pet3=new pets("aa3","男");
		map.put(pet3.getName(),pet3);
		
		pets pet4=new pets("aa4","男");
		map.put(pet4.getName(),pet4);
		
	
		for(Object key:map.keySet()) {
			pets _pet=(pets)map.get(key);
			_pet.print();
		}
	
    
     
	}
}

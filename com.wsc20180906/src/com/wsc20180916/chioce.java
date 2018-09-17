package com.wsc20180916;

import java.util.Scanner;

public class chioce {
     public static pet get(String ch) {
//		System.out.println("输入要掉的借口");
//		Scanner  input =new Scanner(System.in);
//		String cc=input.next();
    	 if(ch.equals("dog")) {
			return new dog();
		}else {
			return new cat();
		}
		
    	 
     }
}

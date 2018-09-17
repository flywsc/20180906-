package com.wsc2018091702;

import java.util.Scanner;

public class teststack {
	public static void main(String[] args) {
		Stack stackss = new Stack();
		   for(int j=0;j<10;j++) {
			car ca=new car(j,"mm");
			stackss.push(ca);
		}
		    System.out.println("请输入你第几辆车出去");
		Scanner input=new Scanner(System.in);
		    int shuru=input.nextInt();
		    for(int i=0;i<(10-shuru);i++) {
		    	stackss.pop();
		    	String st="第"+((car) stackss.pop()).getId()+"出来";
		    	System.out.println(st);
		}
	}

}


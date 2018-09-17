package com.wsc20180917;

import java.util.Scanner;

import org.apache.log4j.Logger;

public class teselog4j {
	public static Logger d1=Logger.getLogger( teselog4j.class);
	public static void main(String[] args) {
		// TODO Auto-generated method stub
      Scanner input=new Scanner (System.in);
      int a=input.nextInt();
     d1.debug("输入被加数");
      int b=input.nextInt();
      d1.debug("输入加数");
      System.out.println(a+b);
      d1.debug("输出来结果");
	}

}

package com.wsc20180901001;

import java.util.Scanner;

public class test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        bus bu=new bus();
        xiaocar xc=new xiaocar();
      
        
        xc.pp="别克";
    	System.out.println("您即将租用车型为" + xc.pp + "价格是" + xc.gettype1(3));
	    bu.bb="客车（金杯/）";
	    System.out.println("您即将租用车型为客车（金杯/）"+"价格是"+bu.gettype1(1)+"座位数是"+bu.zuowei);
	}

}

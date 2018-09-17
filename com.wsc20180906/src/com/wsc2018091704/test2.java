package com.wsc2018091704;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class test2 {
	public static void main(String[] args) {
		
		//这里是提前声明，所以下面不需要强制转换
		List <pin> list =new ArrayList<pin>(); 
		pin pi=new pin("b1","男");
		list.add(pi);
        
		pin p2=new pin("b2","女");
		list.add(p2);
		pin p3=new pin("b3","男");
		list.add(p3);
		
        pin p4=new pin("b4","女");
        list.add(p4);
        
        pin p5=new pin("b5","男");
        list.add(p5);
        
        pin p6=new pin("b6","男");
        list.add(p6);
        
        System.out.println("长度是"+list.size());
        Iterator <pin> it=list.iterator();
        while(it.hasNext()) {
       	
       	pin pinss=(pin)it.next();
       	System.out.println("我的编号是"+pinss.getName()+"性别是"+pinss.getSex());
       }
	
	}
}

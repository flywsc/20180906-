package com.wsc2018091702;

import java.util.LinkedList;

public class Stack extends LinkedList{
   public void push(Object o) {
	   this.add(o);
   }
   public Object pop() {
	return this.removeLast();
	   
   }
}

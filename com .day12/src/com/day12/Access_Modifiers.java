package com.day12;

public class Access_Modifiers {
	int data=40;  
	void msg(){System.out.println("Hello java");}  
	 
	  
 
	 public static void main(String args[]){  
	   Access_Modifiers obj=new Access_Modifiers();  
	   System.out.println(obj.data);  
	   obj.msg();  
	   }  
	}  


package com.day12;

public class innerClassAssisted1 {
 private String msg="Welcome to Java"; 
	 
	 class Inner{  
	  void hello(){System.out.println(msg+", Let us start learning Inner Classes");}  
	 }  


	public static void main(String[] args) {

		innerClassAssisted1 obj=new innerClassAssisted1();
		innerClassAssisted1.Inner in=obj.new Inner();  
		in.hello();  
	}
}


public class innerClassAssisted1 {

private String msg="Inner Classes";

 void display(){  
	 class Inner{  
		 void msg(){
			 System.out.println(msg);
		 }  
  }  
  
  Inner l=new Inner();  
  l.msg();  
 }  

 
public static void main(String[] args) {
	innerClassAssisted1  ob=new innerClassAssisted2 ();  
	ob.display();  
	}
}



abstract class AnonymousInnerClass {
	   public abstract void display();
	}


	public class innerClassAssisted {

	public static void main(String[] args) {
	AnonymousInnerClass i = new AnonymousInnerClass() {

	         public void display() {
	            System.out.println("Anonymous Inner Class");
	         }
	      };
	      i.display();
	   }

}

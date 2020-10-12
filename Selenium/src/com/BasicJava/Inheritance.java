package com.BasicJava;

public class Inheritance {
	
	 public static void main(String[] args) {
		 
		 
		 
		 class A{
			 void m1(){
				 System.out.println("m1 is calling");
			 }
			 
			 
			 
			 void m1(int i){// overloading 
				 System.out.println("m1 with arg ");
			 }
		 }
		 
		 class B extends A{ //inheriatnce
			 
			 void m2(){
				 System.out.println("m2 is calling");
			 }
			 
			 void m1(){// overriding
				 System.out.println("m1 child is calling");
			 }
			 
		 }
		 
		 A a = new A(); //class A
		 a.m1();
		 a.m1(10);
		 
		 
		 B b = new B();
		 b.m1();
		 b.m1(100);
		 b.m2();
		 
		 A ab= new B(); //parent ref child class ki object creation //upcasting or dynamic polymorphism
		 
		 ab.m1();//parent
		 ab.m1(10000);
		 
		 
		 
		 
		 
		
	}
			
			
		 
}
	
  


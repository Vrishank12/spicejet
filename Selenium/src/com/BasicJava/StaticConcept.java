package com.BasicJava;


public   class StaticConcept {
	public static void main(String[] args) {
		
   class  Animal{
		
	 
		
	  int m1( int i){  // primitive
			System.out.println(" m1 is coming");
			return i;
		}
		void m2(){  //void
			System.out.println("m2 is coming");
		}
	}
	
  class dog{
	  
	 Animal  m3() //class types
	  {
		return null;
	  
	     // return Animal;
	  }
   }
	 
	 
		
	//public static void main(String[] args) {
	
		
			 Animal a = new Animal();
			 
			 a.m1(10);
			 
		
	}

}

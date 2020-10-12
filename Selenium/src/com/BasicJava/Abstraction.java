package com.BasicJava;

public class Abstraction {

	abstract class Animal { //abstract class --no object creation
		
		
		  public abstract void animalSound(); //abstract method
		  
		  
		  public void sleep() { //user defined method
		    System.out.println("Zzz");
		  }
		}
	
	class Pig extends Animal { //inherit
		
		
		  public void animalSound() {
		    // The body of animalSound() is provided here
		    System.out.println("The pig says: wee wee");
		  }
		}

}

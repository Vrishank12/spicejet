package com.BasicJava;

public class Variable {
//variable is name which is associated with the value that can be changed
//variable can accept only one value at a time
//variable can be saved with similar data types
//variables assigned with the values can be used any number of times
//variable always have latest value in it, which is assigned
	public static void main(String[] args) {
		int a=10;
		//to assign sequence of char we use string class in java with double quotes
		String str="abs";
		//for single char
		char ch='a';
		//for decimal value
		float f=10.23f;
		double d=123.267;
		boolean bl=true;
		System.out.println("the value of  integer is" +a);
		System.out.println("the value of string is" +str);
		System.out.println("the value of character is" +ch);
		System.out.println("the value of floating is" +f);
		System.out.println("the value of double is" +d);
		System.out.println(bl);
//strings
		
		String str2="sun";
		String str1=" sunmoon";
	System.out.println(str1.substring(1,5));
	System.out.println(str1.trim().length());
	System.out.println(str1.length());
		
	}

}

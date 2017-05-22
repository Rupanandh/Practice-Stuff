package com.string;

public class StringManipulation {
	
	static String name = "RUpa*&^nandha Moo ori Redd y";
	
	public static void main(String[] args)
	{
		System.out.println(name.substring(3));
		System.out.println(name.substring(1, 3));
		System.out.println(name.replaceAll(" ", ""));
		System.out.println(name.indexOf('R',8));
		System.out.println(name.startsWith("M", 15));
		System.out.println(name.intern());
	}
			
			

}

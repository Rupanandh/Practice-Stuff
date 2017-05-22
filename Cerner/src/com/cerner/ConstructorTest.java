package com.cerner;

public class ConstructorTest extends StaticTest {

	ConstructorTest()
	{
		System.out.println("this");
	}
	
	ConstructorTest(int i)
	{
		 
		
		
	}
	
	
	public static void main(String[] args)
	{
		new ConstructorTest();
	}
}


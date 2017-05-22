package com.sample;

public class StaticBlocks {
	
	public StaticBlocks()
	{
		System.out.println("Constructor::");
	}
	
	static{
		System.out.println("2nd static block");
	}
	
	static{
		System.out.println("1st static block");
	}
	
	{
		System.out.println(" 1st intilization blocks");
	}
	{
		System.out.println(" 2nd intilization blocks");
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Main method");
		new StaticBlocks();
	}

}

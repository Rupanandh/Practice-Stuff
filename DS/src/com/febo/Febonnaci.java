package com.febo;

public class Febonnaci {
	
	static int n0=0;
	static int n1=1;
	static int n2;
	
	
	
	public static void main(String[] args)
	{
		printFebonaciSeries(7);
	}
	static void  printFebonaciSeries(int n){
		
		
		System.out.print(n0+","+ n1+",");
		for (int i=2;i<n;i++)
		{
			n2 =n1+n0;
			System.out.print(n2+",");
			n0=n1;
			n1=n2;
		}
	}

}

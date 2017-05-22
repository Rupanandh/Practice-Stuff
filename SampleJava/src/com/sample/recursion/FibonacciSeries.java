package com.sample.recursion;


public class FibonacciSeries {
	
	public static void main(String[] args)
	{
		System.out.println(fibonaciSeries(6));
	}

	public static int fibonaciSeries(int number){
		
		 if(number<=2 && number >=1)
		 {
			 return 1;
		 }
		
		
		return fibonaciSeries(number-1)+fibonaciSeries(number-2);
		
	}
}

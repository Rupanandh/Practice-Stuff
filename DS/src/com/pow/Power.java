package com.pow;

public class Power {

	public static void main(String[] args) {
		
		
		System.out.println(calculatePower(5,7));

	}

	private static int calculatePower(int x, int y) {
		if(y==0){
			return 1;
		}
		else if(y%2==0)
		{
			return calculatePower(x*x, y/2);
		}
		
		else{
			return x* calculatePower(x, y-1);
		}
		
	}

}

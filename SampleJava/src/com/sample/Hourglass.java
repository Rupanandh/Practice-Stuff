package com.sample;

public class Hourglass {

	public static void main(String args[]) {

		int a[][] = new int[6][6];
		
		int maxSum = Integer.MIN_VALUE;

		for (int i = 0; i < 6; i++) {
			for (int j = 0; j < 6; j++) {
				a[i][j] = j;

			}

		}
		
		for(int column = 0;column<4;column++)
		{
			for(int row=0;row<4;row++)
			{
				int sum = a[column][row]+a[column][row+1]+a[column][row+2]
									+a[column+1][row+1]+
						 a[column+2][row]+a[column+2][row+1]+a[column+2][row+2];	
				if(maxSum<sum)
				{
					maxSum=sum;
				}
			}
			}
			
			
		
	}
}

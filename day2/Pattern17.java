package com.excel;

public class Pattern17 {
	
	/* 1 2 3 4 5
	 * 2 3 4 5
	 * 3 4 5
	 * 4 5
	 * 5
	 */

	public static void main(String[] args)
	{
		int n=5;
		for(int i=1; i<=5; i++)  
		{
			for(int j=i; j<=5; j++)
			{
				System.out.print(j + " ");
			}
			System.out.println();
		}
	}
}

package com.excel;

public class Pattern3 {
	
	/*
	1
	2 3
	3 4 5
	4 5 6 7
	5 6 7 8 9
	 */
	public static void main(String[] args)
	{
		int number = 5;
		for(int i=1; i<=number; i++)
		{
			int k = i;
			for(int j=1; j<=i; j++)
			{
				System.out.print(k++ + " ");
				
			}
			System.out.println();
		}
	}
}

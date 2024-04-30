package com.excel;

public class Pattern {
	
	/*
	 * 1 1 1 1 1
	 * 2 2 2 2 2
	 * 3 3 3 3 3
	 * 4 4 4 4 4
	 * 5 5 5 5 5
	 */
	public static void main(String[] args)
	{
		int number = 5;
		for(int i=1; i<=number; i++)
		{
			for(int j=1; j<=number; j++)
			{
				System.out.print(i + " ");
				
			}
			System.out.println();
		}
	}
}

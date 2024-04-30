package com.excel;

public class Pattern2 {
	
	/*
	 * 1 2 3 4 5
	 * 1 2 3 4 5
	 * 1 2 3 4 5
	 * 1 2 3 4 5
	 * 1 2 3 4 5
	 */
	public static void main(String[] args)
	{
		int number = 5;
		for(int i=1; i<=number; i++)
		{
			for(int j=1; j<=number; j++)
			{
				System.out.print(j + " ");
				
			}
			System.out.println();
		}
	}
}

package com.excel;

public class Pattern14 {

	/* 5 4 3 2 1
	 * 5 4 3 2 1
	 * 5 4 3 2 1
	 * 5 4 3 2 1
	 * 5 4 3 2 1
	 * 
	 */
	public static void main(String[] args)
	{
		int n=5;
		for(int i=5; i>=1; i--)
		{
			for(int j=5; j>=1; j--)
			{
				System.out.print(j + " ");
			}
			System.out.println();
		}
	}

}

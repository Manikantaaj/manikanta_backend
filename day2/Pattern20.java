package com.excel;

public class Pattern20 {
	
	/*         1
	 * 	     0 0 0
	 * 	   1 1 1 1 1 
	 *   0 0 0 0 0 0 0
	 * 1 1 1 1 1 1 1 1 1 1
	 */
	public static void main(String[] args)
	{
		int n=5;
		for(int i=1; i<=n; i++)
		{
			for(int j=1; j<n-i; j++)
			{
				
				
					System.out.print(" ");
				
			}
			for(int j=1; j<=i*2-1; j++)
			{
				if(i%2==0)
				{
					System.out.print("0");
				}
				else
				{
					System.out.print("1");
				}
				
			}
			System.out.println();
		}
	}
}

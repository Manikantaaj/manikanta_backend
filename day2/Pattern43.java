	class Pattern43()
	{
		/**
		 * * * * * * *
		 * *       * *
		 *   *   *   *
		 *     *     *
		 *   *   *   *
		 * *       * *
		 * * * * * * *
		 */
		int n=7;
		for(int i=0; i<n; i++)
		{
			for(int j=0; j<n; j++)
			{
				if(i==0 || j==0 || i==j || i==n-1 || j==n-1 || i+j==n-1 )
				{
					System.out.print(" *");
				}
				else
				{
					System.out.print("  ");
				}
			}
			System.out.println();
		}
	}

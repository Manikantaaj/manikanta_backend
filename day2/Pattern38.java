class Pattern38()
	{
		/**
   1 2 3 4 3 2 1 
     1 2 3 2 1 
       1 2 1 
         1 
       1 2 1 
     1 2 3 2 1 
   1 2 3 4 3 2 1 
		 */
		int n=7;
		int k,st=n,sp=0;
		for(int i=1;i<=n;i++)
		{
			for(int j=1;j<=sp;j++)
			{
				System.out.print("  ");
			}
			k=1;
			for(int j=1;j<=st;j++)
			{
				System.out.print(k+" ");
				if(j<=st/2)
					k++;
				else
					k--;
			}
			if(i<=n/2)
			{
				st=st-2;
				sp++;
			}
			else
			{
				st=st+2;
				sp--;
			}
			System.out.println();
		}
	}

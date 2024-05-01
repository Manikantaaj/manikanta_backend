class Pattern33
	{
		/**
	   5 4 3 2 1 4 3 2 1
		 4 3 2 1 3 2 1
		   3 2 1 2 1
		     2 1 2
		       1
		 */
		public static void main(String[] args)
		{
        for (int i=0; i<5; i++) {
            for (int j=0; j< i; j++) 
            {
                System.out.print("  ");
            }
            for (int j=5-i; j>=1; j--) 
            {
                System.out.print(j + " ");
            }
            for (int j=2; j<=5-i; j++) 
            {
                System.out.print(j + " ");
            }
            System.out.println();
        }
	}
	}





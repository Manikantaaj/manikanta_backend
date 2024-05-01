class Pattern35
	{
		/**
	    	 5
		   4 5 4
		 3 4 5 4 3
	   2 3 4 5 4 3 2
	 1 2 3 4 5 4 3 2 1
		 */
		 
		 public static void main(String[] args)
		{
		for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 2 * (5 - i - 1); j++) 
            {
                System.out.print(" ");
            }
            for (int j = 5 - i; j <= 5; j++) 
            {
                System.out.print(j + " ");
            }
            for (int j = 5 - 1; j > 5 - i - 1; j--) 
            {
                System.out.print(j + " ");
            }
            System.out.println();
        }
	}
	}

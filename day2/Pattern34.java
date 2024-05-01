class Pattern34
	{
		/**
		 1 2 3 4 5 4 3 2 1
		   1 2 3 4 3 2 1
		     1 2 3 2 1
		       1 2 1
		         1
		 */
		 public static void main(String[] args)
		{
	        for (int i = 1; i <= 5; i++) {
	            for (int j=1; j<i; j++) {
	                System.out.print("  ");
	            }
	            for (int k=1; k<=5-i+1; k++) {
	                System.out.print(k + " ");
	            }
	            for (int j=5-i; j>=1; j--) {
	                System.out.print(j + " ");
	            }
	            System.out.println();
	        }
	    }
	    }

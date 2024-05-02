package excelsoft.exception;

public class NestedTry {

	public static void main(String[] args) {
		try
		{
			try
			{
				int a=12/0;
				System.out.println(a);
			}
			catch(ArithmeticException e)
			{
				System.out.println(e);
			}
			try
			{
				String s = null;
				System.out.println(s);
			}
			catch(NullPointerException e)
			{
				System.out.println(e);
			}
			  System.out.println("other statement"); 
		
	}
		catch(Exception e)
		{
			System.out.println(e.getMessage());
		}
}
}

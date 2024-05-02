package excelsoft.exception;

public class Finallayblock {

	public static void main(String[] args)
	{
		try
		{
//			int n= 12/5;
//			System.out.println(n);
			
			int n= 10/0;
		}
		catch(NumberFormatException e)
		{
			System.out.println(e);
		}
		finally
		{
			System.out.println("Finally block executed");
		}
	}
}

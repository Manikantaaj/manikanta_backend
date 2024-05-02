package excelsoft.exception;

public class MultipleCatch {
	public static void main(String[] args)
	{
		try
		{
			int a =12/0;
			System.out.println(a);
		}
		catch(ArrayIndexOutOfBoundsException e)
		{
			System.out.println(e);
		}
		catch(ArithmeticException e)
		{
			System.out.println(e);
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
		
	}
}

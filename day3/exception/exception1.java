package excelsoft.exception;

public class exception1 {
	
	public static void main(String[] args)
	{
		
	try
	{
		int[] arr = new int[4];
		arr[6] = 6;
		String s = null ;
		System.out.println(s.length());
	}
	catch(NumberFormatException  e)
	{
		System.out.println(e);
	}
	catch(Exception e)
	{
		System.out.println(e.getMessage());
	}
	
}
}

class MultiA7 implements MultiPrintable,MultiShowable
{  
public void print()
{
System.out.println("Hello");
}  
public void show()
{
System.out.println("Welcome");
}  
  
public static void main(String args[])
{  
MultiA7 obj = new MultiA7();  
obj.print();  
obj.show();  
 }  
}  

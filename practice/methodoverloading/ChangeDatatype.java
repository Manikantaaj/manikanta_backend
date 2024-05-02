class ChangeDatatype
{
public int add(int a, int b)
{
return(a+b);
}
public double add(double a, double b, double c)
{
return(a+b+c);
}
public static void main(String[] args)
{
Adder c = new Adder();
System.out.println(c.add(2,3));
System.out.println(c.add(2,3,4));
}
}

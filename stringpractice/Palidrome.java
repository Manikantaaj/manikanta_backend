class Palidrome
{
public static void main(String[] args)
{
String str = "aba";
String s = "";
for(int i=str.length()-1; i>=0; i--)
{
s = s + str.charAt(i);
}
if(str.equals(s))
{
System.out.println("Is a Palidrome");
}
else
{
System.out.println("Not a Palidrome");
}
}
}


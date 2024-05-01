public class Test
{
public static void main(String[] args)
{
Account acc=new Account();
acc.setAccno(12345);
acc.setName("Mani");
acc.setAmount(3000);
System.out.println(acc.getAccno()+ "" + acc.getName()+ "" + acc.getAmount());
}
}

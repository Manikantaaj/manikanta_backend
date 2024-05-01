class Emp
{

int id;
String name;
Address address;

public Emp(int id, String name, Address address)
{

this.id = id;
this.name = name;
this.address = address;
}

public void display()
{

System.out.println(id + ""+ name);
System.out.println(address.city + ""+ address.state + "" + address.country);
}

public static void main(String[] args)
{
Address address1 = new Address("mandya", "KA", "IND");
Address address2 = new Address("mandya", "KA", "IND");

Emp e = new Emp(11, "Mani", address1);
Emp e2 = new Emp(12, "Manju", address2);

e.display();
e2.display();

}
}


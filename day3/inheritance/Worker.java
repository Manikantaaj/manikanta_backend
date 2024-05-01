class Worker extends Manager
{
String module="sub-module";

public void work()
{
System.out.println("Sub-module");
}

public static void main(String[] args)
{
Worker w = new Worker();
w.work();
w.projectName();

}
}

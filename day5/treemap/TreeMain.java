package excelsoft.treemap;

import java.util.Comparator;
import java.util.Scanner;
import java.util.Set;
import java.util.TreeMap;
import java.util.Map.Entry;

import excelsoft.treeset.Employee;

public class TreeMain {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
//		Comparator<Integer> com = Comparable :: compareTo;  method reference
		
		Comparator<Integer> com = new Comparator<Integer>() {
			
			@Override
			public int compare(Integer o1, Integer o2) {
				
				return (o1).compareTo(o2);
			}
		};
		
		TreeMap<Integer, Student> tm = new TreeMap<>(com);
		while(true)
		{
			System.out.println("Enter Student id");
			int id = sc.nextInt();
			System.out.println("Enter Student name");
			String name = sc.next();
			System.out.println("Enter Student city");
			String city = sc.next();
			
			tm.put(id, new Student(id, name, city));
			System.out.println("you want to add more Student");
			String res = sc.next();
			if(!res.equalsIgnoreCase("yes"))
				break;
		
		}
		sc.close();
		
		Set<Entry<Integer, Student>> entrySet = tm.entrySet();
		
		for(Entry<Integer, Student> entry : entrySet)
		{
			System.out.println(entry.getKey() + "===>" + entry.getValue());
		}
	}
}

package excelsoft.supplier;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;

public class ComsumerFunc {
	public static void main(String[] args) {
		
		Consumer<String> c = s -> System.out.println(s);
		Consumer<String> c1 = s -> System.out.println(s.length());
		
		c.accept("Mani");
		c1.andThen(c1).accept("Manju");
		
//		Consumer<Integer> display = a -> System.out.println(a);
//		
//		display.accept(10);
//		
//		Consumer<Integer> modify = list -> 
//		{
//			for(int i=0; i<list.length(); i++)
//			{
//				list.set(i, 2 * list.get(i));
//			}
//		};
//		
//		Consumer<List<Integer>> dispList = list -> list.stream().forEach(a -> System.out.print(a + " "));
//		
//		 List<Integer> list = new ArrayList<Integer>();
//	        list.add(2);
//	        list.add(1);
//	        list.add(3);
//	        
//	        modify.accept(list);
//	        
//	        dispList.accept(list);
	}
}

package excelsoft.supplier;

import java.util.function.Predicate;

public class PredicateFun {
	public static void main(String[] args) {
		Predicate<Integer> ls = i -> (i<18);
		System.out.println(ls.test(18));
	}
}

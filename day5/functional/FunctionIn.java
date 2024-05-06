package excelsoft.supplier;

import java.util.function.Function;

public class FunctionIn {
	public static void main(String[] args) {
		Function<String, Integer> f = s -> s.length();
		Function<String, String> f1 = s -> s.toUpperCase();
		
		System.out.println(f1.apply("manikanta"));
		
	}
}

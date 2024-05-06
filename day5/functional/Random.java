package excelsoft.supplier;

import java.util.function.Supplier;

public class Random {
	public static void main(String[] args) {
		Supplier<Double> rv = () -> Math.random();
		System.out.println(rv.get());
		}
}

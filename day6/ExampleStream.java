package excelsoft.streams;

import java.text.Collator;
import java.time.LocalDate;
import java.time.temporal.ChronoUnit;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class ExampleStream {

	public static void main(String[] args) {
		
		//Frequency of each character in string
//		String input = "abbcddkkans";
//		Map<Character, Long> collect = input.chars().mapToObj(c -> (char) c)
//				.collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));
//		System.out.println(collect);
//		
		//Separate odd and even number
//		List<Integer> listOfInteger = Arrays.asList(1, 2, 3, 4, 2, 6, 8);
//		Map<Boolean, List<Integer>> evens = listOfInteger.stream().collect(Collectors.partitioningBy(i -> i%2 == 0));
//		System.out.println(evens);
		
		//Remove duplicate elements from the list
//		List<String> listOfString = Arrays.asList("AA","BB","AA","CC");
//		List<String> duplicate = listOfString.stream().distinct().collect(Collectors.toList());
//		System.out.println(duplicate);
		
	//Frequency of each element in the array
//		List<Integer> listOfInteger = Arrays.asList(2,3,1,5,4,8,5);
//		Map<Integer, Long> freq = listOfInteger.stream().collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));
//		System.out.println(freq);
		
		
		//Sort the list in reverse order
//		List<Integer> listOfInteger = Arrays.asList(2,3,1,5,4,8,5);
//		listOfInteger.stream().sorted(Comparator.reverseOrder()).forEach(System.out :: println);
		
		//print multiple of 5 from the list
//		List<Integer> listOfInteger = Arrays.asList(2,3,1,5,4,8,5);
//		listOfInteger.stream().filter(i -> i%5 == 0).forEach(System.out :: println);
		
		//Merge two unsorted array into single sorted array
//		String[] a = {"2","3","1","5","4","8","5"};
//		String[] b = {"9","3","1","6","4","8","5"};
//		Object[] res = Stream.concat(Arrays.stream(a), Arrays.stream(b)).sorted().toArray();
//		System.out.println(Arrays.toString(res));
		
		//Merge two unsorted array into single sorted array without duplicate
//		String[] a = {"2","3","1","5","4","8","5"};
//		String[] b = {"9","3","1","6","4","8","5"};
//		Object[] res = Stream.concat(Arrays.stream(a), Arrays.stream(b)).distinct().sorted().toArray();
//		System.out.println(Arrays.toString(res));
		
		//Three max and min numbers in list
//		List<Integer> listOfInteger = Arrays.asList(2,3,1,5,4,8,5);
//		listOfInteger.stream().sorted().limit(3).forEach(System.out :: println);
//		//max of 3 numbers
//		listOfInteger.stream().sorted(Comparator.reverseOrder()).limit(3).forEach(System.out :: println);
		
		//Sort list of Strings in increasing order of their length
//		List<String> listOfInteger = Arrays.asList("adffd", "hgjt", "weter");
//		listOfInteger.stream().sorted(Comparator.comparing(String :: length)).forEach(System.out :: println);
		
		
		//sum and average of all elements of an array
//		int[] listOfInteger = {2,3,1,5,4,8,5};
//		long sum = Arrays.stream(listOfInteger).sum();
//		System.out.println(sum);
		//Average
//		double avg = Arrays.stream(listOfInteger).average().getAsDouble();
//		System.out.println(avg);
		
		//Reverse on integer array
//		int[] listOfInteger = {2,3,1,5,4,8,5};
//		int[] rev = IntStream.rangeClosed(1, listOfInteger.length).map(i -> listOfInteger[listOfInteger.length-1]).toArray();
//		System.out.println(Arrays.toString(rev));
		
		//join the list of strings with prefix, suffix, and delimiter
//		List<String> listOfString = Arrays.asList("adffd", "hgjt", "weter");
//		String res = listOfString.stream().collect(Collectors.joining("Delimiter", "Prefix", "Suffix"));
//		System.out.println(res);
		
		//Maximum and minimum is a list
//		List<Integer> listOfInteger = Arrays.asList(2,3,1,5,4,8,5);
//		int res = listOfInteger.stream().max(Comparator.naturalOrder()).get();
//		System.out.println(res);
		//minimum
//		int res1 = listOfInteger.stream().min(Comparator.naturalOrder()).get();
//		System.out.println(res1);
		
		//sum of all digit of number
//		List<String> listOfString = Arrays.asList("asw", "wqr", "tef");
//		Stream.of(String.valueOf(listOfString).split("")).collect(Collectors.summarizingInt(Integer :: parseInt));
		
		//Second largest number in an integer array
//		List<Integer> listOfInteger = Arrays.asList(3,1,6,4,9,10);
//		int res = listOfInteger.stream().sorted(Comparator.reverseOrder()).skip(1).findFirst().get();
//		System.out.println(res);
		
		//Common elements between two arrays
//		List<Integer> listOfInteger1 = Arrays.asList(3,1,6,4,9,10,7,45);
//		List<Integer> listOfInteger2 = Arrays.asList(3,1,6,4,9,10);
//		listOfInteger1.stream().filter(listOfInteger2::contains).forEach(System.out :: println);
		
		//Reverse each word of a string
//		List<String> str = Arrays.asList("aqsq", "qwwd", "qwd");
//		Arrays.stream(str.split(" ")).map(word -> newStringBuffer(word).reverse()).collect(Collectors.joining(" "));
		
		//Sum of first 10 natural number
//		int res = IntStream.range(1, 11).sum();
//		System.out.println(res);
		
		//find string which start with the number
//		List<String> str = Arrays.asList("1ass", "qdwq", "wed", "3qsd");
//		str.stream().filter(str1 -> Character.isDigit(str1.charAt(0))).forEach(System.out :: println);
		
		//Find the duplicate elements an array
		List<Integer> listOfInteger = Arrays.asList(2,3,1,3,2,4,5);
	Set<Integer> res = listOfInteger.stream().filter(i -> ! set.add(i)).collect(Collectors.toSet());
		
		//Last Element of an array
//		List<String> str = Arrays.asList("aqsq", "qwwd", "qwd");
//		String res = str.stream().skip(str.size()-1).findFirst().get();
//		System.out.println(res);
		
		//Age of person in year
//		LocalDate birthdate = LocalDate.of(1997, 11, 04);
//		LocalDate today = LocalDate.now();
//		System.out.println(ChronoUnit.YEARS.between(birthdate, today));
		
		//Fibonacci series
//		Stream.iterate(new int[] {0, 1}, f -> new int[] {f[1],f[0]+f[1]})
//		.limit(10).map(f-> f[0])
//		.forEach(i -> System.out.print(i + " "));
		
	}
}

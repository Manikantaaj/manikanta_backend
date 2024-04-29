package com.excel;
import java.util.Scanner;

public class ArrayScanner {
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter size of array");
		int size = sc.nextInt();
		int[] array = new int[size]; 
		System.out.println("Enter the number");
		for(int i=0;i<size;i++)
		{
			array[i] = sc.nextInt();
		}
		System.out.println("Read the numbers");
		for(int i=0;i<array.length;i++)
		{
			System.out.println(array[i]);
		}
		
	}
}

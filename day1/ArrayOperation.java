package com.excel;

import java.util.Arrays;
import java.util.Scanner;

public class ArrayOperation {
	
	//Create Array
	public void createArray(){
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter size of array");
		int size = sc.nextInt();
		int[] array = new int[size]; 
		System.out.println("Enter the number");
		for(int i=0;i<size;i++)
		{
			array[i] = sc.nextInt();
			
		}
		
	}
	
	//Print the Array
	public void printArray() {
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
	
	//Reverse the Array
	public void reverseArray() {
		int[] arr = {1,2,3,4,5};
		for(int i=0;i<arr.length;i++)
		{
			System.out.println(arr[i]);
		}
		System.out.println("Reverse the array");
		for(int i=arr.length-1;i>=0;i--)
		{
			System.out.println(arr[i]);
		}
	}
	
	//Sort the Array
	public void sortArray()
	{
		int[] number = {4,2,1,6,7};
		System.out.println("Sort the array list");
		for(int i=0; i<number.length;i++)
		{
			
			Arrays.sort(number);
			System.out.println(number[i]);
		}
	}
	
	
	//Maximum element in the array
	public void maxArray()
	{	
		int[] value = {12, 2, 23, 45, 9};
		System.out.println("Maximum value");
		int max=value[0];
		for(int i=0;i<value.length;i++)
		{
			if(value[i]>=max)
			{
				max=value[i];
				
			}
		}

			System.out.println(max);
	}
	
	
	//Minimum element in array
	public void minArray() {
		int[] num = {12, 2, 23, 45, 9};
		System.out.println("Minimum value");
		int min = num[0];
		for(int i=0;i<num.length;i++)
		{
			if(num[i]<=min)
			{
				min=num[i];
			}
		}
		System.out.println(min);
	}
	
	
	//Merge the Array
	public void mergeArray() {
		int[] arr1 = {1,2,3,4};
		int[] arr2 = {5,6,7,8};
		int m1 = arr1.length;
		int m2 = arr2.length;
		int[] res = new int[m1 + m2];
		System.out.println("Merged Array");
		for(int i=0; i<m1; i++)
		{
			res[i] = arr1[i];
		}
			for(int j=0; j<m2; j++)
			{
				res[m1+j]=arr2[j];
			}
			for(int i=0; i<res.length;i++)
			{
				
				System.out.println(res[i]);
			}
			
		}
		
	
	
	public void zigZagMergeArray()
	{
	   
	        int[] arr1 = {1, 2, 3, 4};
	        int[] arr2 = {5, 6, 7, 8};
	        int m1 = arr1.length;
	        int m2 = arr2.length;
	        int[] res = new int[m1 + m2];
	        System.out.println("Zig Zag Merged Array");

	   
	        for (int i = 0; i < m1; i++) {
	            res[i] = arr1[i];
	        }
	        for (int j = 0; j < m2; j++) {
	            res[m1 + j] = arr2[j];
	        }

	     
	        int i = 0;
	        int j = res.length - 1;
	        while (i <= j) {
	            System.out.print(res[i] + " ");
	            i++;
	            if (i <= j) {
	                System.out.print(res[j] + " ");
	                j--;
	            }
	        }
	    }
	
	
	//Union Array
	public void union()
	{
		int[] arr1 = {1,2,3,4};
		int[] arr2 = {4,5,7,8};
		int[] newArr = new int[arr1.length + arr2.length];
		int i=0, j=0, k=0;
		System.out.println("Union array");
		while(i < arr1.length && j < arr2.length)
		{
			if(arr1[i] == arr2[j])
			{
				newArr[k++] = arr1[i++];
				j++;
			}
			else if(arr1[i]< arr2[j])
			{
				newArr[k] = arr1[i];
				k++;
				i++;
			}
			else 
			{
				newArr[k] = arr2[j];
				k++;
				j++;
			}
		}
		
		while(i<arr1.length)
		{
			newArr[k] = arr1[i];
			k++;
			i++;
		}
		while(j<arr2.length)
		{
			newArr[k] = arr2[j];
			k++;
			j++;
		}
		for(int value : newArr)
		{
			if(value!=0)
			System.out.println(value);
		}
	}
	
	public void duplicateElement() {
		 int[] arr = {1,2,3,4,2,1,3,5,6,7};
		 System.out.println("Duplicate Element");
	        for(int i=0;i<arr.length-1;i++)
	        {
	            for(int j=i+1; j<arr.length;j++)
	            {
	                if(arr[i]==arr[j])
	                {
	                    System.out.println(arr[i]);
	                }
	            }
	        }
	}
	
	public void intersection()
	{
		int[] arr = {1, 2, 3, 4};
		int[] arr1 = {3, 4, 5, 6};
		int[] newArr = new int[arr.length + arr1.length];
		int i=0, j=0, k=0;
		System.out.println("Interscetion array");
		while(i<arr.length && j<arr1.length)
		{
			if(arr[i] == arr[j])
			{
				newArr[k++] = arr1[i++];
				j++;
			}
				else if (arr[i] < arr1[j]) {
                i++;
            } 
				else 
				{
                j++;
            }
        }
        System.out.println("Intersection:");
        for (int value = 0; value < k; value++) {
            if (newArr[value] != 0)
                System.out.println(newArr[value]);
        	}
		}
	
	public void removeDuplicateElement() {
		int arr[] = {1,2,3,4,5,1,2,3,7,8};
		int n = arr.length;
		int i, j;
		System.out.println("Removed Duplicate");
		for (i = 0; i < n; i++) 
		{
            for (j = 0; j < i; j++)
            {
                if (arr[i] == arr[j]) 
                {
                    break;
                }
            }
            if (i == j) 
            {
                System.out.println(arr[i] + " ");
               
            }
        }
    }
	
	public void occurrenceNumber() {
		
		int[] arr = {1,2,3,2,3,6};
		 Arrays.sort(arr);
	        int current = arr[0];
	        int count = 1;
	        for (int i = 1; i < arr.length; i++) {
	            if (arr[i] == current) {
	                count++;
	            } else {
	                System.out.println("Total occurrences of " + current + ": " + count);
	                current = arr[i];
	                count = 1;
	            }
	        }
	        System.out.println("Total occurrences of " + current + ": " + count);
	    }
	
	public int countPrime() 
	{
		 int n = 10;
	     int count = countPrime();
		boolean[] isPrime = new boolean[n];
        for (int i = 2; i < n; i++) {
            isPrime[i] = true;
        }
        for (int i = 2; i * i < n; i++) {
            if (isPrime[i]) {
                for (int j = i * i; j < n; j += i) {
                    isPrime[j] = false;
                }
            }
        }
        count = 0;
        for (int i = 2; i < n; i++) {
            if (isPrime[i]) {
                count++;
            }
        }
        System.out.println("Total prime numbers up to " + n + ": " + count);
        return count;
    }
	
	

	
		public static void main(String[] args)
	
	{
		ArrayOperation a = new ArrayOperation();
		a.createArray();
		
		a.printArray();

		a.reverseArray();
		
		a.sortArray();
		
		a.maxArray();
	
		a.minArray();
		
		a.mergeArray();
		
		a.union();
		
		a.duplicateElement();
		
		a.zigZagMergeArray();
		
		a.intersection();
		
		a.occurrenceNumber();
		
		a.countPrime();
		
	}
}

package excelsoft.string;

import java.util.Arrays;

public class StringPractice {

	public void isPalindrome()
	{
		

		String str = "aba";
		String s = "";
		System.out.println("Palidrome");
		for(int i=str.length()-1; i>=0; i--)
		{
		s = s + str.charAt(i);
		}
		if(str.equals(s))
		{
		System.out.println("Is a Palidrome");
		}
		else
		{
		System.out.println("Not a Palidrome");
		}
	}

	public void countEachCharacter()
	{
		String str="Manikanta";
		String sc = "";
		System.out.println("Count each character");
		for(int i=0;i<str.length();i++) 
		{
			int count=0; 
			for(int j=i; j<str.length();j++) 
			{
				if(str.charAt(i)==str.charAt(j)) 
				{
					count++;   
				}
			}
			String s = String.valueOf(str.charAt(i));
			if(!sc.contains(s))
			{
				sc=sc+str.charAt(i);
				System.out.println("Total number of count of occurance of "+str.charAt(i)+" is "+count);
			}         
		}
	}

	public void isAnagram()
	{
		String a="heart";
		String b="earth";
		
		char[]c=a.toCharArray();
		char []d=b.toCharArray();
		Arrays.sort(c);
		Arrays.sort(d);
		System.out.println("Anagram");
		if(Arrays.equals(c ,d)) 
		{
		System.out.print("Is a angram");
		}
		else 
		{
		System.out.print("not a anagram");
		}
	}

	public static boolean isPanagaram(String str){
		int[] freq = new int[26];
		str=str.toUpperCase();
		for(int i=0;i<str.length();i++)
		{
			freq[str.charAt(i)-65]++;
		}
		for(int i=0;i<freq.length;i++)
		{
			if(freq[i]==0)
			{
				return false;
			}}
		return true;
	}

	public void reverse()
	{
		String str = "Manikanta";
		String s = " ";
		System.out.println("Reverse the string");
		for(int i=str.length()-1; i>=0; i--)
		{
		s = s + str.charAt(i);
		}
		System.out.println(s);
	}

	public void countWords() 
	{
		 String words = "Hi how are you";
		 System.out.println("Count the words");
		    int countWords = words.split("\\s").length;
		    System.out.println("the total words are "+countWords);
		  
	}

	public static boolean isAllVowelsPresent(String str) 
	{
		for (int i = 0; i < str.length(); i++) 
		{
			char ch = str.charAt(i);
			if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') 
			{
				return true;
			}
		}
		return false;
	}

	public void countVowels()
	{
		String s = "Manikanta";
		int count = 0;
		System.out.println("Count Vowels");
		for(int i=0;i<s.length();i++) 
		{
		char c= s.charAt(i); c=Character.toUpperCase(c);
		if(c=='A'||c=='E'||c=='I'||c=='O'||c=='U') 
		{
		count++;
		}
		}
		System.out.println("No.of Vowels: "+count);	
		}


	public static void main(String[] args) 
	{

		StringPractice s = new StringPractice();

		s.isPalindrome();

		
		s.countEachCharacter();

		
		s.isAnagram();
		

		
		
		System.out.println(isPanagaram("Excelsoft"));

		
		s.reverse();

		
		s.countWords();

		
		
		System.out.println(isAllVowelsPresent("excelsoft"));

		
		s.countVowels();
	}

}


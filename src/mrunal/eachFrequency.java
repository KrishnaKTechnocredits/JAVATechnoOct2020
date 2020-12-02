package mrunal;
//Assignment No 17 : Find each character frequency ; frequency should be printed once 

import java.util.Scanner;
public class eachFrequency 
{
	
	void findFrequency(String word) 
	{
		int counter = 0;
		
		for (int i = 0; i < word.length(); i++) 
		{
			if( word.indexOf(word.charAt(i))==i)
			{
			for (int j = 0; j < word.length(); j++) 
			{
				if (word.charAt(i) == word.charAt(j) ) 
				{
					counter++;
				}
			}
			System.out.println( word.charAt(i) + " occured -> " + counter + " times");
			counter = 0;
			}
		}
	}
	public static void main(String[] args) 
	{
		eachFrequency frequency = new eachFrequency();
		
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter String : ");
		
		String s = scanner.next();
		frequency.findFrequency(s);
		scanner.close();
	}
}
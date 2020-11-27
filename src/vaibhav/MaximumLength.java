package vaibhav;

import java.util.Scanner;

public class MaximumLength {
	int max;

	String getMaxLengthName(String [] names) {
		//System.out.println("length of Array is "+names.length);
		max = names[0].length();
		String maxName=names[0];
		
		for (int index = 0; index < names.length; index++){
			if(names[index].length() > max) {
				maxName=names[index];
				max=names[index].length();
			}			
			else
				continue;		
		}
		return maxName;
		
	}
	
	void display(String maximumStr) {
		System.out.print("Even number from given string ");
		for(int index = 0 ;index < maximumStr.length(); index++) {			
			System.out.print(""+maximumStr.charAt(index));
			index++;
			
		}		
	}
	
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the length of an Array :");
		int length=scanner.nextInt();
		String [] names=new String[length];
		for(int index =0; index < length;index++) {
			System.out.println("Enter the "+(index+1)+" String");
			names[index]=scanner.next();			
		}
		MaximumLength maximumLength = new MaximumLength();
		String maximumName=maximumLength.getMaxLengthName(names);
		System.out.println("Maximum name is "+maximumName+" with length "+maximumLength.max);
		maximumLength.display(maximumName);
	}

}

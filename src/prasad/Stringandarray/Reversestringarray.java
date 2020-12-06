package prasad.Stringandarray;

import java.util.Scanner;

public class Reversestringarray {
	
	void reverseprint(String[]array){
		String[]reverse = new String[array.length];
		for(int i=array.length-1 , j=0 ; i>=0 && j<reverse.length; i--,j++) {
			reverse[j]=array[i];
	}
		System.out.println("Printing reverse of given array:-");
		for(int i=0;i<reverse.length;i++) {
				if(i<reverse.length-1)
				System.out.print(reverse[i]+ " , ");
				else
				System.out.print(reverse[i]);
	}
}
	void inputarray() {
		Scanner scanner = new Scanner(System.in);
		System.out.println("How many words do you want to pass in the string array? ");
		int count = scanner.nextInt();
		String [] words = new String[count];
		for(int index0 = 0;index0<count;index0++) {
			System.out.println("Please enter a word:");
			String word = scanner.next();
			words[index0]=word;
		}
		System.out.println("Given string array:-");
		for(int index=0;index<words.length;index++) {
			if(index<words.length-1)
				System.out.print(words[index]+ " , ");
			else 
				System.out.println(words[index]);
		}
		System.out.println(" ");
		reverseprint(words);
}
		
	public static void main(String[]arg) {
		Reversestringarray reversestringarray = new Reversestringarray();
		reversestringarray.inputarray();
	}
}

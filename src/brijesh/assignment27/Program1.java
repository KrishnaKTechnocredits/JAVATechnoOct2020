package brijesh.assignment27;

import java.util.Arrays;

/*
print all the words which does't have any digit. 
String[] input = {"Masgj3Pw", "r4fsjk","techno","sfjk44lk"};
output : techno
*/

public class Program1 {
	void printWordsWithoutDigit(String[] input) {
		System.out.println("Given String Array: "+Arrays.toString(input));
		System.out.println("Words which doesn't have any digit: ");
		for(int index=0; index <input.length; index++) {
			if(!isWordContainsDigit(input[index]))
				System.out.println(input[index]);
		}
	}
	
	boolean isWordContainsDigit(String string) {
		for(int index=0; index<string.length(); index++) {
			if(Character.isDigit(string.charAt(index)))
				return true;
		}
		return false;
	}
	
	public static void main(String[] args) {
		String[] input = {"Masgj3Pw", "r4fsjk","techno","sfjk44lk", "Masala@ty", "value&56"};
		new Program1().printWordsWithoutDigit(input);
	}
}

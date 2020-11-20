package anurag;

//Assignment 15

//Java Program to Count the Number of Vowels in user defined string.

//Input : technocredits
//output : vowels are e , o, i 

public class Vowel {

	void display(String arr[]) {

		for (int index = 0; index < arr.length; index++) {

			for (int j = 0; j < arr[index].length(); j++) {

				if (arr[index].charAt(j) == 'a' || arr[index].charAt(j) == 'e' || arr[index].charAt(j) == 'i'
						|| arr[index].charAt(j) == 'o' || arr[index].charAt(j) == 'u') {

					System.out.println(arr[index].charAt(j));

				}
			}

		}

	}

	public static void main(String[] args) {

		String str[] = { "technocredits" };

		Vowel vowel = new Vowel();
		vowel.display(str);

	}

}

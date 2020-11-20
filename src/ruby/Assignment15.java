package ruby;

public class Assignment15 {

	/*Program 1 : [ Compulsory ] Find the frequency of character from a given
	 * String array. [Estimated time: 15-20 mins] sample input array : {
	 * "technocredits","elephant","earthear"} and char is 'e' output : technocredits
	 * -> 2 elephant -> 2 earth -> 1 Total occurrence of e -> 5*/

	int findCharFreq(String input, char ch) {
		int count = 0;
		for (int index = 0; index < input.length(); index++) {
			if (input.charAt(index) == ch)
				count++;
		}
		System.out.println(ch + "->" + count);
		return count;
	}

	void charFreqInArray(String[] arr, char ch) {
		int total = 0;
		for (int index = 0; index < arr.length; index++) {
			int num = findCharFreq(arr[index], ch);
			total = total + num;
		}
		System.out.println("Total occurrence of e " + total);
	}

	/*Program 5 : [ Compulsory ] Java Program to Count the Number of Vowels in user defined string.
	 * Input : technocredits output : vowels are e , o, i*/
	void findVowels(String word) {
		for (int index = 0; index < word.length(); index++) {
			if (index == word.indexOf(word.charAt(index)))
				if (word.charAt(index) == 'a' || word.charAt(index) == 'e' || word.charAt(index) == 'i'
						|| word.charAt(index) == 'o' || word.charAt(index) == 'u')
					System.out.print(word.charAt(index) + " ");
		}
	}

	/* Program 2: [ Optional ] Create a class where you need to check given number
	 * is there in predefined array or not, if present then print frequency of the
	 * number. [Estimated time: 15 mins] Input : Predefined array ->
	 * {10,3,9,-99,81,3,-11} Number to be check -> 33 Output : Given number 33 is
	 * not present in predefined array
	 */

	void findNumber(int[] arr, int num) {
		System.out.println();
		System.out.println("Number present or not");
		boolean flag = false;
		int cnt = 0;
		for (int index = 0; index < arr.length; index++) {
			if (num == arr[index]) {
				cnt++;
				flag = true;
			}
		}
		if (flag)
			System.out.println("Number is present " + cnt + " times in array");
		else
			System.out.println("Number is not present");
	}
	
/*	Program 3 :  [ Optional ]
You need to store user input in array and do sum of even numbers only from created array. [ideal Expected Time : 10 mins, Max Time : 15 mins]
    	Example : Input : {10,5,7,3,1,5,9,30}
   				Output: 40*/
	
	void sumOfEvenNum(int[] input) {
		int sum=0;
		for(int index=0; index<input.length;index++) {
			if(input[index]%2==0) {
				sum=sum+input[index];
			}	
		}System.out.println("Sum of Even Numbers is: "+sum);
	}
	

	public static void main(String[] args) {
		Assignment15 assign = new Assignment15();
		String[] arr = { "technocredits", "elephant", "earth" };
		assign.charFreqInArray(arr, 'e');
		System.out.print("Vowels in the given words are ");
		assign.findVowels("technocredits");
		int[] num = { 10, 3, 9, -99, 81, 3, -11 };
		assign.findNumber(num, 33);
		int[] arrNum = {10,5,7,3,1,5,9,30};
		assign.sumOfEvenNum(arrNum);
		
	}
}

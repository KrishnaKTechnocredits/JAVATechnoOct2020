package nagendra.string;

/*
Program 1: sum of all numbers from give string.  
String msg = I have 15 years and 2 months of experience.
*/
public class SumOfNumbers {

	void getSumOfNumbers(String words) {
		String[] word = words.split(" ");
		boolean flag = false;
		int totalSum = 0;
		String input = "";
		for (int i = 0; i < word.length; i++) {
			flag = false;
			for (int j = 0; j < word[i].length(); j++) {
				if (Character.isDigit(word[i].charAt(j))) {
					flag = true;
					input += word[i].charAt(j);
				}
			}
			if (flag)
			totalSum += Integer.parseInt(input);
			input = "";
		}
		System.out.println("Total Sum of Numbers is : " + totalSum);
	}

	public static void main(String[] args) {
		
		SumOfNumbers number=new SumOfNumbers();
		String msg = "I have 15 years and 2 months of experience  ";
		number.getSumOfNumbers(msg);
	}

}

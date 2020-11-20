package tejashree;
import java.util.Scanner;

class NoOfCharInString {

	void findFrequency(String word, char ch) {
		int cnt = 0;
		for (int index = 0; index < word.length(); index++) {
			if (word.charAt(index) == ch) {
				cnt++;
			}
		}
		if(cnt>0) 
			System.out.println("char" + "'" + ch + "'" + "is repeated " + cnt + " times");
		else
			System.out.println("character is not present in a string");
	}
	public static void main(String[] args) {
		NoOfCharInString noOfCharInString = new NoOfCharInString();
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a string");
		String userInput = sc.next();
		
		System.out.println("Enter character");
		String temp=sc.next();
		int count=1;
		while(temp.length()!=1 && count<3) {
			System.out.println("you have entered wrong character..please re-enter");
			System.out.println("attemptsleft"+(3-count));
			temp=sc.next();
			count++;
		}
		if(temp.length()!=1)
			System.out.println("Try sometime later");
		else {
			char ch = temp.charAt(0);
			System.out.println("char is "+ch);
			noOfCharInString.findFrequency(userInput, ch);
		}
	}

}
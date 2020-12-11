package ruby;
/*Assignment 34: [complete it before 4th Dec EOD] 

Program 1:  verify string is palindrom or not.
input : naman
output : naman is a palindrom string.
input : techno
output : techno is not a palindrom string.

Program 2: verify number is palindrom or not.
input : 121121*/

public class Assignment34 {

	void verifyPalindromWord(String word) {
		System.out.println("Input : "+word);
		word=word.toLowerCase();
		String revWord = "";
			for (int j = word.length() - 1; j >= 0; j--) {
				char ch = Character.toLowerCase(word.charAt(j));
					revWord +=ch;			
				} 
		if(word.equals(revWord)) {
			System.out.println("Output: "+word+" is palindrom");
		}
		else
			System.out.println("Output: "+word+" is not palindrom");
	}

	void verifyPalindromNum(int num) {
		System.out.println("Input: "+num);
		int revNum = 0, temp = num;
		while (temp > 0) {
			int digit = temp % 10;
			temp = temp / 10;
			revNum = (revNum * 10) + digit;
		}
		if (num == revNum) {
			System.out.println("Output: " + num + " is Palindrom number");
		} else
			System.out.println("Output: " + num + " is not Palindrom number");
	}

	public static void main(String[] args) {
		Assignment34 assign = new Assignment34();
		assign.verifyPalindromNum(121121);
		String word = "NamAn";
		assign.verifyPalindromWord(word);
		word = "tecHnO";
		assign.verifyPalindromWord(word);
	}
}

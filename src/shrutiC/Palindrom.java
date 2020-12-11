package shrutiC;

public class Palindrom {

	boolean isPalindrom(String word) {
		word = word.toLowerCase();
		for (int i = 0, j = word.length() - 1; j > i; i++, j--) {
			if (word.charAt(i) != word.charAt(j))
				return false;
		}
		return true;
	}

	void checkIfStringPalindrom(String word) {
		if (isPalindrom(word))
			System.out.println(word + " is Palindrom");
		else
			System.out.println(word + " is not Palindrom");

	}
	
	void checkIfNumPalindrom(int num) {
		
		String word = Integer.toString(num);
		if (isPalindrom(word))
			System.out.println(word + " is Palindrom");
		else
			System.out.println(word + " is not Palindrom");

	}

	public static void main(String[] args) {

		Palindrom object = new Palindrom();
		object.checkIfStringPalindrom("Radar");		
		object.checkIfStringPalindrom("naman");
		
		System.out.println("------------------------------------------------------");

		object.checkIfNumPalindrom(121121);
		object.checkIfNumPalindrom(12423);
		
	}

}

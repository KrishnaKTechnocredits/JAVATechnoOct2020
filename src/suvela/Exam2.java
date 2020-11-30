/*WAP for below given requirement. [30][45]
input : teCh@N12JCR#iT8s_B*/
package suvela;

public class Exam2 {
	static int digitcount;
	static int lettercount;
	static int uppercount;
	static int lowercount;
	static int specialcount;

	boolean isDigit(char ch) {
		if (Character.isDigit(ch) == true)
			digitcount++;
		return false;
	}

	boolean isLetter(char ch) {
		if (Character.isLetter(ch) == true)
			lettercount++;
		return false;
	}

	boolean isUppercase(char ch) {
		if (Character.isUpperCase(ch) == true)
			uppercount++;
		return false;
	}

	boolean isLowercase(char ch) {
		if (Character.isLowerCase(ch) == true)
			lowercount++;
		return false;
	}

	boolean isChar(char ch) {
		if (Character.isDigit(ch) == false && Character.isLetter(ch) == false)
			specialcount++;
		return false;

	}

	void print() {
		System.out.println("Total digits: "+digitcount);
		System.out.println("Total letters: "+ lettercount);
		System.out.println("Total uppercase letters: " +uppercount);
		System.out.println("Total Lowercase letters: "+lowercount);
		System.out.println("Total special characters: "+specialcount);
	}
	public static void main(String[] args) {
		String word = "teCh@N12JCR#iT8s_B";
		Exam2 exam = new Exam2();
		for (int index = 0; index < word.length(); index++) {
			char ch = word.charAt(index);
			exam.isDigit(ch);
			exam.isLetter(ch);
			exam.isUppercase(ch);
			exam.isLowercase(ch);
			exam.isChar(ch);
		}
		exam.print();
	}
}

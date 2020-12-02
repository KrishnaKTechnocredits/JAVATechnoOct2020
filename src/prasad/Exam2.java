package prasad;

public class Exam2 {
	int isdigit=0;
	int isletter=0;
	int isupper=0;
	int islower=0;
	int isspecial=0;
	
	void compare(String word) {
		for(int index=0;index<word.length();index++) {
			char ch = word.charAt(index);
			if(Character.isDigit(ch))
				isdigit++;
			else if(Character.isLetter(ch)) {
				isletter++;
			 if(Character.isUpperCase(ch))
				isupper++;
			else 
				islower++;
			}else
				isspecial++;
		}
		System.out.println(word);
		System.out.println("Letters: " + isletter);
		System.out.println("Digits: " + isdigit);
		System.out.println("Upper case: " + isupper);
		System.out.println("Lower case: " + islower);
		System.out.println("Special character: " + isspecial);
	}
	
	public static void main(String[]arg) {
		Exam2 exam2 = new Exam2();
		String word = "teCh@N12JCR#iT8s_B";
		exam2.compare(word);
	}

}

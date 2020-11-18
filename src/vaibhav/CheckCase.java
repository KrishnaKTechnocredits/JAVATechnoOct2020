package vaibhav;

public class CheckCase{

	public static void findCase(String givenString) {
		int lCase = 0;
		int iletter = 0;
		int uCase =0;
		int digit = 0;
		int sCase = 0;				
		for(int index = 0;index < givenString.length();index++) {
			if(Character.isLetter(givenString.charAt(index))){
				iletter++;
			}
			if(Character.isLowerCase(givenString.charAt(index))){
				lCase++;
			}
			else if(Character.isUpperCase(givenString.charAt(index))){
				uCase++;
			}
			else if(Character.isDigit(givenString.charAt(index))){
				digit++;
			}
			else
				sCase++;
		}
		System.out.println("Total Letters "+iletter);
		System.out.println("uppercase "+uCase);
		System.out.println("Lowercase "+lCase);
		System.out.println("digit "+digit);
		System.out.println("Special "+sCase);
	}

	public static void main(String[] args) {		
		String givenString = "teCh@N12JCR#iT8s_B";
		CheckCase.findCase(givenString);	
	}
}

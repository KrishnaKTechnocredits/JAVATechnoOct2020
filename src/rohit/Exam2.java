package rohit;

public class Exam2 {
int uppercase,lowercase,letters,digits,specialcharacter;
void letter(String str) {
		for (int i = 0; i < str.length(); i++) {
		char ch = str.charAt(i);
		if(Character.isLetter(ch))
                letters++;
}
System.out.println("Number of letters present in the provided string is- "+letters);
}

void uppercase(String str) {
		for (int i = 0; i < str.length(); i++) {
		char ch = str.charAt(i);
		if(Character.isUpperCase(ch))
                uppercase++;
}
System.out.println("Number of uppercase character present in the provided string is- "+uppercase);
}

void lowercase(String str) {
		for (int i = 0; i < str.length(); i++) {
		char ch = str.charAt(i);
		if(Character.isLowerCase(ch))
                lowercase++;
}
System.out.println("Number of lowercase character present in the provided string is- "+lowercase);
}

void digit(String str) {
		for (int i = 0; i < str.length(); i++) {
		char ch = str.charAt(i);
		if(Character.isDigit(ch))
                digits++;
            }        
		System.out.println("Number of digits present in the provided string is- "+digits);		
	}

private void specialcharacter(String str) {
	for (int i = 0; i < str.length(); i++) {
		char ch = str.charAt(i);
		if(!Character.isDigit(ch) && !Character.isLetter(ch))
                specialcharacter++;
            }        
		System.out.println("Number of specialcharacters present in the provided string is- "+specialcharacter);		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Exam2 exam2=new Exam2();
		String str="teCh@N12JCR#iT8s_B#$@#$";
		exam2.letter(str);
exam2.uppercase(str);
exam2.lowercase(str);
exam2.digit(str);
exam2.specialcharacter(str);
		
	}
}

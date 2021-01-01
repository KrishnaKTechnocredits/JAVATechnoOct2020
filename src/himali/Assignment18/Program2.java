package himali.Assignment18;

import java.util.Scanner;

public class Program2 {

	void rearrangeString(String word) {
		String digits="";
		String capitalLetters="";
		String smallLetters="";
		String specialchar="";
		for(int i=0;i<word.length();i++) {
			char ch=word.charAt(i);
			if(Character.isLetter(ch)) {
				if(Character.isUpperCase(ch))
				capitalLetters+=ch;
				if(Character.isLowerCase(ch))
					smallLetters+=ch;
			}
			else if(Character.isDigit(ch))
				digits+=ch;
			else 
				specialchar+=ch;
		} 
			
		System.out.println("Rearranged String : "+digits+capitalLetters+smallLetters+specialchar);
	}
	
	public static void main(String[] args) {
		Program2 program2=new Program2();
		
		System.out.println("Please Enter a String");
		Scanner sc= new Scanner(System.in);
		String input=sc.next();
		program2.rearrangeString(input);
		sc.close();
	}

}



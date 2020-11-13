package mrunal;

public class stringExam 
{
	 int upper, lower , letter , digit , special ;
	 
	void displayLetterCount(String word) 
	{
		for(int index=0; index < word.length(); index++) 
		{
			char ch = word.charAt(index);	
			if(Character.isLetter(ch))
				letter++;
		}
		System.out.println("Total Letter Count is :"+ letter);
	}

	void displayUpperCaseCount(String word) 
	{
		for(int index=0; index < word.length(); index++) 
		{
			char ch = word.charAt(index);	
			if(Character.isUpperCase(ch))
				upper++;
		}

		System.out.println("UpperCase Count is :"+ upper);
	}

	void displayLowerCaseCount(String word) 
	{
		for(int index=0; index < word.length(); index++) 
		{
			char ch = word.charAt(index);	
			if(Character.isLowerCase(ch))
				lower++;
		}
		System.out.println("LowerCase Count is :"+ lower);
	}

	void displyaDigitCount(String word) 
	{
		for(int index=0; index < word.length(); index++) 
		{
			char ch = word.charAt(index);	
			if(Character.isDigit(ch))
				digit++;
		}
		System.out.println("Digitcount is :"+ digit);
	}

	void displaySpecialCharactercount(String word) 
	{
		for(int index=0; index < word.length(); index++) 
		{
			char ch = word.charAt(index);	
			if(!Character.isLetter(ch) && !Character.isDigit(ch))
				special++;
		}
		System.out.println("SpecialCharacter Count is :"+ special);
	}

	public static void main(String[] args) {

		String word = "teCh@N12JCR#iT8s_B";

		stringExam se = new stringExam();
		se.displayLetterCount(word);
		se.displayUpperCaseCount(word);
		se.displayLowerCaseCount(word);
		se.displyaDigitCount(word);
		se.displaySpecialCharactercount(word);

	}

}

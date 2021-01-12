package surbhi;
import java.util.Arrays;

/*
Convert UpperCase into a LowerCase using ASCII 
Given String = "TechnoCreditS"
Expected String = "technocredits"*/

public class Assignment31 {

	void convertCaseUsingAscii(String string) {
		System.out.println("Given String: " + string);
		String newString = "";
		for (int index = 0; index < string.length(); index++) {
			char character = string.charAt(index);
			if (character >= 65 && character <= 90)
				newString += (char) (character + 32);
			else if (character >= 97 && character <= 122)
				newString += (char) (character - 32);
			else
				newString += character;
		}
		System.out.println("Updated String: " + newString);
		System.out.println("******************************************************");
	}

	public static void main(String[] args) {
		Assignment31 convertCase = new Assignment31();
		convertCase.convertCaseUsingAscii("TechNoCreditss124%");
		convertCase.convertCaseUsingAscii("This is Technocredits class");
	}
}

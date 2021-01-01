package nitin.Exam;
import java.util.Scanner;
public class Exam2 {

	void findCount(String word) {
		int letterCount=0,upperCount=0,lowerCount=0,digitCount=0,specialCount=0;
		for(int index=0;index<word.length();index++) {
			char ch=word.charAt(index);
			if(Character.isDigit(ch)) {
				digitCount++;
				}else if(Character.isLetter(ch)) {
					letterCount++;
					if(Character.isUpperCase(ch)) 
						upperCount++;
					else
						//(Character.isLowerCase(ch)) 
						lowerCount++;
				}else
					specialCount++;
		}
		System.out.println(" Digit : "+digitCount+",\n Letter :"+letterCount+",\n UpperCase Characters : "+upperCount+",\n LowerCase Characters : "+lowerCount+"\n and SpecialCase Characters : "+specialCount);
	}
	public static void main(String[] args) {
		Exam2 exam2 = new Exam2();
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the word : ");
		String name=sc.next();
		exam2.findCount(name);
		sc.close();
	}
}

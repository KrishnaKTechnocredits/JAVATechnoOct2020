package nagendra;

import java.util.Scanner;

/*
Java Program to Count the Number of Vowels in user defined string.
Input : technocredits
output : vowels are e , o, i 

*/
public class VowelsInString {
	
	void findVowelsInString(String userInput){
		int a = 0,e = 0,i = 0,o = 0,u = 0;
		for(int index=0;index<userInput.length();index++){
			char ch=userInput.charAt(index);
			switch(ch){
			  
			case 'a':
				a++;
				if(a==1)
				System.out.println("The Available vowels are "+ch);
				break;
			case 'e':
				e++;
				if(e==1)
				System.out.println("The Available vowels are "+ch);
				break;
			case 'i':
				i++;
				if(i==1)
				System.out.println("The Available vowels are "+ch);
				break;
			case 'o':
				o++;
				if(o==1)
				System.out.println("The Available vowels are "+ch);
				break;
			case'u':
				u++;
				if(u==1)
				System.out.println("The Available vowels are "+ch);
				break;
			}
		}
		
	}

	public static void main(String[] args) {
		VowelsInString object=new VowelsInString();
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter The String   ");
		String unserInput = scanner.next();
		object.findVowelsInString(unserInput);
		scanner.close();

	}

}

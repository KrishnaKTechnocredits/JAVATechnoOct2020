package nagendra;

import java.util.Scanner;

/*
max repeating word with its freq.
input : Hi Hello Hi Techno Hello Hi
output : Hi -> 3
*/
public class StringWordFrequency {
	
	void getRepeatedWord(String[] input,String word){
		int counter=0;
		for(int i=0;i<input.length;i++){
			if(input[i].equals(word))
				counter++;
		}
		System.out.println(""+word+"-->"+counter);	
	}

	public static void main(String[] args) {
		StringWordFrequency frequency=new StringWordFrequency();
		Scanner scanner =new Scanner(System.in);
		System.out.println("Enter The String ");
		String userInput=scanner.nextLine();
		System.out.println("Enter The Word");
		String word=scanner.next();
		System.out.println("<------Repeated Word in The String is  -------->");
		frequency.getRepeatedWord(userInput.split(" "),word);
	    scanner.close();
	}
}

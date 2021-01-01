package himali;


import java.util.Scanner;

public class Assignment17 {
	void freqOfEachChar(String word) {
		
		for(int i=0;i<word.length();i++) {
			int count=0;
			char ch=word.charAt(i);
			if (word.indexOf(ch) == i) {
				for (int index = 0; index < word.length(); index++) {
					if (word.charAt(index) == ch)
						count++;
				}
				System.out.println(ch + "->" + count);
			}
		}
	
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Assignment17 freq=new Assignment17();
		System.out.println("Ente the string :");
		Scanner sc=new Scanner(System.in);
		String word=sc.next();
		freq.freqOfEachChar(word);
		

	}

}


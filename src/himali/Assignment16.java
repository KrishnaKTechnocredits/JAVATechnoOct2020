package himali;


import java.util.Scanner;

public class Assignment16 {
	void freqOfEachChar(String word) {
		
		for(int i=0;i<word.length();i++) {
			int count=0;
			for(int j=0;j<word.length();j++) {
				char ch=word.charAt(j);
				if(word.charAt(i)==ch)
					count++;
			}
			System.out.println(word.charAt(i)+"--->" +count);
		}
	
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Assignment16 freq=new Assignment16();
		System.out.println("Ente the string :");
		Scanner sc=new Scanner(System.in);
		String word=sc.next();
		freq.freqOfEachChar(word);
		

	}

}


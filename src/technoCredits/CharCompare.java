package technoCredits;

import java.util.Scanner;

public class CharCompare {
	public static void main(String[] args) {
		char ch = 'a';
		int count = 0;
		if(ch == 'A' || ch == 'a')
			count++;
		System.out.println("count is " + count);
		Scanner sc = new Scanner(System.in);
		String input  = sc.nextLine();
		System.out.println(input);
	}
}
//Maulik Kanani

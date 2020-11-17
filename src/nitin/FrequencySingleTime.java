package nitin;
/* Assignment 17 : WAP Same as Assignment 16 but each frequency should be printed single time.
input : aakanksha
output : 		a -> 4
              	k -> 2
              	n -> 1
              	s -> 1
              	h -> 1*/
import java.util.Scanner;

public class FrequencySingleTime {
	public void frequencySingleTime(String word) {
		for(int outer=0;outer<word.length();outer++){
			char ch= word.charAt(outer);
			int count=0;
			for(int inner=0;inner<word.length();inner++) {
				if(word.charAt(inner)==ch && outer==word.indexOf(ch))
					count++;
			}
			if(count>0)
				System.out.println("'"+ch+"' as a character comes "+count+" times in the given word." );
		}
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Please enter a word :");
		new FrequencySingleTime().frequencySingleTime(sc.next());
		sc.close();
	}
}

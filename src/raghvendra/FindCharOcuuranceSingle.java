package raghvendra;
/*Assignment 17 : 13th Nov'2020 

Same as Assignment 16 but each frequency should be printed single time.
input : aakanksha
output : a -> 4
              k -> 2
              n -> 1
              s -> 1
              h -> 1*/
import java.util.Scanner;
public class FindCharOcuuranceSingle {

	void findCharacterInStringSingle(String rr) {
		int count=0;
		int i=0;
		for(int index=0;index<rr.length();index++) {
			char ch=rr.charAt(index);
			i=rr.indexOf(ch);
			if (index==i) {
				for(int inner=0;inner<rr.length();inner++) {
					if(rr.charAt(inner)==ch)
						count++;
			}
				System.out.println("Character "+ch+" ocuurance "+count+" times");
				count=0;
			}
		}
	}
	public static void main(String[] args) {
		FindCharOcuuranceSingle findCharOcuuranceSingle=new FindCharOcuuranceSingle();
		System.out.println("Enter String");
		Scanner sc=new Scanner(System.in);
		String name=sc.next();
		findCharOcuuranceSingle.findCharacterInStringSingle(name);
	}
}

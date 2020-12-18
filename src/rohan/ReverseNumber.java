package rohan;

import java.util.Scanner;

import org.omg.Messaging.SyncScopeHelper;

/* 
Program 1: return a reserve number.
input : 1234
output : 4321
 */

public class ReverseNumber {
	
	public static void main(String[] args) {
		ReverseNumber reverseNumber = new ReverseNumber();
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number to reverse: ");
		int num = sc.nextInt();
		System.out.println("Reverse number: "+reverseNumber.getReverseNumber(num));
		sc.close();
	}
	
	int getReverseNumber(int num) {
		int rno=0,tmp=0;
		do {
			tmp = num%10;
			rno = (rno*10)+tmp;
			num = num/10;
		}while(num>0);
		return rno;
	}
}

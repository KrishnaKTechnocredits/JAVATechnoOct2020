package prasad;
import java.util.Scanner;

public class FebonacciSeries {
	
	void feboSeries(int n) {
		int temp1=0;
		int temp2=1;
		int ans=0;
		int count=0;
		
		int max=n-2;
		while(count<=max) {
			if(count==0) {
				System.out.print(temp1+" "+temp2+ " ");
				count++;
			}
			else {
				ans=temp1+temp2;
				System.out.print(ans+" ");
				temp1=temp2;
				temp2=ans;
				count++;
			}
		}
			
	}
	
	public static void main(String[]arg) {
		FebonacciSeries febonacciseries = new FebonacciSeries();
		Scanner scanner = new Scanner(System.in);
		System.out.println("Printing first Nth elements of febonacci series, please enter N:- ");
		int n = scanner.nextInt();
		febonacciseries.feboSeries(n);
	}

}

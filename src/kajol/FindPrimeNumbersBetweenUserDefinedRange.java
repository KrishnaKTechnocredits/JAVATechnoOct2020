/*Assignment-22 : 18th Nov'2020 
Print all prime numbers between 2 to 100*/

package kajol;

import java.util.Scanner;

public class FindPrimeNumbersBetweenUserDefinedRange {
	
	void findPrimeNumbers(int start,int end) {
		System.out.println("Prime Numbers Between "+start+" and "+end+" :");
		for(int index=start;index<=end;index++) {
			boolean flag=true;
			for(int innerIndex=2;innerIndex<=Math.sqrt(index);innerIndex++) {
				if(index%innerIndex==0)
					flag=false;
			}
			if(flag)
				System.out.print(index+" ");
		}
	}
	
	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
		System.out.println("Please provide Range for finding Prime Numbers:");
		System.out.println("Start: ");
		int start=scanner.nextInt();
		System.out.println("End: ");
		int end=scanner.nextInt();
		new FindPrimeNumbersBetweenUserDefinedRange().findPrimeNumbers(start, end);;
		scanner.close();		
	}

}

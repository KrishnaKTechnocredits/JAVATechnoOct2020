/*Print all prime numbers between 2 to 100*/

package vishakha;

import java.util.Scanner;

public class FindPrimeNos {
	
	void findPrimeNos(int startIndex, int endIndex){
		for(int i=startIndex; i<=endIndex; i++){
			boolean flag = true;
			for(int innerIndex=2; innerIndex<(Math.sqrt(i)); innerIndex++){
				if(i%innerIndex == 0)
					flag = false;
			}
			if(flag)
				System.out.print(" "+i);
		}
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter start no");
		int startIndex = sc.nextInt();
		System.out.println("Enter end no");
		int endIndex = sc.nextInt();
		new FindPrimeNos().findPrimeNos(startIndex, endIndex);
	}
}

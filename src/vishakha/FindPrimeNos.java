/*Print all prime numbers between 2 to 100*/

package vishakha;

import java.util.Scanner;

public class FindPrimeNos {
	
	void findPrimeNos(int startIndex, int endIndex){
		for(int i=startIndex; i<=endIndex; i++){
			int count = 0;
			for(int innerIndex=1; innerIndex<=endIndex; innerIndex++){
				if(i%innerIndex == 0)
					count++;
			}
			if(count==2)
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

package kajol;

import java.util.Scanner;

public class FindCountSumAndAverageofPrimeNumbers {
	
	void findPrimeNumbers(int start,int end) {
		int count=0;int sum=0;
		float average=0;
		System.out.println("Prime Numbers Between "+start+" and "+end+" :");
		for(int index=start;index<=end;index++) {
			boolean flag=true;
			for(int innerIndex=2;innerIndex<=Math.sqrt(index);innerIndex++) {
				if(index%innerIndex==0)
					flag=false;
			}
			if(flag) {
				count++;
				System.out.print(index+" ");
				sum=sum+index;
				average=sum/count;
			}
		}
		System.out.println();
		System.out.println("Count of Prime Numbers between "+start+" and "+end+" : "+count);
		System.out.println("Sum of Prime Numbers between "+start+" and "+end+" : "+sum);
		System.out.println("Average of Prime Numbers between "+start+" and "+end+" : "+average);
	}
	
	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
		System.out.println("Please provide Range for finding Prime Numbers:");
		System.out.println("Start: ");
		int start=scanner.nextInt();
		System.out.println("End: ");
		int end=scanner.nextInt();
		new FindCountSumAndAverageofPrimeNumbers().findPrimeNumbers(start, end);;
		scanner.close();	
	}
}

package raghvendra;
/* Create a class where user will provide int array. *[ideal Expected Time : 15 mins, Max 
    Time : 25 mins]*

    A) User can provide any positive and negative number
    B) You need to find out how many positive, negative numbers and zeros are there in array*/
import java.util.Scanner;
public class FindPositiveNegativeZeronumber {
	void findTypeOfNumber(int[] rr) {
		int postiveCount=0;
		int negativeCount=0;
		int ZeroCount=0;
		for (int index=0;index<rr.length;index++) {
			if(rr[index]>0)
				postiveCount+=1;
			else if(rr[index]<0)
				negativeCount+=1;
			else if(rr[index]==0)
				ZeroCount+=1;
		}
			System.out.println("Positive numbers are:"+postiveCount);
			System.out.println("Negative numbers are:"+negativeCount);
			System.out.println("Zero numbers are:"+ZeroCount);
	}

		public static void main(String[] args) {
			FindPositiveNegativeZeronumber findPositiveNegativeZeronumber=new FindPositiveNegativeZeronumber();
			System.out.println("Enter How many numbers you want to enter:");
			Scanner sc=new Scanner(System.in);
			int length=sc.nextInt();
			int[] arr=new int[length];
			System.out.println("Enter numbers:");
			for(int index=0;index<length;index++) {
				arr[index]=sc.nextInt();
			}
			findPositiveNegativeZeronumber.findTypeOfNumber(arr);
		}
}

package raghvendra.NumberOperations;
import java.util.Arrays;
/*Assignment - 35 : 4th Dec'2020 
return sum of all Armstrong number from given array.
input : [153, 111, 124, 371]
output : 524*/
public class FindSumOfArmstrongNumber {
	int findArmstronNumber(int number) {
		int armstrongNumber=0;
		int givenNumber=number;
		int sum=0;
		while(givenNumber>0) {
			int mod=givenNumber%10;
			armstrongNumber+=mod*mod*mod;
			givenNumber=givenNumber/10;
		}
		if(number==armstrongNumber) {
			sum+=armstrongNumber;
		}
		return sum;
	}
	public static void main(String[] args) {
		FindSumOfArmstrongNumber findSumOfArmstrongNumber=new FindSumOfArmstrongNumber();
		int[]number= {153, 111, 124, 371};
		int total=0;
		for(int index=0;index<number.length;index++) {
		total+=findSumOfArmstrongNumber.findArmstronNumber(number[index]);
		}
		System.out.println("Sum of all Armstrong number from given array "+Arrays.toString(number)+" is "+total);
	}
}

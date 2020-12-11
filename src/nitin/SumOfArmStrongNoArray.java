package nitin;
import java.util.Arrays;

/* return sum of all Armstrong number from given array.
input : [153, 111, 124, 371], output : 524*/
public class SumOfArmStrongNoArray {
	public void findSumOfArmStrongNoArray(int arr[]) {
		System.out.println("Input Array of ArmStrong Numbers --> "+Arrays.toString(arr));
		int sum=0;
		int mod=0;
		int temp=0;
		for(int index=0;index<arr.length;index++) {
			temp=arr[index];
			int total=0;
			while(temp!=0) {
				mod=temp%10;
				total+=(mod*mod*mod);
				temp=temp/10;
			}
			if(arr[index]==total)
			sum+=arr[index];
		}
		System.out.println("Sum of all ArmStrong Numbers in the Input Arrays --> "+sum);
	}
	public static void main(String[] args) {
		SumOfArmStrongNoArray sumOfArmStrongNoArray = new SumOfArmStrongNoArray();
		int input[]= {153, 111, 124, 371};
		sumOfArmStrongNoArray.findSumOfArmStrongNoArray(input);
	}
}

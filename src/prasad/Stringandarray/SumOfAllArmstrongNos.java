package prasad.Stringandarray;
import java.util.Arrays;
/*Assignment - 35 : 4th Dec'2020 

return sum of all Armstrong number from given array.
input : [153, 111, 124, 371]
output : 524*/
public class SumOfAllArmstrongNos {
	
	int sumofArmstrong(int[]numbers) {
		int sumOfArmstrong=0;
		for(int index=0;index<numbers.length;index++) {
			int num = numbers[index];
			int temp=num;
			int sum = 0;
			int digit=0;
			while(num>0) {
				digit = num%10;
				sum=sum+(digit*digit*digit);
				num=num/10;
			}
			if(sum==temp) {
				sumOfArmstrong+=sum;
			}
		}
		if(sumOfArmstrong==0)
			return 0;
		
		else
		return sumOfArmstrong;
	}
	
	public static void main(String[]arg) {
		SumOfAllArmstrongNos sumofallarmstrongnos = new SumOfAllArmstrongNos();
		int []numbers = {153, 111, 124, 371};
		System.out.println("Input integer array: " + Arrays.toString(numbers));
		System.out.println("Calculating sum of all armstrong numbers in the given array:-");
		int ans=sumofallarmstrongnos.sumofArmstrong(numbers);
		if(ans!=0)
		System.out.println("Sum: " + ans);
		else 
		System.out.println("No armstrong number in the given int array");	
	}
}

package nitin;
import java.util.Arrays;
/* Assignment - 28 : 25th Nov'2020 - WAP - find the triplet having maximum sum.
Input : [10,12,8,20,18,22,15,13,17]
output : maximum sum triplet 20,18,22 --> 60 */
public class ArrayTripletMaxSum {
	public void findMaxSumInTriplet(int[] num) {
		System.out.println("Input Array :: "+Arrays.toString(num));
		int count=0;
		int countIndex=0;
		for(int index=0;index<num.length;index+=3) {
			int sum=num[index]+num[index+1]+num[index+2];
			if(sum>count) {
				count=sum;
				countIndex=index;
			}
		}
		System.out.println("Maximum sum triplet -- "+num[countIndex]+","+num[countIndex+1]+","+num[countIndex+2]+" --> "+count);
	}
	public static void main(String[] args) {
		ArrayTripletMaxSum arrayTripletMaxSum = new ArrayTripletMaxSum();
		int[] arr= {10,12,8,20,18,22,15,13,17};
		arrayTripletMaxSum.findMaxSumInTriplet(arr);
	}
}

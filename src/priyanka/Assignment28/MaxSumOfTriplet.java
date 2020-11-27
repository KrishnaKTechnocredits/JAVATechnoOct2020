package priyanka.Assignment28;

/*Assignment - 28 : 25th Nov'2020 

find the triplet having maximum sum.
[10,12,8,20,18,22,15,13,17]
output : maximum sum triplet 20,18,22 --> 60
*/
public class MaxSumOfTriplet {
	
	void maxTripletsum(int [] arr) {
		
		int max= 0;
		int maxIndex = 0;
		for(int index = 0; index<arr.length; index+=3) {
			int sum = arr[index]+arr[index+1]+arr[index+2];
			if(sum>max) {
				max = sum;
				maxIndex = index;
			}	
		}
		System.out.println(" The max sum triplet is : "+ arr[maxIndex] + ","+ arr[maxIndex +1] +","+arr[maxIndex +2] +" :-"+ max);
	}
	
	public static void main(String [] args) {
		MaxSumOfTriplet maxSumOfTriplet = new MaxSumOfTriplet();
		int array[] = {10,12,8,20,18,22,15,13,17,25,25,9,12,45,10};
		maxSumOfTriplet.maxTripletsum(array);	
	}
}

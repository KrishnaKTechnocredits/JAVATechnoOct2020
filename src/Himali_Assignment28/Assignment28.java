/*find the triplet having maximum sum.
[10,12,8,20,18,22,15,13,17]
output : maximum sum triplet 20,18,22 --> 60*/

package Himali_Assignment28;

import java.util.Arrays;

public class Assignment28 {
	
	void tripletSum(int array[]) {
		int maxSum=0;
		int[] triplet=new int[3];
		
			for(int i=0;i<(array.length)-2;i++) {
				int sum=array[i]+array[i+1]+array[i+2];
					if(sum>maxSum)
					{
						maxSum=sum;
						triplet[0]=array[i];
						triplet[1]=array[i+1];
						triplet[2]=array[i+2];
					}
					
					
				
			}
			System.out.println("Maximum sum triplet"+Arrays.toString(triplet)+" is "+maxSum );

		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Assignment28 assign=new Assignment28();
		int[] array= {10,12,8,20,18,22,15,13,17};
		assign.tripletSum(array);
		
		
		
		

	}

}

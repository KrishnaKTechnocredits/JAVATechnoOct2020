package nandini;

public class ArrayOperations {
	
	  int getMaxNumber(int num[]) {
		
		int max = num[0];
		for(int index=0; index < num.length; index++) {
			
			if(max < num[index])
				max = num[index];
		}
		
		return max;
	 }
	  
	  int getMinNumber(int num1[]) {
			
			int min =num1[0];
			for(int index=0; index < num1.length; index++) {
				
				if(min > num1[index])
					min = num1[index];
			
			}
			return min;
		}
	  
	  double getAvgNumbers(int num2[]) {
				
		   double avgOfSum = 0;
		   for(int index=0; index < num2.length; index++) {
					
			   avgOfSum = avgOfSum + num2[index]/5;
				
		   }
				return avgOfSum;
		}
			
	  void getLengthofArray(int num3[]) {
				
		   for(int index=0; index < num3.length; index++) {
					
				System.out.println(num3[index]);
				
		   }	
		       
		}
			
       void getNumbersInReverse(int num4[]) {
				
		   for(int index= num4.length-1; index >= 0; index--) {
					
					System.out.println(num4[index]);
				}
				     
			}
			
        double getMinMaxAvg(int maxNum, int minNum) {
            	
            double avgOfMinMax = (maxNum + minNum)/2;
            	
            return avgOfMinMax;
            
        }
            
		public static void main(String [] args) {
			
			ArrayOperations arrayoperations = new ArrayOperations();
			int arr[] = {10,30,-1,0,50};
			int maxNumber = arrayoperations.getMaxNumber(arr);
			System.out.println("Maximum Number is : " + maxNumber);
			int minNumber = arrayoperations.getMinNumber(arr);
			System.out.println("Minimum Number is : " + minNumber);
			double avgOfNumbers = arrayoperations.getAvgNumbers(arr);
			System.out.println("Average of Numbers is : " + avgOfNumbers);
			System.out.println("---Numbers of an Array from 0 to Length---");
			arrayoperations.getLengthofArray(arr);
			System.out.println("---Numbers of an Array from length to 0---");
			arrayoperations.getNumbersInReverse(arr);
			double avgOfMinMaxNumbers = arrayoperations.getMinMaxAvg(maxNumber, minNumber);
			System.out.println("Average of Min and Max Numbers is : " + avgOfMinMaxNumbers);
				
		}
		
	}
	



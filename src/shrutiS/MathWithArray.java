package shrutiS;

public class MathWithArray {
	
	int minNumber(int[] num) {
		
		int minNumber = num[0];
		
		for (int index = 0 ; index<num.length ; index++ ) {
			if (minNumber > num[index])
				minNumber = num[index];
		}
		return minNumber;
	}
	int maxNumber(int[] num) {
		
		int maxNumber = num[0];
		
		for (int index = 0 ; index<num.length ; index++ ) {
			if (maxNumber < num[index])
				maxNumber = num[index];
		}
		return maxNumber;
	}
	int avgOfArrayNumber(int[] num) {
		
		int sum =0;
	    int totalNumber=0;
	    for(int index = 0; index<num.length ; index++) {
	    	sum += num[index];
	    	totalNumber++;
	    }
	    return sum/totalNumber;
	    
	}
	void displayForwardArray(int[] num) {
		
		for(int index = 0; index<num.length; index++) {
			 System.out.print(num[index]+" ");
		}
	}
	void displayReverseArray(int[] num) {
		for(int index = num.length-1; index>=0; index--) {
			 System.out.print(num[index]+" ");
		}
		
	}
	int avgOfMinMax(int minNumber, int maxNumber) {
		  
		return (minNumber+maxNumber)/2;
	
	}
	
	public static void main(String[] a) {
		
		MathWithArray mathWithArray = new MathWithArray();
		int[] num = {10,-9,6,87,-69};
		System.out.println("Forward list of numbers in array");
		mathWithArray.displayForwardArray(num);
		System.out.println("\nReverse list of numbers in array");
		mathWithArray.displayReverseArray(num);
		int avgOfNumber = mathWithArray.avgOfArrayNumber(num);
		System.out.println("\nAverage of numbers in array is "+avgOfNumber);
		int minNumber = mathWithArray.minNumber(num);
		System.out.println("Minimum number in a array list is "+minNumber );
		int maxNumber = mathWithArray.maxNumber(num);
		System.out.println("Maximum number in a array list is "+maxNumber );
		int avgMinMax = mathWithArray.avgOfMinMax(minNumber, maxNumber);
		System.out.println("Average of min and max number of array is "+avgMinMax);
		
		
	}
}

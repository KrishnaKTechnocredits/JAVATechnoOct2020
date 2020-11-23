package vaibhav;

public class MinMaxNumber {
	
	int minNumber(int[] arr) {		
		int min=arr[0];
		for (int index = 0 ;index < arr.length; index++){			
			if(arr[index] < min)
				min=arr[index];
			else continue;			
		}		
		return min;		
	}
	
	int maxNumber(int[] arr) {
		int max=arr[0];
		for (int index = 0 ;index < arr.length; index++){			
			if(arr[index] > max)
				max=arr[index];
			else continue;			
		}		
		return max;	
		
	}
	
	int avgAllNumber(int [] arr) {
		int sum=0;
		int avg=0;
		for (int index = 0 ;index < arr.length; index++ ){
			sum+=arr[index];			
		}
		avg= sum / arr.length;
		return avg;		
	}
	
	int avgMinMaxNumber(int min,int max) {
		int ans=0;		
		ans = min + max;		
		return ans / 2;		
	}
	
	void display(int[] arr) {
		System.out.println("Numbers in an array with incremental order");
		for(int index = 0; index < arr.length; index++) {
			System.out.print(" "+arr[index]);		
		}		
	}
	
	void displayInReverse(int[] arr) {
		System.out.println();
		System.out.println("Numbers in an array with decremental order");
		for(int index = arr.length-1; index >= 0; index--) {
			System.out.print(" "+arr[index]);		
		}		
		
	}

	public static void main(String[] args) {
		int minimum,maximum,average,avgMinMaxNumber=0;
		int [] numbers={12,13,200,15,16,34,23,76,89,54,33,-11,-33};
		MinMaxNumber minMaxNumber=new MinMaxNumber();
		minimum=minMaxNumber.minNumber(numbers);
		maximum=minMaxNumber.maxNumber(numbers);
		average=minMaxNumber.avgAllNumber(numbers);
		avgMinMaxNumber=minMaxNumber.avgMinMaxNumber(minimum,maximum);
		System.out.println("Minimum number from given array is "+minimum);
		System.out.println("Maximum number from given array is "+maximum);
		System.out.println("Average for all the numbers given in an array is "+average);
		System.out.println("Average for minium and maximum numbers given in an array is "+avgMinMaxNumber);
		minMaxNumber.display(numbers);
		minMaxNumber.displayInReverse(numbers);	
		
	}

}

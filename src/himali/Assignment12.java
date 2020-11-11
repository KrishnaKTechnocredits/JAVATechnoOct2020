package himali;

public class Assignment12 {
	int i;
	int minimumNumber(int[] num) {
		int min=num[0];
		for(i=0;i<num.length;i++) {
			if(num[i]<min) {
				min=num[i];
			}
		}
		return min;
		}
	
	int maxNumber(int[] num) {
		int max=num[0];
		for(i=0;i<num.length;i++) {
			if(num[i]>max) {
				max=num[i];
			}
			
		}
		return max;
		
		
	}
	double averageOfAllNumbers(int[] num) {
		int sum = 0;
		for(i = 0; i < num.length; i++) {
			sum = sum + num[i];
		}
		double avg = sum / num.length;
		return avg;
		
	}
	int averageOfMinMaxNumber(int min,int max) {
		int averageMinMax=0;
		averageMinMax=(min+max)/2;
		return averageMinMax;
		
	}
	void displayNumber0ToLength(int[] num) {
		System.out.print("The elements in the array : ");
		for(i=0;i<num.length;i++) {
			
			System.out.print(num[i]+ " ");
		}
		
		System.out.println();
	}
	void displayNumberLengthTo0(int[] num) {
		System.out.print("Reverse order : ");
		for(i=(num.length-1);i>=0;i--)
		{
			System.out.print(num[i]+ " ");
		}
		System.out.println();
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Assignment12 assignment12=new Assignment12();
		int arr[]= {10,20,101,5,90};
		
		int minimum=assignment12.minimumNumber(arr);
		System.out.println("The minimum number is : "+minimum);
		
		int maximum=assignment12.maxNumber(arr);
		System.out.println("The maximum number is : "+maximum);
		
		double averageAllNumber=assignment12.averageOfAllNumbers(arr);
		System.out.println("The average of all the numbers is : "+averageAllNumber);
		
		int avgMinMax=assignment12.averageOfMinMaxNumber(minimum,maximum);
		System.out.println("The average of minimum and maximum number is : "+avgMinMax);
		
		assignment12.displayNumber0ToLength(arr);
		
		assignment12.displayNumberLengthTo0(arr);
		
		

	}

}

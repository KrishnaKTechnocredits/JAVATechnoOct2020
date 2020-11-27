package vishakha;

public class ArrayEx1 {
	
	int getArrayMax(int[] num){
		int max = num[0];
		for(int index=0; index<num.length; index++){
			if(num[index]>max)
				max = num[index];
		}
		return max;
		
	}
	
	int getArrayMin(int[] num){
		int min = num[0];
		for(int index=0; index<num.length; index++){
			if(num[index]<min)
				min = num[index];
		}
		return min;
	}	
	//avg
	int averageCal(int [] num){
		int sum = 0;
		for(int index=0;index<num.length;index++){
			sum = sum+num[index];
		}
		int average = sum/num.length;
		return average;
	}
	
	//display
	void displayAverage(int [] num){
		int average = averageCal(num);
		System.out.println("Average of the array is :" +average);
	}
	 
	//reverse
	void printReverseArray(int [] num){
		for(int index=num.length-1;index>=0;index--)
			System.out.print(num[index]+ " ");
	}

	public static void main(String[] args) {
		ArrayEx1 arrayEx1 = new ArrayEx1();
		int [] num = {11,87,34,22,3,2};				
		int ansMax = arrayEx1.getArrayMax(num);
		System.out.println("Maximum no is : "+ansMax);
		int ansMin = arrayEx1.getArrayMin(num);
		System.out.println("Minimum no is : "+ansMin);
		arrayEx1.displayAverage(num);
		System.out.println("Reverse of Array is : ");
		arrayEx1.printReverseArray(num);
	}
}

package raghvendra;

public class ArrayMethod {
	int min(int[] number) {
		int min=number[0];
		for(int index=0;index<number.length;index++) {
			if (min>number[index])
				min=number[index];
		}
		return min;
	}
	
	int max(int[] number) {
		int max=number[0];
		for(int index=0;index<number.length;index++) {
			if (max<number[index])
				max=number[index];
		}
		return max;
	}

	double avg(int[] number) {
		double average=0;
		for(int index=0;index<number.length;index++) {
			average=average+number[index];
		}
		return average/number.length;
	}
	
	void display(int[] number) {
		System.out.println("Elements of number Array: ");
		for(int index=0;index<number.length;index++) {
			System.out.print(number[index]+",");
		}
	}
	//Found new line character from google and used it
	void displayArrayFromEnd(int[] number) {
		System.out.println( "\r\n" +"Elements of number Array starting from last index: ");
		for(int index=number.length-1;index>=0;index--) {
			System.out.print(number[index]+",");
		}
	}
	
	double avgMinMax(int min, int max) {
		double average=0;
		average=(min+max)/2;
		return average;
	}
	public static void main(String[] args) {
		ArrayMethod arraymethod=new ArrayMethod();
		int[] number= {50,60,81,70,80,10,-6};
		int minimum=arraymethod.min(number);
		int maximum=arraymethod.max(number);
		double average=arraymethod.avg(number);
		System.out.println("Minimum number in Array is: "+minimum);
		System.out.println("Maximum number in Array is: "+maximum);
		System.out.println("Average of number is: "+average);
		arraymethod.display(number);
		arraymethod.displayArrayFromEnd(number);
		//Found new line character from google and used it
		System.out.println("\r\n"+"Average of Min and Max is: "+arraymethod.avgMinMax(minimum,maximum));
	}

}

package prasad.Stringandarray;

public class Array {
	void setData(int[]num) {
		for (int index=0; index<num.length;index++) {
				num[index]=index;
		}	
	}
	void display(int[]arg) {
		System.out.println("Printing array of numbers:- ");
		for(int index=0;index<arg.length;index++) {
				System.out.println(arg[index]);
		}
	}
	void displayreverse(int[]arg) {
		System.out.println("Printing array of numbers in reverse order:- ");
		for(int index=arg.length-1;index>=0;index--) {
				System.out.println(arg[index]);
		}
	}
	float arraysum(int[]num) {
		float sum=0;
		for(int index=0;index<num.length;index++) {
			sum+=num[index];
		}
		return sum;
	}
	double arrayavg(int[]num) {
		double avg=0;
		float sum = arraysum(num);
		System.out.println("Sum of array: " + sum);
		avg = (sum/num.length);
		return avg;
	}
	float max (int[]num) {
		int max= num[0];
		for(int index=0;index<num.length;index++) {
				if(num[index]>max)
				max = num[index];
		}	
		return max;
	}
	float min (int[]num) {
		int min= num[0];
		for(int index=0;index<num.length;index++) {
				if(num[index]<min)
				min = num[index];
		}	
		return min;
	}
	float avgminmax(int[] number) {
		float avg = (min(number) + max(number))/2;
		return avg;	
	}
	
	public static void main (String[]arg) {
		int [] array = new int [5];
		Array arrayvar = new Array();
		arrayvar.setData(array);
		arrayvar.display(array);
		double avg = arrayvar.arrayavg(array);
		System.out.println("Average of array: " + avg);
		int[] array1 = {9,10,-1,80,12};
		arrayvar.display(array1);
		arrayvar.displayreverse(array1);
		float max =arrayvar.max(array1);
		System.out.println("Max number out of given array: "+ max);
		float min = arrayvar.min(array1);
		System.out.println("Min number out of given array: " + min);
		float avgminmax = arrayvar.avgminmax(array1);
		System.out.println("Average of min and max of array: "+ avgminmax);
	
	}
}

/*write a single program having different methods.
 
a) To find Min number from given array
b) To find Max number from given array
c) To find Avg of all numbers from give array
d) To display all numbers [0 to length]
e) To display all numbers [length to 0]
g) Method to find average of min and max number from array.*/

package ruby;

public class ArrayConcepts {
	
	public static void main(String[] args) {
		int[] num = {10,60,30,40,50};
		ArrayConcepts arr = new ArrayConcepts();
		
		int max = arr.findMax(num);
		int min = arr.findMin(num);
		
		int average = arr.average(num);
		System.out.println("Average of Array is "+average);
		
		arr.averageOfMinMax(max, min);
		
		System.out.println("Display Array List from 0 to "+num.length);
		arr.displayArraylist(num);
		
		System.out.println("Display Array List in Reverse order from "+num.length+ "to 0");
		arr.displayReverseArraylist(num);
	}
	
	void averageOfMinMax(int num1, int num2){
		num1= (num1+num2)/2;
		System.out.println("Average of Max and Min number is "+num1);
	}
	
	int average(int[] num) {
		int total =0;
		for(int index=0;index<num.length;index++) {	
			total = total + num[index];
		}
		total =total/num.length;
		return total;
	}
	
	void displayArraylist(int[] num){
		for(int index=0; index<num.length;index++) {
			System.out.println("Number in "+index+ " place is " +num[index]);
		}
	}
	
	void displayReverseArraylist(int[] num){
		for(int index=num.length-1; index>=0;index--) {
			System.out.println("Number in "+index+ " place is " +num[index]);
		}
	}
	
	int findMax(int[] num){
		int max= num[0];
		for(int index=0; index<num.length; index++) {
			if(num[index] > max)
				max = num[index];
			}
		System.out.println("Max number is "+max);
		return max;
	}
	
	int findMin(int[] num){
		int min= num[0];
		for(int index=0; index<num.length; index++) {
			if(num[index] < min)
				min = num[index];
			}
		System.out.println("Min number is "+min);
		return min;
	}
}

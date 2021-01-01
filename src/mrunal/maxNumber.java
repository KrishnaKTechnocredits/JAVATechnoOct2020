/*QUESTION: write a single program having different methods.
 
a) To find Min number from given array
b) To find Max number from given array
c) To find Avg of all numbers from give array
d) To display all numbers [0 to length]
e) To display all numbers [length to 0]
g) Method to find average of min and max number from array.*/

package mrunal;

public class maxNumber {
	int index=0;
	int getMinNumber(int[] input)
	{
		int min =input[0];
		for(int index=0; index<input.length;index++)
		{
			if(input[index]<min)
				min=input[index];
		}
		return min;
	}
	
	
	int getMaxNumber(int[] input)
	{
		int max =input[0];
		for(int index=0; index<input.length;index++)
		{
			if(input[index]> max)
				max=input[index];
		}
		return max;
}
	int getAverage(int[] input)
	{
		int sum=0;
		for(int index=0; index<input.length; index++)
		sum += input[index];
		int average = sum/input.length;
		return average;
	}

	void displayIncrementOrder(int[] input)
	{
		for(index=0; index<input.length;index++)
		{
			System.out.println(input[index]);
		}
		
	}
	
	void displayDecrementOrder(int[] input)
	{
		for(index=(input.length-1) ;index>=0 ;index--)
		{
			System.out.println(input[index]);
		}
	}
	
	void averageOfMinMax(int[] input)
	{
		maxNumber m = new maxNumber();
		
		int ans1 = m.getMinNumber(input);
		int ans = m.getMaxNumber(input);
		int averageOfMinMax = (ans1 + ans)/2;
		
		System.out.println(averageOfMinMax);
	}
	
	public static void main(String[] args) {
		
		maxNumber m = new maxNumber();
		int []input= {10,20,30,40,50,60};
		
		int ans1 = m.getMinNumber(input);
		System.out.println("\n" + "(a) Minimum number is : " + ans1);
		
		int ans = m.getMaxNumber(input);
		System.out.println("\n" +"(b) Maximum number is : "  + ans);
		
		int ans2 = m.getAverage(input);
		System.out.println("\n" + "(c) Average of the array is: " + ans2);
		
		System.out.println("\n" + "(d) Printing all elements 0 to length :" );
		m.displayIncrementOrder(input);
		
		System.out.println("\n" + "(d) Printing all elements length to 0 :" );
		m.displayDecrementOrder(input);
		
		System.out.println("\n" + "(e) Average of Min and Max is  :");
		m.averageOfMinMax(input);

	}

}

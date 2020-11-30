/* write a single program having different methods.
 
a) To find Min number from given array
b) To find Max number from given array
c) To find Avg of all numbers from give array
d) To display all numbers [0 to length]
e) To display all numbers [length to 0]
g) Method to find average of min and max number from array.

*/

package yogita;

class Array{
	int maxNumber(int[]num){
		int max =num[0];
		for(int index=0;index<num.length;index++)
			if(num[index]>max)
			max = num[index];
		return max;
	}
 
	int  minNumber(int[]num){
		int min =num[0];
		for(int index=0;index<num.length;index++)
			if(num[index]< min)
			min = num[index];
		return min;
	}
  
    float average(int[] num){
	    int sum=0;
		for(int index=0;index<num.length;index++)
           sum = sum + num[index];
	       System.out.println("\nSum of Array is  "+sum);
		   return sum/num.length;
    }
 
	float minMaxAverage(int[] num){
		return (minNumber(num) + maxNumber(num))/2;
	}
	
	void printForwardArray(int[]num){
		System.out.print("Array in Forward Direction: ");
		for(int index=0;index<num.length;index++)
		   System.out.print(num[index]+ " ");
	}
 
	void printReverseArray(int[] num){
		System.out.print("\nArray in Reverse Direction: ");
		for(int index=num.length-1;index>=0;index--)
		   System.out.print(num[index]+ " ");
    }
  
public static void main(String[] args){
		int[] ans ={50,30,-60,90,-40,70};
		Array array = new Array();
		array.printForwardArray(ans);
		array.printReverseArray(ans);
		System.out.println("Average OF Array is:"+array.average(ans));
		System.out.println("Maximum number in Array is:"+array.maxNumber(ans));
		System.out.println("Minimum number in Array is:"+array.minNumber(ans));
		System.out.println("Average of MinMax number is:"+array.minMaxAverage(ans));
   }
}
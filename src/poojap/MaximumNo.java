/*Assignment - 12 : 7th Oct'2020 
write a single program having different methods.
 
a) To find Min number from given array
b) To find Max number from given array
c) To find Avg of all numbers from give array
d) To display all numbers [0 to length]
e) To display all numbers [length to 0]
g) Method to find average of min and max number from array.
*/

package poojap;

public class MaximumNo {
	
	int minimumNo(int[] num) {
		int min=num[0];
		for(int index=0;index<num.length;index++) {
			if(num[index]<min) {
				min=num[index];
			}
		}
		return min;
	}
	int maximunNo(int[] num) {
		int max=num[0];
		for(int index=0;index<num.length;index++) {
			if(num[index]>max) {
				max=num[index];
			}
		}
		return max;
	}
	int avgOfNum(int[]num) {
		int sum=0,avg;
		for(int index=0;index<num.length;index++) {
		sum=sum+num[index];
		}
		avg = sum/num.length;
		return avg;
	}
	void displayForword(int[] num) {
		for(int index=0;index<num.length;index++) {
			System.out.println(num[index]);
		}
	}
	void displayReverse(int[] num) {
		for(int index=num.length-1;index>=0;index--) {
			System.out.println(num[index]);
		}
	}
	void minMaxAvg(int[] num) {
		MaximumNo maximumNo=new MaximumNo();
		int max=maximumNo.maximunNo(num);
		int min=minimumNo(num);
		int ans= (max+min)/2;
		System.out.println("Average of minimun and maxinum number is: " +ans);
	}
	public static void main(String[] args) {
		
		MaximumNo maximumNo=new MaximumNo();
		int[] arr={20,30,10,40};
		int maxnum=maximumNo.maximunNo(arr);
		int mininum=maximumNo.minimumNo(arr);
		int avg1=maximumNo.avgOfNum(arr);
		System.out.println("Maximum No is " +maxnum);
		System.out.println("Minimum No is " +mininum);
		System.out.println("Average is " +avg1);
		System.out.println("Array Elements are: ");
		maximumNo.displayForword(arr);
		System.out.println("Array Elements in Reverse order: ");
		maximumNo.displayReverse(arr);
		maximumNo.minMaxAvg(arr);
		
	}

}

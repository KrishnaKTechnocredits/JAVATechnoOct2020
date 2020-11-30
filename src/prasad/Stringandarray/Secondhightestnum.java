package prasad.Stringandarray;
/*Find second maximum from array without sorting the array.*/

public class Secondhightestnum {
	
	int highestNum(int[]array) {
 		int maxNum=0;
		for(int index=0;index<array.length;index++) {
			int num=array[index];
			for(int innerindex=0;innerindex<array.length;innerindex++) {
				if(num>array[innerindex]&& num>maxNum) {
					maxNum=num;
				}
			}
		}
		
		return maxNum;
	}
	
	int secondHighestNum(int[]arr,int highestNumber) {
		int secondMax=0;
		for(int index=0;index<arr.length;index++) {
			int num=arr[index];
			if(num!=highestNumber) {
			for(int innerindex=0;innerindex<arr.length;innerindex++) {
				if(num>arr[innerindex]&& num>secondMax) {
					secondMax=num;
				}
			}
		}
	}
		return secondMax;
	}
	
	public static void main(String[]arg) {
		Secondhightestnum secondhightestnum = new Secondhightestnum();
		int []numbers = {48,17,2,28,44,1,70,0};
		int highestNo=secondhightestnum.highestNum(numbers);
		int secondHighestNo=secondhightestnum.secondHighestNum(numbers, highestNo);
		System.out.println("Highest number from the given integer array is " +highestNo+ " & second highest number is " + secondHighestNo);
	}
}

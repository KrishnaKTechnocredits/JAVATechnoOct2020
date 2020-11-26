package nitin;
/*Assignment - 27: 23rd Nov'2020 - Program 2: print all the words where digit sum is > 10. 
String[] input = {"Ma1s3gj3Pw", "r4f3sjk","te3ch2no9","sfjk4p4plpk"};
output : te3ch2no9*/
import java.util.Arrays;
public class FindSumOfDigitsInString {
	void getSumOfDigitsInString(String[] arr) {
		System.out.println("Input Array of String :: "+Arrays.toString(arr));
		int digitCount=0;
		for(int index=0;index<arr.length;index++) {
			String word=arr[index];
			int digitSum=0;
			for(int inner=0;inner<word.length();inner++) {
				char ch=word.charAt(inner);
				if(Character.isDigit(ch))
					digitSum+=Character.getNumericValue(ch);
			}
			if(digitSum>10) {
				digitCount++;
				System.out.print("Word where in between digit sum is > 10 :: ");
				System.out.println(arr[index]);
			}	
		}
		if(digitCount==0)
			System.out.println("No word present in String Array where digit sum is > 10");
	}
	public static void main(String[] args) {
		String[] input= {"Ma1s3gj3Pw", "r4f3sjk","te3ch2no2","sfjk4p4plpk"};
		new FindSumOfDigitsInString().getSumOfDigitsInString(input);
	}
}

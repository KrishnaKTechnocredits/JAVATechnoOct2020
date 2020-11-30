package monika;
import java.util.Scanner;

/*Assignment - 27: 23rd Nov'2020  

Program 1: print all the words which does't have any digit. 
String[] input = {"Masgj3Pw", "r4fsjk","techno","sfjk44lk"};
output : techno

Program 2: print all the words where digit sum is > 10. 
String[] input = {"Ma1s3gj3Pw", "r4f3sjk","te3ch2no9","sfjk4p4plpk"};
output : te3ch2no9
*/

public class WordsStringArray {

	public static void main(String[] args) {
		String[] strArr;
		Scanner sc = new Scanner(System.in);
		System.out.println("Program 1: Print all the words in string array which doesn't have any digit. Press - 1");
		System.out.println("Program 2: Print all the words in string array where digit sum>10. Press - 2");
		int input = sc.nextInt();
		switch(input) {
		case 1:
			strArr = inputArray();
			wordDoesntHaveDigit(strArr);
			break;
		case 2:
			strArr = inputArray();
			wordSumMoreThanTen(strArr);
			break;
		default:
			System.out.println("Invalid Input");
		}
	}

	static String[] inputArray() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the length of array");
		int len = sc.nextInt();
		String[] strArr = new String[len];
		System.out.println("Enter the String Array:");
		for(int index=0;index<len;index++) {
			strArr[index] = sc.next();
		}
		return strArr;
	}

	static void wordDoesntHaveDigit(String[] strArr) {
		int cnt=0;
		System.out.println("Output --> ");
		for(int index=0;index<strArr.length;index++) {
			boolean flag = true;
			String tempStr="";
			for(int innerIndex=0;innerIndex<strArr[index].length();innerIndex++) {
				if(Character.isLetter(strArr[index].charAt(innerIndex)))
					tempStr += strArr[index].charAt(innerIndex);
				else {
					cnt++;
					flag = false;
					break;
				}
			}
			if(!flag && cnt==strArr.length)
				System.out.println("String withougt digit doesn't exist");
			else if(flag)
				System.out.print(" "+tempStr);
		}
	}

	static void wordSumMoreThanTen(String[] strArr) {
		boolean flag=true;
		int cnt=0;
		System.out.println("Output --> ");
		for(int index=0;index<strArr.length;index++) {
			int sum=0;
			String tempStr="";
			for(int innerIndex=0;innerIndex<strArr[index].length();innerIndex++) {
				tempStr += strArr[index].charAt(innerIndex);
				if(Character.isDigit(strArr[index].charAt(innerIndex))) 
					sum += Character.getNumericValue(strArr[index].charAt(innerIndex));
			}
			if(sum>10)
				System.out.println(tempStr+" --> "+sum);
			else {
				flag=false;
				cnt++;
			}
		}
		if(cnt==strArr.length && !flag)
			System.out.println("There is no string with digits having sum>10");
	}
}

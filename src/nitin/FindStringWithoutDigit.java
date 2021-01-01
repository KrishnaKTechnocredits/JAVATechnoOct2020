package nitin;
/* Assignment - 27: 23rd Nov'2020 - Program 1: print all the words which does't have any digit. 
String[] input = {"Masgj3Pw", "r4fsjk","techno","sfjk44lk"};
output : techno */
import java.util.Arrays;
public class FindStringWithoutDigit {
	void getStringWithoutDigit(String[] arr){
		System.out.println("Input Array --> "+Arrays.toString(arr));
		System.out.print("Word with no digit is --> ");
		for(int index=0;index<arr.length;index++) {
			String word=arr[index];
			boolean flag=false;
			for(int inner=0;inner<word.length();inner++) {
				char ch=word.charAt(inner);
				if(Character.isDigit(ch))
					flag=true;
			}
			if(!flag)
				System.out.print(arr[index]);
		}
	}
	public static void main(String[] args) {
		String[] input= {"Masgj3Pw","r4fsjk","techno","sfjk44lk"};
		new FindStringWithoutDigit().getStringWithoutDigit(input);
	}
}

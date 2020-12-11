package raghvendra.StringAssignments;
/*Program : 1
max repeating word with its freq.
input : Hi Hello Hi Techno Hello Hi
output : Hi -> 3*/
import java.util.Scanner;
public class MaxRepeatingWord {
	void RepeatingWordFrequency(String name) {
		String [] arr=name.split(" ");
		int count=0;
		int maxCount=0;
		int maxIndex=0;
		for(int outerIndex=0;outerIndex<arr.length;outerIndex++) {
			String firstWord=arr[outerIndex];
			count=0;
			if(name.contains(firstWord)) {
				for(int index=0;index<arr.length;index++) {
					if(arr[outerIndex].equalsIgnoreCase(arr[index])) {
						count++;
					}
				}
				if (count>maxCount) {
					maxCount=count;
					maxIndex=outerIndex;
				}
				name=name.replaceAll(firstWord, "");
			}
		}
		System.out.println("Max word "+arr[maxIndex]+"->"+maxCount);
	}
	public static void main(String[] args) {
		MaxRepeatingWord maxRepeatingWord=new MaxRepeatingWord();
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Strings with different words");
		String words=sc.nextLine();
		maxRepeatingWord.RepeatingWordFrequency(words);
	}

}

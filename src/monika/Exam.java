package monika;
import java.util.Scanner;

public class Exam{

	String getMaxLength(String[] arr){
		//String maxlength = name[0];
		//int maxLenIndex=0;
		String max = ""; 
		int length = arr[0].length();
		for (int index=0; index<arr.length-1;index++) {
			if (length <  arr[index+1].length()) {
				length = arr[index+1].length();
				//maxLenIndex = index;
				//maxLenIndex = name[index];
				max=arr[index+1];
			}
		} 
		//System.out.println("Length of Longest name is "+ length);
		//System.out.println("Longest name  "+max);
		return max;



	}

	void display(String name) {
		for(int index=0; index<name.length();index++) {
		if (index%2!=0)
			 System.out.print(name.charAt(index));
		}	
	}

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("How many name you like to compare . ");
		int length = scan.nextInt();
		String[] name = new String[length];

		for(int index=0; index<length;index++) {
			System.out.println("Enter name "+(index+1));
			name[index]=scan.next();		
		}
		Exam exam = new Exam();	
		String longestName = exam.getMaxLength(name);
		System.out.println(longestName);

		exam.display(longestName);		
	}
}
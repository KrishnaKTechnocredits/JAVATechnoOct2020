package raghvendra;

import java.util.Scanner;

public class Exam1 {
	String maxLength(String[] arr) {
		String firstName=null;
		firstName= arr[0];
		for (int index=0;index<arr.length;index++) {
			if(arr[index].length()>firstName.length())
				firstName=arr[index];
		}	
		System.out.println("Name having Max length is:"+firstName);
		display(firstName);
		return firstName;
	}
	
	void display(String arr) {
		System.out.println("Character at even places strating from index 0 are:");
		for (int index=0;index<arr.length();index++) {
			if(index%2==0)
				System.out.print(arr.charAt(index));
			}	
	}
	public static void main(String[] args) {
		System.out.println("How Many name would you like to enter");
		Scanner sc=new Scanner(System.in);
		int length=sc.nextInt();
		String[] name=new String[length];
		for (int index=0;index<length;index++) {
			System.out.println("Enter names");
			name[index]=sc.next();
		}
		sc.close();
		Exam1 exam1=new Exam1();
		exam1.maxLength(name);
		}
}

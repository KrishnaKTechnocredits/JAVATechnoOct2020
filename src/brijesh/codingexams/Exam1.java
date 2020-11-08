package brijesh.codingexams;

import java.awt.DisplayMode;
import java.util.Scanner;

import javax.xml.ws.Dispatch;

public class Exam1 {

	String getMaxLengthName(String[] arr) {
		int max=arr[0].length();
		String maxString=arr[0];
		for(int i=1; i<arr.length;i++) {
			if(arr[i].length()>max) {
				max=arr[i].length();
				maxString=arr[i];
			}
		}
		System.out.println("String which has maximum length\n"+maxString+" ----> "+max);
		return maxString;
	}

	void display(String name) {
		System.out.println("Even characters of name "+name);
		for(int i=0; i<name.length();i++) {
			if(i%2 != 0)
				System.out.print(name.charAt(i));
		}
	}

	public static void main(String[] args) {
		Exam1 exam1 = new Exam1();
		Scanner scanner = new Scanner(System.in);
		System.out.println("Please enter total number of names: ");
		int total=scanner.nextInt();
		String[] arr= new String[total];
		for(int i=0; i<total;i++) {
			System.out.println("Please Enter Name "+(i+1)+" :");
			arr[i]=scanner.next();
		}
		String maxString=exam1.getMaxLengthName(arr);
		exam1.display(maxString);
		scanner.close();
	}

}

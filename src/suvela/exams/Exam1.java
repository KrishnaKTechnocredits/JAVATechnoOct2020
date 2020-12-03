package suvela;

import java.util.Scanner;

public class Exam1 {
	 String s;
	String maxlength(String[] name) {
		int maxlength=0;
		for(int index =0;index<name.length;index++) {
			if(maxlength <=name[index].length()) {
				maxlength = name[index].length();
				String s1 = name[index];
				this.s = s1;
			}
			
		}
		System.out.println("Maximum length is : " +maxlength +" and String is "+s);
		return s;
	}
	void display(String name) {
		for(int i =0;i<name.length();i++) {
			if(i%2==0)
		System.out.print(name.charAt(i));
		}
	}
	public static void main(String[] args) {
		Exam1 exam = new Exam1();
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter length of the array: ");
		int length = sc.nextInt();
		String[] names = new String[length];
		
		for(int index =0;index<names.length;index++) {
			System.out.println("Enter name ");
			names[index] = sc.next();
		}
		String name =exam.maxlength(names);
		System.out.println("Even characters of string " +name+" are as below: ");
		exam.display(name);
		sc.close();
	}
	

}

//1) print name having maximum length and print its length also.
//Add Adv : if you can scanner class.
//String[] name = {"Harsh","maulik","Technocredits","Krishna"};
//output : Technocredits -> 13
//
//	String getMaxLengthName(String[] arr){
//	{
//		return name;
//	}
//
//2) display method to print all even charcter of the name having maximum length.
//   void display(String name){
//   
//   }
package dhara.codingExam;

import java.io.StreamCorruptedException;
import java.util.Scanner;

public class Exam1 {
	
	String getMaxLengthName(String[] string) {
		int maxLen=string[0].length();
		String maxString= string[0];
		for(int i=0;i<=string.length;i++) {
			if(string[i].length()>maxLen) {
				maxLen=string[i].length();
				maxString=string[i];
			}
		}
		System.out.println("Maxinum number String is : "+maxString+ "--->"+maxLen);
		return maxString;
		
	}
	
	void getEvenChar(String name) {
		System.out.println("Even characters are : "+name);
		for(int i=0; i<name.length();i++) {
			if(i%2 != 0)
				System.out.print(name.charAt(i));
		}
		
	}
	

	public static void main(String[] args) {
		Exam1 exam1=new Exam1();
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter total nymber of name you want to add : ");
		int totalNames=sc.nextInt();
		String[] string= new String[totalNames];
		for(int i=0;i<totalNames;i++)
		{
			System.out.println("Add names "+(i+1)+" :");
			string[i]=sc.next();
		}
		String maxString=exam1.getMaxLengthName(string);
		exam1.getEvenChar(maxString);
		sc.close();
		
		
	}
}

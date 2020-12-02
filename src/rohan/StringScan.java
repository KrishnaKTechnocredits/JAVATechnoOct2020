package rohan;

import java.util.Scanner;

/*Coding Exam 1: 8th Nov'2020
1) print name having maximum length and print its length also.
Add Adv : if you can scanner class.
String[] name = {"Harsh","maulik","Technocredits","Krishna"};
output : Technocredits -> 13

String getMaxLengthName(String[] arr){
{
return name;
}

2) display method to print all even charcter of the name having maximum length.
void display(String name){

}*/

public class StringScan {

	String getMaxLength(String[] arr) {
		String maxStr = arr[0];
		for(int i=0;i<arr.length;i++) {
			if(maxStr.length() < arr[i].length())
				maxStr = arr[i];
		}
		System.out.println(maxStr + "--> "+ maxStr.length());
		return maxStr;
	}
	
	void displayEvenChar(String str) {
		System.out.println("Display Characters at odd index: ");
		for(int i=1;i<str.length();i++) {
			if(!(i%2==0))
				System.out.println(str.charAt(i));
		}
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter number of Strings in your array: ");
		int length = sc.nextInt();
		String[] strArray = new String[length];
		
		for(int i=0;i<length;i++) {
			System.out.println("Enter String "+(i+1));
			strArray[i] = sc.next();
		}
		StringScan stringScan = new StringScan();
		String maxStr = stringScan.getMaxLength(strArray);
		//System.out.println(maxStr);
		stringScan.displayEvenChar(maxStr);
	}
}

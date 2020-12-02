package anjaliP;
/*1) print name having maximum length and print its length also.
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
import java.util.Scanner;

public class Exam1 {
	String getMaximumLengthName(String[] arr) {
		int maxlength=0;
		String maxname =arr[0];
		for(int i=0; i<arr.length;i++) {
			if (arr[i].length()>maxlength) {
				maxlength=arr[i].length();
				maxname=arr[i];
			}
		}
		System.out.println("Maximum Lenght name is :"+maxname+" and its lenght is :"+maxlength);
		return maxname;
	}
	void displayEvenCharacters(String name) {
		for(int i=1; i<name.length();i++) {
			if(i%2!=0)
			System.out.println(name.charAt(i));
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
		String maxString=exam1.getMaximumLengthName(arr);
		System.out.println("Display Even Char of the String with MaxLength :");
		exam1.displayEvenCharacters(maxString);
	}
}
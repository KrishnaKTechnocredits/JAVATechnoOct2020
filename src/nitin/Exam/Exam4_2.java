package nitin.Exam;

import java.util.Arrays;

/* Exam 4 - Program 2: WAP to find two String are identical or not
input 1: 
String s1 = "technoCredits";
String s2 = "teChnoCreditS";
output 1: both string are not identical
input 2:
String s1 = "pune";
String s2 = "pune";
output 2: both string are identical*/
public class Exam4_2 {
	void findStringIdentical(String str1,String str2) {
		System.out.println("Input String 1 -->"+str1);
		System.out.println("Input String 2 -->"+str2);
		//System.out.print("Common Element Between Two Arrays --> ");
		boolean flag=false;	
		for(int index=0;index<str1.length();index++) {
			char ch= str1.charAt(index);
			for(int inner=0;inner<str2.length();inner++) {
				char ch1= str2.charAt(inner);
				if(str1.length()!=str2.length()) {
					System.out.println("Input String's length are not Identical.");;
				}else if(Character.isLowerCase(ch)==Character.isLowerCase(ch1) && Character.isUpperCase(ch)==Character.isUpperCase(ch1)) {
					flag=true;
				}else
					flag=false;
			}
		}
		if(flag)
			System.out.println("Both Input Strings are identical");
		else
			System.out.println("Both Input Strings are not identical");
	}
	public static void main(String[] args) {
		new Exam4_2().findStringIdentical("technoCredits","teChnoCreditS");
		System.out.println();
		new Exam4_2().findStringIdentical("pune","pune");
	}
}

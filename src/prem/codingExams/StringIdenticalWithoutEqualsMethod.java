package prem.codingExams;

import java.util.Scanner;

	public class StringIdenticalWithoutEqualsMethod {
		
		void processData(String st1, String st2) {
			if(st1.length() == st2.length()) {
				boolean flag = true;
				for(int i=0; i<st1.length(); i++) {
					char ch1 = st1.charAt(i);
					char ch2 = st2.charAt(i);
					if(ch1!=ch2) {
						flag = false;
						break;
					}	
				}
				
				if(flag) {
					System.out.println("Strings are identical");
				}
				else
					System.out.println("Strings are not identical");	
			}
		}

		public static void main(String[] args) {
			
			Scanner sc = new Scanner(System.in);
			System.out.println("Please Enter First String :");
			String str1 = sc.next();
			System.out.println("Please Enter Second String :");
			String str2 = sc.next();
			
			StringIdenticalWithoutEqualsMethod StringIdenticalWithoutEqualsMethod = new StringIdenticalWithoutEqualsMethod();
			StringIdenticalWithoutEqualsMethod.processData(str1, str2);
		}
}



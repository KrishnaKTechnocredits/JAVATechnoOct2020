package prasad;
/*12:22*/

import java.util.Scanner;
public class Exam1 {
	void setdata(String[]names) {
		System.out.println("Please enter names");
		for(int index=0;index<names.length;index++) {
			Scanner sc = new Scanner(System.in);
			names[index] = sc.next();
		}	
	}
	String getMaxLengthName (String[]names) {
		String maxlengthname = names[0];
		for(int index=0;index<names.length;index++) {
				if(names[index].length()>names[0].length()) {
					maxlengthname=names[index];
				}
		}
		
		return maxlengthname;
	}
	
	 void printevenchar(String name) {
		 for(int index=1;index<name.length();index++) {
			 	if(index%2==0) {
			 		System.out.print(name.charAt(index));
			 	}	
		 }
	}
	 
public static void main (String[]arg){
	Exam1 exam1 = new Exam1();
	Scanner scanner = new Scanner(System.in);
	System.out.println("How many names do you want to enter: ");
	int count = scanner.nextInt();
	String [] names = new String[count];
	exam1.setdata(names);
	String maxlengthname = exam1.getMaxLengthName(names);
	System.out.println("Entered name with max length:- " + maxlengthname );
	exam1.printevenchar(maxlengthname);
	}
}
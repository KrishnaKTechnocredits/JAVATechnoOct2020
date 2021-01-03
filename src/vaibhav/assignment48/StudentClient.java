package vaibhav.assignment48;

import java.util.ArrayList;
import java.util.Collections;

public class StudentClient {

	public static void main(String[] args) {
		StudentDetails studentDetails1 = new StudentDetails(10, "Vaibhav", 6);
		StudentDetails studentDetails2 = new StudentDetails(13, "Niraj", 7);
		StudentDetails studentDetails3 = new StudentDetails(19, "Vinod", 5);
		StudentDetails studentDetails4 = new StudentDetails(23, "Rohan", 9);
		StudentDetails studentDetails5 = new StudentDetails(30, "Maulik", 3);
		StudentDetails studentDetails6 = new StudentDetails(25, "Aarav", 1);
		
		ArrayList<StudentDetails> stdArrayList = new ArrayList<StudentDetails>();
		stdArrayList.add(studentDetails1);
		stdArrayList.add(studentDetails2);
		stdArrayList.add(studentDetails3);
		stdArrayList.add(studentDetails4);
		stdArrayList.add(studentDetails5);	
		stdArrayList.add(studentDetails6);
		
		Collections.sort(stdArrayList);		
		System.out.println(stdArrayList);
		
		

	}

}

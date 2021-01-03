package suvela.assignment48;

import java.util.ArrayList;
import java.util.Collections;

public class StudentNameSorting {
	public static void main(String[] args) {
		ArrayList<StudentInfo> al = new ArrayList<StudentInfo>();
		al.add(new StudentInfo(1,"Soham",6));
		al.add(new StudentInfo(6,"Alisha",11));
		al.add(new StudentInfo(9,"Riya",1));
		al.add(new StudentInfo(3,"Mayur",8));
		al.add(new StudentInfo(12,"Ruchira",5));

		System.out.println("Before sorting:" +al);
		Collections.sort(al);
		System.out.println("After sorting:" +al);		
	}
}

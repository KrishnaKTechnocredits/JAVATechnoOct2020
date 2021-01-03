package milind.Assignment_48;

import java.util.ArrayList;
import java.util.Collections;

import milind.ComparableExample.Student;

public class StudentSortingOnName {
	
	public static void main(String[] args) {
		ArrayList<Student> arrayList = new ArrayList<Student>(); 
		Student s1 = new Student(101, "Milind", 'A');
		Student s2 = new Student(103, "Bhairavi", 'C');
		
		arrayList.add(s1);
		arrayList.add(s2);
		 
		System.out.println(arrayList);
		Collections.sort(arrayList);
		System.out.println(arrayList);
	}


}

package deepak.assignment48;

import java.util.ArrayList;
import java.util.Collections;

public class SortStudentOnName {

	public static void main(String[] args) {
		
		ArrayList<Student> al = new ArrayList<Student>();
		
		al.add(new Student(1, "Ankita", 10));
		al.add(new Student(2, "Alia", 5));
		al.add(new Student(3, "Anil", 6));
		al.add(new Student(4, "Deepak", 5));
		al.add(new Student(5, "Dilip", 6));
		
		
		System.out.println("Before Sorting: "+ al);
		Collections.sort(al);
		System.out.println("After Sorting: "+ al);
	}

}

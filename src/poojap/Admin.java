package poojap;

import java.util.ArrayList;
import java.util.Collections;

public class Admin {

	public static void main(String[] args) {

		Student_Comparable student_Comparable1 = new Student_Comparable("Yogita", 106, 14);
		Student_Comparable student_Comparable2 = new Student_Comparable("Anil", 101, 12);
		Student_Comparable student_Comparable3 = new Student_Comparable("Ankita", 102, 11);
		Student_Comparable student_Comparable4 = new Student_Comparable("Pooja", 103, 10);

		ArrayList<Student_Comparable> list = new ArrayList<Student_Comparable>();
		list.add(student_Comparable1);
		list.add(student_Comparable2);
		list.add(student_Comparable3);
		list.add(student_Comparable4);

		Collections.sort(list);
		System.out.println("Student Sorted List :\n" + list);

	}
}

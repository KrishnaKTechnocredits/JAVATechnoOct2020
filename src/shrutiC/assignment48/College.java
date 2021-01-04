package shrutiC.assignment48;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class College {

	public static void main(String[] args) {

		Student student1 = new Student("Shruti", 12, 10);
		Student student2 = new Student("Kaustubh", 5, 12);
		Student student3 = new Student("Pradnya", 10, 6);
		Student student4 = new Student("Sai", 14, 7);
		Student student5 = new Student("Rohan", 9, 6);
		Student student6 = new Student("Prabhas", 4, 1);

		List<Student> studentList = new ArrayList<>();
		studentList.add(student1);
		studentList.add(student2);
		studentList.add(student3);
		studentList.add(student4);
		studentList.add(student5);
		studentList.add(student6);
		
		Collections.sort(studentList);

		System.out.println("Sorted Student List by name : ");
		for (Student student : studentList)
			System.out.println(student);
	}

}

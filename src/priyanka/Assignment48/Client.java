package priyanka.Assignment48;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Client {

	public static void main(String[] args) {
		Student student1 = new Student("Priya", 100, 9);
		Student student2 = new Student("Amit", 101, 12);
		Student student3 = new Student("Rani", 102, 6);
		Student student4 = new Student("Sandeep", 103, 10);

		List<Student> studentList = new ArrayList<>();
		studentList.add(student1);
		studentList.add(student2);
		studentList.add(student3);
		studentList.add(student4);
		Collections.sort(studentList);

		System.out.println("After sorting: ");
		for (Student student : studentList)
			System.out.println(student);
	}

}

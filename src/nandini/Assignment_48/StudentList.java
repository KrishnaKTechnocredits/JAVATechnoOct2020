package nandini.Assignment_48;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class StudentList {
	
	public static void main(String[] args) {
		Student student1 = new Student("Apoorva", 2456, 15);
		Student student2 = new Student("Akshita", 2457, 16);
		Student student3 = new Student("Deovrat", 2458, 17);
		Student student4 = new Student("Pulkit", 2459, 18);
		
		List<Student> studentList = new ArrayList<>();
		studentList.add(student1);
		studentList.add(student2);
		studentList.add(student3);
		studentList.add(student4);
		Collections.sort(studentList);
		for(Student student: studentList)
			System.out.println(student);
	}

}

package technoCredits.collectionDemo.comparatorDemo;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import ankit.inBetweenMethodsCall.StudentEvaluation;

public class Admin {

	public static void main(String[] args) {
		Student student1 = new Student("Student1", 10, 4, 97, 'A');
		Student student3 = new Student("Student3", 8, 2, 72, 'C');
		Student student4 = new Student("Student4", 14, 9, 64, 'D');
		Student student2 = new Student("Student2", 6, 7, 87, 'B');
	
		ArrayList<Student> listOfStudent = new ArrayList<Student>();
		listOfStudent.add(student1);
		listOfStudent.add(student2);
		listOfStudent.add(student3);
		listOfStudent.add(student4);
		
		Collections.sort(listOfStudent, new Student());
		System.out.println(listOfStudent);
		//Collections.reverse(listOfStudent);
		//System.out.println(listOfStudent);
	}
}

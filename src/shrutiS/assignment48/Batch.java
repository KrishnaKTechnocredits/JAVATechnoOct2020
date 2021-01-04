/*Assignment : 48

Student class having attribute -> studentId, studentName, studentStd.
A) Use comparable to sort all students based on studentName.*/
package shrutiS.assignment48;

import java.util.ArrayList;
import java.util.Collections;

public class Batch {
	public static void main(String[] args) {
		Student Student1 = new Student(10, "Shruti", 6);
		Student Student2 = new Student(13, "Swati", 7);
		Student Student3 = new Student(19, "Anjali", 5);
		Student Student4 = new Student(23, "Priyanka", 9);
		Student Student5 = new Student(30, "Vaishu", 3);
		Student Student6 = new Student(25, "Poonam", 1);
		
		ArrayList<Student> stdArrayList = new ArrayList<Student>();
		stdArrayList.add(Student1);
		stdArrayList.add(Student2);
		stdArrayList.add(Student3);
		stdArrayList.add(Student4);
		stdArrayList.add(Student5);	
		stdArrayList.add(Student6);
		
		Collections.sort(stdArrayList);		
		System.out.println(stdArrayList);
	}
}

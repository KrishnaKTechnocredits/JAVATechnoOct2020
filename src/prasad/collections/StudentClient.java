package prasad.collections;

import java.util.TreeSet;

/*Assignment : 48

Student class having attribute -> studentId, studentName, studentStd.
A) Use comparable to sort all students based on studentName.*/


public class StudentClient {
	
	public static void main (String[]arg) {
		TreeSet<Student> studentList = new TreeSet<>();
		Student s1 = new Student("Brendon",101,1);
		Student s2 = new Student("Harry",102,3);
		Student s3 = new Student("Donald",103,5);
		Student s4 = new Student("Eon",104,2);
		Student s5 = new Student("Clair",105,2);
		Student s6 = new Student("Frank",106,9);
		Student s7 = new Student("Albert",112,1);
		Student s8 = new Student("George",112,1);
		Student s9 = new Student("Ilan",111,1);
		
		studentList.add(s1);
		studentList.add(s2);
		studentList.add(s3);
		studentList.add(s4);
		studentList.add(s5);
		studentList.add(s6);
		studentList.add(s7);
		studentList.add(s8);
		studentList.add(s9);
		
		System.out.println(studentList);
	}
}

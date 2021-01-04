package ritika.Assignments.asgmt_48;

import java.util.ArrayList;
import java.util.Collections;

public class StudentSorting {

	public static void main(String[] args) {
		
		ArrayList<Student> studentList = new ArrayList<Student>();
		studentList.add(new Student("Ritika", 1111, 7));
		studentList.add(new Student("Maulik", 2222, 8));
		studentList.add(new Student("Krishna", 4444, 6));
		studentList.add(new Student("Harsh", 5555, 9));
		studentList.add(new Student("Sanyam", 3333, 5));
		
		Collections.sort(studentList);;
		System.out.println(studentList);
	}
}

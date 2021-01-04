package suresh;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
public class BaseClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Student student1 = new Student("Rajesh", 1245, 9);
		Student student2 = new Student("Suresh", 1246, 12);
		Student student3 = new Student("Harish", 1244, 6);
		Student student4 = new Student("Sandeep", 1249, 10);
		
		List<Student> studentList = new ArrayList<>();
		studentList.add(student1);
		studentList.add(student2);
		studentList.add(student3);
		studentList.add(student4);
		Collections.sort(studentList);
		
		System.out.println("After sorting Data: ");
		for(Student student: studentList)
			System.out.println(student);
	}
}
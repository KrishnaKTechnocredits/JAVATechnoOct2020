package ruby.collections;

import java.util.ArrayList;
import java.util.Collections;

/*Student class having attribute -> studentId, studentName, studentStd.
A) Use comparable to sort all students based on studentName.*/

public class A48Compare {

	public static void main(String[] args) {

		ArrayList<A48Student> studentList = new ArrayList<A48Student>();
		studentList.add(new A48Student(1, "Anni", 8));
		studentList.add(new A48Student(2, "Binny", 6));
		studentList.add(new A48Student(3, "Dolly", 4));
		studentList.add(new A48Student(4, "Cindy", 8));

		Collections.sort(studentList);
		System.out.println(studentList);
	}
}

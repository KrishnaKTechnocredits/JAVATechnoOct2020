package nagendra.Assignment48;

import java.util.ArrayList;
import java.util.Collections;

public class ComparableAssignment48 {

	public static void main(String[] args) {
		ArrayList<Student> al = new ArrayList<Student>();
		al.add(new Student(1, "Nagendra", 9));
		al.add(new Student(3, "Ravindra", 29));
		al.add(new Student(2, "Jitendra", 99));
		Collections.sort(al);
		System.out.println(al);
	}
}

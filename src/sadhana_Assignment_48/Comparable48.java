package sadhana_Assignment_48;

import java.util.ArrayList;
import java.util.Collections;

public class Comparable48 {

	public static void main(String[] args) {
		ArrayList<Student> al = new ArrayList<Student>();
		al.add(new Student(11, "Pallavi", 45));
		al.add(new Student(1, "Srushti", 100));
		al.add(new Student(4, "Pooja", 67));
		Collections.sort(al);
		System.out.println(al);
	}
}

package anjaliS;

import java.util.ArrayList;
import java.util.Collections;

public class Admin {

	public static void main(String[] args) {

		ArrayList<StudentDetails> list = new ArrayList<StudentDetails>();

		StudentDetails std1 = new StudentDetails(100, "Anjali", "12th");
		StudentDetails std2 = new StudentDetails(101, "Yogita", "11th");
		StudentDetails std3 = new StudentDetails(102, "Shweta", "1oth");

		list.add(std1);
		list.add(std2);
		list.add(std3);

		Collections.sort(list);
		System.out.println("StudentDetails\n" + list);
	}

}

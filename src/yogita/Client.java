package yogita;

import java.util.ArrayList;
import java.util.Collections;

public class Client {
	public static void main(String[] args) {

		ArrayList<Student_Data> al = new ArrayList<Student_Data>();

		Student_Data std1 = new Student_Data(101, "Sanket", "10th");
		Student_Data std2 = new Student_Data(102, "Vivek", "12th");
		Student_Data std3 = new Student_Data(103, "Ramesh", "13th");
		Student_Data std4 = new Student_Data(104, "Akash", "14th");

		al.add(std1);
		al.add(std2);
		al.add(std3);
		al.add(std4);

		Collections.sort(al);
		System.out.println("Student_Details:" + al);
	}

}

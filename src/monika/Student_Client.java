package monika;
/*

Assignment : 48
 Student class having attribute -> studentId, studentName, studentStd.
  A) Use comparable to sort all students based on studentName.
*/

import java.util.ArrayList;
import java.util.Collections;

public class Student_Client {
	public static void main(String[] args) {

		ArrayList<Student_Data> b = new ArrayList<Student_Data>();

		Student_Data std1 = new Student_Data(1, "Monika", "9th");
		Student_Data std2 = new Student_Data(2, "sonia", "12th");
		Student_Data std3 = new Student_Data(3, "sai", "11th");
		

		b.add(std1);
		b.add(std2);
		b.add(std3);
		

		Collections.sort(b);
		System.out.println("Student_Details:" + b);
	}

}
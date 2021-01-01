package raghvendra.Collection;
import java.util.ArrayList;
import java.util.Collections;
/*Assignment : 48

Student class having attribute -> studentId, studentName, studentStd.
A) Use comparable to sort all students based on studentName.*/
public class ComparableStudentExample {

	public static void main(String[] args) {
		ArrayList<StudentPojoForComparable> listOfStudent=new ArrayList<StudentPojoForComparable>();
		StudentPojoForComparable studentPojoForComparable=new StudentPojoForComparable(123, "Raghv", 10);
		StudentPojoForComparable studentPojoForComparable1=new StudentPojoForComparable(12, "Zaveri", 7);
		StudentPojoForComparable studentPojoForComparable4=new StudentPojoForComparable(14, "Abbas", 7);
		StudentPojoForComparable studentPojoForComparable2=new StudentPojoForComparable(153, "Sandhya", 1);
		StudentPojoForComparable studentPojoForComparable3=new StudentPojoForComparable(123, "Mastan", 10);
		listOfStudent.add(studentPojoForComparable);
		listOfStudent.add(studentPojoForComparable1);
		listOfStudent.add(studentPojoForComparable4);
		listOfStudent.add(studentPojoForComparable2);
		listOfStudent.add(studentPojoForComparable3);
		Collections.sort(listOfStudent);
		System.out.println(listOfStudent);
	}
}

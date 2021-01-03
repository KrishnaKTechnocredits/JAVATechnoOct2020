/*Assignment : 48

Student class having attribute -> studentId, studentName, studentStd.
A) Use comparable to sort all students based on studentName.
*/
package ankita.assignment.collection;
import java.util.ArrayList;
import java.util.Collections;

public class SortStudentName {
	public static void main(String[] args) {
		ArrayList<StudentInfo> al = new ArrayList<StudentInfo>();
		al.add(new StudentInfo(1,"Ankita",9));
		al.add(new StudentInfo(2,"Alia",10));
		al.add(new StudentInfo(6,"Riya",8));
		al.add(new StudentInfo(3,"Neha",8));
		al.add(new StudentInfo(5,"Jui",9));
		
		Collections.sort(al);
		System.out.println(al);		
	}
}

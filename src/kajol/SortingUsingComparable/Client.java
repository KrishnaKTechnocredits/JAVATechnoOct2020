/*Assignment : 48

Student class having attribute -> studentId, studentName, studentStd.
A) Use comparable to sort all students based on studentName.*/

package kajol.SortingUsingComparable;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Client {
	public static void main(String[] args) {
		SortStudents student1= new SortStudents("ABC",101,7);
		SortStudents student2= new SortStudents("XYZ",102,5);
		SortStudents student3= new SortStudents("MNO",104,4);
		SortStudents student4= new SortStudents("PQR",103,6);
		
		List<SortStudents> list=new ArrayList<>();
		list.add(student1);
		list.add(student2);
		list.add(student3);
		list.add(student4);
		Collections.sort(list);
		System.out.println("After Sorting");
		for(SortStudents s: list)
			System.out.println(s);
	}
}

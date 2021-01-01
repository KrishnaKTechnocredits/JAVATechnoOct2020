package ankita.assignment.collection;
import java.util.ArrayList;
import ankita.assignment.collection.Student;;;
public class Practise1 {

	static void getNumber(ArrayList<Student> arrayList) {
		for(int i=0;i<arrayList.size();i++) {
		System.out.println(arrayList.get(i).getNo());
		}
	}
	static void getName(ArrayList<Student> arrayList) {
		for(int i=0;i<arrayList.size();i++) {
		System.out.println(arrayList.get(i).getName());
		}
	}
	
	public static void main(String[] args) {
		ArrayList<Student> arrayList = new ArrayList<Student>();
		
		Student s1 = new Student(5, "ankita");
		Student s2 = new Student(6, "suv");
		Student s3 = new Student(7, "neha");
		
		arrayList.add(s1);
		arrayList.add(s2);
		arrayList.add(s3);
		
		getNumber(arrayList);
		getName(arrayList);
	}	
}

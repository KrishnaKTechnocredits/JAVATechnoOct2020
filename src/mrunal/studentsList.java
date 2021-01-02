package mrunal;
import java.util.TreeSet;

public class studentsList {
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TreeSet<student> studentList = new TreeSet<>();
		
		student s1 = new student("nilam",123,1);
		student s2 = new student("raj",456,2);
		student s3 = new student("hrudra",789,3);
		student s4 = new student("drishti",1011,4);
		
		studentList.add(s1);
		studentList.add(s2);
		studentList.add(s3);
		studentList.add(s4);
		
		System.out.println(studentList);
		
	}
	}



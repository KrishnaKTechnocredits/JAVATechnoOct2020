package technoCredits.collectionDemo;

import java.util.ArrayList;

public class ArrayListEx3 {
	
	static public void printAllStudentRno(ArrayList<Student> studentInfoList) {
		for(int index=0;index<studentInfoList.size();index++) {
			System.out.println(studentInfoList.get(index).getStdRno());
		}
	}
	
	static public void printAllStudentName(ArrayList<Student> studentInfoList) {
		for(int index=0;index<studentInfoList.size();index++) {
			//Student s1 = studentInfoList.get(index);
			System.out.println(studentInfoList.get(index).getStdName());
		}
	}
	
	static public Student getInfo(ArrayList<Student> studentList) {
		int maxRnoIndex = 0;
		int maxRno = 0;
		Student student = null;
		for(int index=0; index<studentList.size();index++) {
			student = studentList.get(index);
			if(student.getStdRno() > maxRno) {
				maxRno = student.getStdRno();
				maxRnoIndex = index;
			}
		}
		return studentList.get(maxRnoIndex);
	}
	
	public static void main(String[] args) {
		ArrayList<Student> studentInfoList = new ArrayList<Student>();
/*		studentInfoList.add(1);
		studentInfoList.add("Prasad");
		
		studentInfoList.add(2);
		studentInfoList.add("Vaibhav");
		
		studentInfoList.add("Yogita");
		studentInfoList.add(3);
*/		
		Student student1 = new Student(100, "Prasad");
		//System.out.println(student1); // XYZ
		Student student2 = new Student(122, "Vaibhav");
		Student student3 = new Student(3, "Yogita");
		
		studentInfoList.add(student1);
		studentInfoList.add(student2);
		studentInfoList.add(student3);
		
		printAllStudentName(studentInfoList);
		Student student = getInfo(studentInfoList);
		//Student student = studentInfoList.get(index);
		System.out.println(student);
	}
}

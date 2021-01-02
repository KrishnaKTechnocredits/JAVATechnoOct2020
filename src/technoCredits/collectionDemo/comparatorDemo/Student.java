package technoCredits.collectionDemo.comparatorDemo;

import java.util.Comparator;

public class Student implements Comparator<Student>,Comparable<Student>{
	
	String name;
	int rno;
	int standard;
	int marks;
	char grade;
	
	public Student() {
		
	}
	
	public Student(String name, int rno, int standard, int marks, char grade) {
		super();
		this.name = name;
		this.rno = rno;
		this.standard = standard;
		this.marks = marks;
		this.grade = grade;
	}
	
	public String toString() {
		return this.name + "-" + marks + "-" + grade;
	}

	@Override
	public int compare(Student o1, Student o2) {
		return o1.name.compareTo(o2.name);
	}

	@Override
	public int compareTo(Student o) {
		return this.standard - o.standard;
	}
}

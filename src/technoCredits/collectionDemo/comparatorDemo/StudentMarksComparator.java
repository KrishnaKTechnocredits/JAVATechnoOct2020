package technoCredits.collectionDemo.comparatorDemo;

import java.util.Comparator;

public class StudentMarksComparator implements Comparator<Student> {

	@Override
	public int compare(Student std1, Student std2) {
		return std1.marks - std2.marks;
	}

	
}

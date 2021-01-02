package ritika.Assignments.asgmt_48;

public class Student implements Comparable<Student> {
	int id;
	String name;
	int standard;
	
	public Student(String name, int id, int standard) {
		this.name = name;
		this.id = id;
		this.standard = standard;
	}

	@Override
	public int compareTo(Student obj) {
		return this.name.compareTo(obj.name);
	}
	
	@Override
	public String toString() {
		return this.name + "-" + this.id + "-" + this.standard;
	}
}

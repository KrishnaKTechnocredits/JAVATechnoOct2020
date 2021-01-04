package ruby.collections;

public class A48Student implements Comparable<A48Student> {
	int id, std;
	String name;

	public A48Student(int id, String name, int std) {
		super();
		this.id = id;
		this.std = std;
		this.name = name;
	}

	@Override
	public int compareTo(A48Student student) {
		return this.name.compareTo(student.name);
	}

	// When sort by Student id
	/*
	 * @Override public int compareTo(A48Student student) { return
	 * compareTo(student.id); }
	 */

	public String toString() {
		return this.name + " " + this.id + " " + this.std;
	}
}

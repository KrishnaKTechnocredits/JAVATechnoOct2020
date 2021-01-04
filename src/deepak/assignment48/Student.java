package deepak.assignment48;

public class Student implements Comparable<Student>  {
	
	int rollNo;
	String name;
	int std;
	
	Student(int rollNo, String name, int std ){
		
		this.rollNo =  rollNo;
		this.name = name;
		this.std = std;
	}
	
	
	@Override
	public int compareTo(Student o) {
		
		return this.name.compareTo(name);
	}
	
	public String toString(){
		return rollNo + ":" + name + ":" + std;
	}

}

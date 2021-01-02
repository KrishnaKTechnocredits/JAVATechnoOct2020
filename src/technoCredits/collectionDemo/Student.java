package technoCredits.collectionDemo;

public class Student {
	private int stdRno;
	private String stdName;
	
	Student(int stdRno, String stdName){
		this.stdRno = stdRno;
		this.stdName = stdName;
	}
	
	public int getStdRno() {
		return stdRno;
	}
	
	public String getStdName() {
		return stdName;
	}
	
	@Override
	public String toString() {
		return stdRno + "-:-" + stdName;
	}
}

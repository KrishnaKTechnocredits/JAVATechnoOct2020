package technoCredits.multithreading;

public class Employee1 extends Thread{
	
	@Override
	public void run() {
		processData();
	}
	
	void m1() {
		for(int i=201;i<=300;i++) {
			System.out.println("Employee1 : " + i);
		}
	}
	
	void processData() {
		for(int i=1;i<=100;i++) {
			System.out.println("Employee1 : " + i);
		}
	}
}

package technoCredits.multithreading.runnableExample;

public class Client {

	public static void main(String[] args) {
		Employee1 employee1 = new Employee1();
		Employee2 employee2 = new Employee2();
		
		Thread t1 = new Thread(employee1);
		Thread t2 = new Thread(employee2);
		
		t1.start();		
		t2.start();
		
		//employee1.start();
		//employee2.start();
	}
}

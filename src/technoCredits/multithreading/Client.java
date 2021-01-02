package technoCredits.multithreading;

public class Client {
	
	public static void main(String[] args) throws InterruptedException {
		Employee1 emp1 = new Employee1();
		Employee2 emp2 = new Employee2();
		
		emp1.setPriority(Thread.MAX_PRIORITY);
		emp1.start();
		emp2.start();
		System.out.println("At the last line of main method");
		//emp1.processData();
		//emp2.processData();
		Thread.currentThread().getPriority();
		//emp1.start();
		emp2.join();
		System.out.println("Vaibhav");
	}
}

package technoCredits.multithreading;

public class Employee2 extends Thread{
	
	@Override
	public void run() {
		processData();
	}
	
	void processData() {
		for(int i=101;i<=200;i++) {
			System.out.println("Employee2 : " + i + " : " + getPriority());
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
}

package technoCredits.multithreading.runnableExample;

public class Employee2 implements Runnable {
	
	@Override
	public void run() {
		processData();
	}
	
	void processData() {
		for(int i=101;i<=200;i++) {
			try {
				Thread.sleep(100);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			System.out.println(i);
		}
	}
}

package technoCredits.multithreading.runnableExample;

public class Employee1 implements Runnable {
	
	@Override
	public void run() {
		processData();
	}
	
	void processData() {
		for(int i=1;i<=100;i++) {
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

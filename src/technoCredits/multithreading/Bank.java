package technoCredits.multithreading;

public class Bank {

	synchronized void debit() {
		for(int i=1;i<=100;i++) {
			System.out.println(Thread.currentThread().getName()  + " : " + i);
		}
	}
}

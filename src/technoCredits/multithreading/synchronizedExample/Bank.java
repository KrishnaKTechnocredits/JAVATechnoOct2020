package technoCredits.multithreading.synchronizedExample;

public class Bank {
	int balance = 10000;
	
	synchronized void debitAmt(int amount) {
		System.out.println(Thread.currentThread().getName() + " is trying to debit amount");
		if(amount <= this.balance) {
			/*try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}*/
			this.balance -= amount;
		}else {
			System.out.println("Insufficient balance");
		}
		System.out.println(Thread.currentThread().getName() + " Now balance is " + balance);
	}
	
	
}

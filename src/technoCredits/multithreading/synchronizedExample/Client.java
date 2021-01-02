package technoCredits.multithreading.synchronizedExample;

public class Client {

	public static void main(String[] args) throws InterruptedException {
		Bank bankAccount = new Bank();
		Thread.currentThread().setName("Client Thread");
		User user1 = new User(bankAccount);
		User user2 = new User(bankAccount);
		
		user1.setName("Maulik");
		user2.setName("Krishna");
		
		user1.start();
		user2.start();
		
		
		System.out.println("------" + Thread.currentThread().getName());
		
	}
}

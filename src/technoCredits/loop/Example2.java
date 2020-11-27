package technoCredits.loop;

public class Example2 {

	void display(){
		int index=1; //
		for(;;) {
			index++;
			System.out.println(index);
			if(index>=5)
				break;
		}
		System.out.println("Outside loop : " + index);
	}
	
	public static void main(String[] args) {
		new Example2().display();
	}
}

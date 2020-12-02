package technoCredits.staticNonstatic;

// I wont talk.. lets write
// Predict the output of below program.
// continue will continue loop.
public class Example11 {

	void processData(int number) {
		for(int index=1;index<=number;index++) {
			if(index %3 == 0 || index % 5 == 0) {
				continue;
			}
			System.out.println(index);
		}
	}
	
	public static void main(String[] args) {
		new Example11().processData(10);
	}
}

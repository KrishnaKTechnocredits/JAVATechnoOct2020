package technoCredits.staticNonstatic;

public class Example1 {

	static int count; // 20
	int index; // 30

	void incrementVar() {
		count += 20; //3
		index += 30; // 4
	}

	void processData() {
		incrementVar(); //2 
		if(count > 25) // 5
			count = 25;
		System.out.println(count); //6
		System.out.println(index); // 7
	} 

	public static void main(String[] args) {
		new Example1().processData(); // 1
		new Example1().processData(); // 8
		new Example1().processData(); 
	} 

}

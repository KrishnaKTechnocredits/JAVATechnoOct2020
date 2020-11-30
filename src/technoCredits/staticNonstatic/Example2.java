package technoCredits.staticNonstatic;

public class Example2 {

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
		Example2 example2 = new Example2(); // 1
		example2.processData();
		example2.processData();
	} 

}

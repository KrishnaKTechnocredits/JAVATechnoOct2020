package raghvendra.Constructor;
/*Program - 4: 
Create a class Addition and write add method for:
a) add two integers
b) add two decimal
c) add two String*/
public class Addition {
	int number1;
	int number2;
	double decimalNumber1;
	double decimalNumber2;
	String word1;
	String word2;
	
	Addition(int number_1, int number_2){
		this.number1=number_1;
		this.number2=number_2;
		intAddition(number1,number2);
	}
	Addition(double decimalNumber1, double decimalNumber2){
		this.decimalNumber1=decimalNumber1;
		this.decimalNumber2=decimalNumber2;
		decimalAddition(decimalNumber1,decimalNumber2);
	}
	Addition(String word1, String word2){
		this.word1=word1;
		this.word2=word2;
		StringAddition(word1,word2);
	}
	
	void intAddition(int number_1, int number_2) {
		System.out.println("Addition of two integer "+number_1+", "+number_2+" "+"are: "+(number_1+number_2));
	}
	void decimalAddition(double decimalNumber1, double decimalNumber2) {
		System.out.println("Addition of two decimal "+decimalNumber1+", "+decimalNumber2+" "+"are: "+(decimalNumber1+decimalNumber1));
	}
	void StringAddition(String word1, String word2) {
		System.out.println("Addition of two Strings "+word1+", "+word2+" "+"are: "+(word1+word2));
	}
	public static void main(String[] args) {
		new Addition(5, 6);
		new Addition(10.5, 12.6);
		new Addition("Techno", "Credits");
	}
}

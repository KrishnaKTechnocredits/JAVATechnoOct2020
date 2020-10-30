package ankita.practise;

public class Practise2 {

	void findMaximumOfNumbers(int number1, int number2, int number3) {
		if(number1 > number2) {
			if(number1 > number3)
				System.out.println("Maximum number is :"+number1);
			else{
				System.out.println("Maximum number is :"+number3);
			}
		}
		else if(number2 > number3) {
			System.out.println("Maximum number is:"+number2);
		}
		else 
			System.out.println("Maximum Number is : "+ number3);
	}
	void findMinimumOfNumbers(int number1, int number2, int number3) {
		if(number1 < number2 ) {
			if(number1 < number3)
				System.out.println("min num " + number1);
			else{
				System.out.println("min num " + number3);
			}
		}
		else if(number2 < number3)
			System.out.println("min num " +number2);
		else
			System.out.println("min num " + number3);
	}
		public static void main(String [] args) {
		
		Practise2 practise2 = new Practise2();
		practise2.findMinimumOfNumbers(41, 2, 18);
		practise2.findMaximumOfNumbers(25,6,40);
		practise2.findMaximumOfNumbers(5, 6, 1);
		practise2.findMaximumOfNumbers(10, 9, 4);
		practise2.findMaximumOfNumbers(14, 16, 100);
		practise2.findMinimumOfNumbers(10,9,4);
		practise2.findMinimumOfNumbers(14,16,100);
		
	}
}

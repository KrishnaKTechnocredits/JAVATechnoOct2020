package tejashree;
/*Assignment - 37 : 10th Dec'2020 
Print Fibonacci series for first 10 numbers.
output : 0, 1, 1, 2, 3, 5, 8, 13, 21, 34*/
public class Assignment37 {
		void fibonacciSeries(int number) {
			System.out.println("Fibonacci Sereis for First "+number+" numbers:");
			int number1=0,number2=1;
			int nextNumber=0;
			System.out.print(number1+","+number2);
			for(int index=2;index<number;index++) {
				nextNumber=number1+number2;
				System.out.print(","+nextNumber);
				number1=number2;
				number2=nextNumber;			
			}
		}

		public static void main(String[] args) {
			new Assignment37().fibonacciSeries(10);
		}
		
}

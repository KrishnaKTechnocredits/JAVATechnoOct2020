package nagendra;

/*
Program : 1 
swap 2 numbers with using 3rd variable

*/import java.util.Scanner;

public class SwapNumbers {

	int temp;
	
	void swapNumbers(int firstNumber,int secondNumber){
		System.out.println("<--Number After Swapping --->");
		temp=firstNumber;
		firstNumber=secondNumber;
		secondNumber=temp;
		System.out.println("First Number  is:"+firstNumber);
		System.out.println("Second Number is:"+secondNumber);
		
	}

	public static void main(String[] args) {
		SwapNumbers number=new SwapNumbers();
		Scanner scanner =new Scanner(System.in);
		System.out.println("Enter First Number :");
		int firstNumber=scanner.nextInt();
		System.out.println("Enter Second Number: ");
		int secondNumber=scanner.nextInt();
		number.swapNumbers(firstNumber, secondNumber);
		scanner.close();
	}
}

package ankita;

public class CalculateSqaureCube {
	int ans;
	void calculateSquare(int number){
		System.out.println("\nCalculating square of number..........");
		ans = number * number;
		System.out.println("Sqaure of " + number + " = " + ans);
	}
	void calculateCube(int number){
		System.out.println("\nCalculating cube of number..........");
		ans = number * number * number;
		System.out.println("Cube of " + number + " = " + ans);
	}
	public static void main(String [] args){
		CalculateSqaureCube calculateSqaureCube = new CalculateSqaureCube();
		System.out.println("======================================================");
		calculateSqaureCube.calculateSquare(9);
		calculateSqaureCube.calculateCube(9);
		System.out.println("\n======================================================");
	}
}

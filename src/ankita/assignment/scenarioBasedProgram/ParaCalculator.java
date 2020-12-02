package ankita.assignment.scenarioBasedProgram;

public class ParaCalculator {
	int ans;
	
	void addition(int num1 , int num2){
		ans = num1 + num2;
		System.out.println("Addition = " + ans);
	}
	void subtraction(int num1 , int num2){
		ans = num1 - num2;
		System.out.println("Subtraction =" + ans);  
	}
	void multiplication(int num1 , int num2){
		ans = num1 * num2;
		System.out.println("multiplication=" + ans);
	}
	void division(int num1 , int num2){
		ans = num1 / num2;
		System.out.println("division =" + ans);
	}
	public static void main(String [] args){
	
	ParaCalculator ParaCalculator1 = new ParaCalculator();
	ParaCalculator1.addition(10,20);
	ParaCalculator1.subtraction(80,30);
	ParaCalculator1.multiplication(40,5);
	ParaCalculator1.division(90,2);
	}

}

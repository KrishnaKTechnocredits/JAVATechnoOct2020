package nandini.Assignment_11;

public class Average {
	
	double average(double num1,double num2, double num3) {
		
		Sum sum = new Sum();
		double answer = sum.sum(num1,num2,num3)/2;
		return answer;
	}

}

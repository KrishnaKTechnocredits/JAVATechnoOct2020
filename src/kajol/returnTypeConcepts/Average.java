package kajol.returnTypeConcepts;

public class Average {
	
	double calculateAverage(double num1, double num2, double num3 ){
		
		//double average= new Sum().calculateSum(num1,num2,num3)/3;
		//return average;	
		return new Sum().calculateSum(num1,num2,num3)/3;
	}
	
}

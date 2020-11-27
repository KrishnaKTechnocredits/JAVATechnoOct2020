package yogita;

public class SimpleInterest{
    
  void calculateSimpleInterest(float pricipleAmount , float time ,float rateOfInterest){
	   float interest = (pricipleAmount * time * rateOfInterest) / (100);
	   System.out.println("Simple Interest Is : "+interest);
	}
	
public static void main(String [] arr){
       SimpleInterest simpleInterest = new SimpleInterest();
	   simpleInterest.calculateSimpleInterest(1400, 3.5f ,2);
    }
  }
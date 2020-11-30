package yogita;

public class Calculator
{
    int num1 = 20;
    int num2= 10;
    int ans;
   
	void addition()
    {
      ans = num1 + num2;
	  System.out.println("Addition is:"+ans);
    }
   
   void subtraction()
    {
      ans = num1 - num2;
      System.out.println("Subtraction is:"+ans);
   
    }
   
   void multiplication()
    {
      ans = num1 * num2;
      System.out.println("Multipication is:"+ans);
    }
   
   void division()
    {
      ans = num1 / num2;
      System.out.println("Division is:"+ans);
   
    }
  
 public static void main(String[] arr)
  {
	  Calculator calculator = new Calculator();
	  calculator.addition();
	  calculator.subtraction();
	  calculator.multiplication();
	  calculator.division();
  }
   
}
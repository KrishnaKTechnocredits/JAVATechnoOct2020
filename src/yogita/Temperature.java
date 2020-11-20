package yogita;

public class Temperature{
	
	void fahrenheitToCelcius(double fahrenheit){
       double celcius = ( fahrenheit - 32) * 5 / 9;
	   System.out.println(" Fahrenheit To Celcius Temperature Conversion Is:" +celcius);
	}
	
 public static void main(String [] arr){
       Temperature temperature = new Temperature();
	   System.out.println("--------------- Temperature Conversion ------------");
	   temperature.fahrenheitToCelcius(60.5);
   }
}
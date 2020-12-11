package anjaliS;

public class Temperature{
    float celcius;
	
    void fahrenheitToCelcius(float fahrenheit){
       celcius = ( fahrenheit - 32) * 5 / 9;
       System.out.println(" Fahrenheit To Celcius Temperature Conversion Is:" +celcius);
    }
      
      public static void main(String [] args){
        Temperature temperature = new Temperature();
        temperature.fahrenheitToCelcius(20.2f);
    }
}
package prem;

//Write a Java program to convert temperature from Fahrenheit to Celsius degree.
//Celsius = (fahrenheit - 32) * 5 / 9

public class ConvertTemperatureFahrenheitCelsius {

	void convertToCelsius(float fahrenheit){
		
		float celsius =(fahrenheit - 32)*5/9;
		
		System.out.println("Temperature in Celsius : "+celsius);
		
		System.out.println("Temperature in Fahrenheit : "+fahrenheit); 
	}
	
	public static void main(String[] a){
		
		ConvertTemperatureFahrenheitCelsius convertTemperatureFahrenheitCelsius = new ConvertTemperatureFahrenheitCelsius();
		
		convertTemperatureFahrenheitCelsius.convertToCelsius(98.6f);
	}
}


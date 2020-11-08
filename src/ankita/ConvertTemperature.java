package ankita;

public class ConvertTemperature {
	void covertFromFahrenheitToCelsius(float tempInFahrenheit ){
		System.out.println("\nConverting temerature from Fahrenheit to Celsius.........");
		float temperatureInCelsius = (tempInFahrenheit - 32) * 5 / 9;
		System.out.println("\n" + tempInFahrenheit + "Fahrenheit = " + temperatureInCelsius + " Celsius");
			
	}
	public static void main(String[] args){
		float temperatureInFahrenheit = 40.42f;
		System.out.println("======================================================");
		ConvertTemperature convertTemperature  = new ConvertTemperature();
		convertTemperature.covertFromFahrenheitToCelsius(temperatureInFahrenheit);
		System.out.println("\n======================================================");	
	}
}

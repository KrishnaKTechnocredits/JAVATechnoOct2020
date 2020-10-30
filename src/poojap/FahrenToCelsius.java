package poojap;

public class FahrenToCelsius {
	
	float fahrenheit;
	float celsius;
	
	void fahretoCelsius(float updatefahrenheit) {
		fahrenheit=updatefahrenheit;
		celsius =(fahrenheit-32)*5/9;
		System.out.println("Temperature From Fahrenheit to Celsius" +celsius);
	}

	public static void main(String[] args) {
		
		FahrenToCelsius fahrenToCelsius1 = new FahrenToCelsius();
		fahrenToCelsius1.fahretoCelsius(99);
	}
	
}

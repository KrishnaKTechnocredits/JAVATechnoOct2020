package vaibhav;

class TemperatureConvert{
	double Fahrenheit;
	double celsius;
	
	void fahrenheitToCelsius(double givenFahrenheit){
		Fahrenheit = givenFahrenheit;
		celsius = (Fahrenheit-32) * 5/9;
		System.out.println("Temperature into celsius is "+celsius);
	}	
	public static void main(String[] Args)
	{
		TemperatureConvert temperatureConvert = new TemperatureConvert();
		temperatureConvert.fahrenheitToCelsius(80.5);	
	}
}
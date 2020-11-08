package priya;

public class ConvertTemperature {
	float celsius;
	
	void temperature(float fahrenheit){
		float celsius = (fahrenheit - 32)*5/9;
		System.out.println("Temperature in fahrenheit is : " + fahrenheit);
		System.out.println("Temperature in celsius is : " + celsius);
	}
	public static void main(String[] args){
		ConvertTemperature temperatureConversion = new ConvertTemperature();
		temperatureConversion.temperature(12.5f);
	}	
}

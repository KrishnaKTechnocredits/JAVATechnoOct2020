package anurag;

public class Temp {

	// float celsius;

	void displayTemperatureConversion(float farenheit) {
		float celsius = (farenheit - 32) * 5 / 9;

		System.out.println("Converted temperature value in celcius is :" + celsius);
	}

	public static void main(String[] args) {
		Temp temp1 = new Temp();
		temp1.displayTemperatureConversion(100.5f);
	}
}

package priyanka;

public class ConvertTemperature {

	void converttemp(double fahrenheit) {
		double celsius = (fahrenheit - 32) * 5 / 9;
		System.out.println(" The Temperature in Fahrenheit is : " + fahrenheit);
		System.out.println(" The Temperature in Celsius is : " + celsius);
	}

	public static void main(String[] arg) {
		ConvertTemperature convertTemperature = new ConvertTemperature();
		convertTemperature.converttemp(75);
	}

}

package ruby;

/*Write a Java program to convert temperature from Fahrenheit to Celsius degree.
Celsius = (fahrenheit - 32) * 5 / 9 */

class Temperature{
	void convertTemperature(double fahrenheit){
		System.out.print(fahrenheit + " Fahrenheit "+" = "+ ((fahrenheit - 32) * 5 / 9) +" Celsius");
	}
	
	public static void main(String[] a){
		Temperature temperature = new Temperature();
		temperature.convertTemperature(110);
	}
}

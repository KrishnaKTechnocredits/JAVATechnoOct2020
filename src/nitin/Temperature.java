/*	Date - 21-Oct-2020, Day 5
	Java Assignment 3 - Program:4

4. Write a Java program to convert temperature from Fahrenheit to Celsius degree.
Celsius = (fahrenheit - 32) * 5 / 9 */
package nitin;
class Temperature{
	
	void convertToCelsius(float fahrenheit){
		float celsius =(fahrenheit - 32)*5/9;
		System.out.println("Temperature in Celsius : "+celsius);
		System.out.println("Temperature in Fahrenheit : "+fahrenheit); 
	}
	public static void main(String[] a){
		Temperature temperature = new Temperature();
		temperature.convertToCelsius(98.6f);
	}
}
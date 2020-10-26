package brijesh;
class Temperature{
	void temperatureConvert(int fahrenheit){
		System.out.println("Temperature in Celsius is :"+(fahrenheit-32)*5/9);
	}
	public static void main(String[] args){
		Temperature temperature= new Temperature();
		temperature.temperatureConvert(99);
	}
}
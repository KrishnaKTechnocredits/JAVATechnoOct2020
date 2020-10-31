package anjaliP;

public class Temprature {
	float celcius;
	void temprature(float fahrenheit) {
		float celcius=(fahrenheit-32)*5/9;
		System.out.println("Temparature in Fahrenheit is : "+fahrenheit);
		System.out.println("Temprature converted from Fahrenheit to celcius will be :"+celcius);
	}
	public static void main(String[]a) {
		Temprature temp = new Temprature();
		temp.temprature(99.9f);
	}

}

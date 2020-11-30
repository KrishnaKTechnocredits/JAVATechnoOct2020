package surbhi;
class TempretureConversion{
	
	void convertTemp(float tempInFahr){
		float celcius=(tempInFahr-32)*5/9;
		System.out.println(tempInFahr);
		System.out.println(celcius);
	}
	public static void main(String[] args){
		TempretureConversion tempretureConversion = new TempretureConversion();
		tempretureConversion.convertTemp(75);
		
	}
 
}
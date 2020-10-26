package prasad;

public class Carmodel {
	void manufacturer (String name) {
		if(name.equals("Hyundai")){
			System.out.println("Available " + name + " SUV's");
			System.out.println("Tuson");
			System.out.println("Creta");
			System.out.println("Venue");
		}else if(name.equals("Maruti Suzuki")){
			System.out.println("S-Cross");
			System.out.println("Breeza");
		}else if(name.equals("VW")){
			System.out.println("Tiguan");
			System.out.println("T-ROC");
		}else 
			System.out.println("Please enter valid manufacturer name");
	}
	
	public static void main(String[]arg) {
		Carmodel carmodel = new Carmodel();
		carmodel.manufacturer ("Tata");
	}
}


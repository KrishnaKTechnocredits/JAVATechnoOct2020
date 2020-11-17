package ruby;

class Car{
	   String nameOfCompany;  // Instance variable 
	   boolean automaticCar;   // Instance variable 
	   double speed;     // Instance variable 
	   
		void setCompanyName(String nameOfCompany){
			this.nameOfCompany = nameOfCompany;
			System.out.println("Car name is " + nameOfCompany);
		}
		void setIsCarAutomatic(boolean automaticCar){
			this.automaticCar = automaticCar;
			if(automaticCar){
			System.out.println(" "+nameOfCompany+ " Car is Automatic");
			}else
			System.out.println(nameOfCompany+ " Car is Manual");
		}
		void setCarSpeed(double speed){
			this.speed = speed;	 
			System.out.println(" Speed of the car is "+ speed);
		}
		
		
		public static void main(String[] arg){
			Car car = new Car();
			//car.displayInfo();
			car.setCarSpeed(120.5);
			car.setIsCarAutomatic(true);
			car.setCompanyName("Honda");
			//car.displayInfo();
		}
	 }
	 

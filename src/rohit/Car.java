package rohit;

class Car{
    String company;
    boolean automatic;
    double speed;

    void setCompanyName(String company){
      this.company=company;
    }

    void setIsCarAutomatic(boolean automatic){
      this.automatic=automatic;
    }

    void setCarSpeed(double speed){
      this.speed=speed;
    }

    void displaySpecification(){
      System.out.println("Car company name is: "+company);
      if(automatic==true)
         System.out.println("Car Is Automatic");
      else
         System.out.println("Car Is Manual");
      System.out.println("Speed of the car is "+speed);
    }

   public static void main(String[]agrs){
      Car car=new Car();
      car.setCompanyName("Mahindra");
      car.setIsCarAutomatic(true);
      car.setCarSpeed(80);
      car.displaySpecification();
    }
}



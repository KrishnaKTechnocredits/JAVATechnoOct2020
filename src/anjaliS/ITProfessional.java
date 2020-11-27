package anjaliS;

public class ITProfessional{
    String  empname = "Gulshan" ;
    boolean weekendparty;
    boolean teaaddicted;
    boolean coffeeaddicted;
    boolean alcoholaddicted;
    
 void empName(){
   System.out.println("Employee name is "  +empname);
}
 void doesPartyOnWeekend(){
   if(true)
     System.out.println("He does party on weekend");
}
 void isAddictedToTea() {
    if(true)
      System.out.println("He is addicted to tea");
}
 void isAddictedToCoffee() {
   if(true)
      System.out.println("He is addicted to coffee");
}
 void isAddictedToAlcohol(){
    if(true)
      System.out.println("He is addicted to alcohol");
}
 void displayInformation(){
     System.out.println("Habits of employee gulshan");
   
}
 public static void main(String[]args){
      ITProfessional itprofessional = new ITProfessional();  
      itprofessional.empName();      
      itprofessional.displayInformation();
      itprofessional.doesPartyOnWeekend();
      itprofessional.isAddictedToTea();
      itprofessional.isAddictedToCoffee();
      itprofessional.isAddictedToCoffee();
      
}

}
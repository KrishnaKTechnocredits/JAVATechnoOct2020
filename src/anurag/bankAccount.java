package anurag;

class bankAccount{
	
	   String username;
	   String password; 
	   int bankAccountNumber;
			
	    void setDetails(String uname,String pwd,int bankAcno){
			
			username = uname;
			password = pwd;
		    bankAccountNumber = bankAcno;
		    }
			
		void updatePassword(String pass){
			
		  password=pass;
		  System.out.println("My Updated Password is " + password);
		  }
			
		void displayInfo(){
			
		  System.out.println("My username is " +username);
		  System.out.println("My password is " +password);
		  System.out.println("My bank account number is " +bankAccountNumber);
		  }
		  
		  public static void main(String[] agrs){
			  
		  bankAccount bankAccount1=new bankAccount();
		  bankAccount1.setDetails("komal","abc",123); 
		  bankAccount1.displayInfo();
		  bankAccount1.updatePassword("def");
		  bankAccount1.displayInfo();        //checking if the "Updated password" has reflected in displayInfo() or not.
		  }
		  
	}
		  
			
			
			
			
			

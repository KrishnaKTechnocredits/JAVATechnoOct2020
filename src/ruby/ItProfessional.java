package ruby;
class ItProfessional{
	  String name;
	  boolean partyOnWeekend;
	  boolean addictedToTea;
	  boolean addictedToCofee;
	  boolean addictedToAlchohal;

	    void empName(String name){
		  this.name=name;  
		}
	    void doesPartyOnWeekend(boolean partyOnWeekend){
		   this.partyOnWeekend = partyOnWeekend; 	   
		}
	    void isAdditicatedToTea(boolean addictedToTea){
		   this.addictedToTea = addictedToTea;   
		}
	    void isAdditicatedToCofee(boolean addictedToCofee){
		   this.addictedToCofee=addictedToCofee;	   
		}
	    void isAddictedToAlcohal(boolean addictedToAlchohal){
		   this.addictedToAlchohal = addictedToAlchohal;
		}  
	    void displayInformation(){
		   System.out.println("Employee name is" + name);
		   if(partyOnWeekend==true)
			   System.out.println(name+ " is available for party");
			else
			   System.out.println("Party  is not on weekend");
			
	       if(addictedToTea==true)
			   System.out.println(name+ " is addicated to Tea");
			else
			   System.out.println(name + " does not interetsed to Tea");
			
			if(addictedToCofee==true)
			   System.out.println(name+ " is addicated to Cofee");
			else
		       System.out.println(name+ " is not interetsed to Cofee");
			
			if(addictedToAlchohal==true)
		      System.out.println(name+ " is interetsed to Alchohol");
			else
				System.out.println(name+ " is not interetsed to Alchohol");  
			
		}
	        public static void main(String[] arg){
		    	ItProfessional proferssional = new ItProfessional();
				proferssional.empName("Ram");
				proferssional.doesPartyOnWeekend(true);
				proferssional.isAdditicatedToTea(true);
				proferssional.isAdditicatedToCofee(true);
				proferssional.isAdditicatedToCofee(true);
				proferssional.displayInformation();
		}   
	}
	  
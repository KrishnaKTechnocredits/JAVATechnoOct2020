package monika;
class SimpleInterest{

       void simpleInterest(int principleamount, float time , float rate){
	        float interest = (principleamount * time * rate)/100;
			System.out.println("Simple Interest is : " +interest);
			
		}

       public static void main(String[] args){
            SimpleInterest simpleInterest = new SimpleInterest();
			simpleInterest.simpleInterest(2000, 2.3f , 5);
			
		}
}		
            			
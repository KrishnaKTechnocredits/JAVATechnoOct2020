package darshana;

public class Bank {
    public int debitamtusr1;
    public int debitamtusr2;
    public int creditamtusr1;
    public int creditamtusr2;
    public int balanceusr1;
    public int balanceusr2;
    public int cntblncusr1,cntblncusr2;
   public static long cntcrduser1,cntcrdtuser2,cntdebitusr1,cntdebitusr2,cntprintbalance1 = 0;
    void creditamount(int x, int y){
        if(x>0){
         creditamtusr1+=x;
          
    cntcrduser1++;
    

        }
         if(y>0){
         creditamtusr2+=y;
             cntcrdtuser2++;
         }
        
         
    
    }
    void debitamount(int a, int b){
        if(a<creditamtusr1) {
            if(a!=0){
         debitamtusr1+=a;
         cntdebitusr1++;
            }
        }
        else{
            System.out.println("Insuffcient funds");
            
        }
        if(b<creditamtusr2){
            if(b!=0){
         debitamtusr2+=b;
            cntdebitusr2++;
        }
        }
         else{
             System.out.println("Insuffcient funds");
         }
        
    
    }
    
    void balance(){
       if(balanceusr1==0){
        balanceusr1=creditamtusr1-debitamtusr1;
        System.out.println("User1 has "+balanceusr1+" rupees balance");
       balanceusr1=creditamtusr1-debitamtusr1;
           cntblncusr1++;
           
       }
      
        if(balanceusr2!=0){
       
       
           cntblncusr2++;
           
       }
      
    }
    void transsmry(){
        System.out.println("User 1 transaction Summary Credit- "+cntcrduser1+" times,Debit- "+cntdebitusr1+" times, Print Balance- "+cntblncusr1+" times");
         System.out.println("User 2 transaction Summary Credit- "+cntcrdtuser2+" times,Debit- "+cntdebitusr2+" times, Print Balance- "+cntblncusr2+" times");
    }
    void alltrans(){
        long ttlcredit=cntcrduser1+cntcrdtuser2;
        long ttldebit=cntdebitusr1+cntdebitusr2;
        long ttlprintbalance=cntblncusr1+cntblncusr2;
     
         System.out.println("All User transaction Summary Credit- "+ttlcredit+" times,Debit- "+ttldebit+" times, Print Balance- "+ttlprintbalance+" time");
    }
    
    public static void main(String args[]) {
      Bank b=new Bank();
      b.creditamount(100,200);
      b.creditamount(100,200);
      b.creditamount(0,200);
      b.creditamount(0,200);
      b.creditamount(0,200);
    b.debitamount(50,60);
    b.debitamount(0,60);
    b.balance();
b.transsmry();
   b.alltrans();

      
    } 
}
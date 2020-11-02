package darshana;

import java.util.Scanner;

public class MyClass {
    public void evennos(int x,int y){
        
        while(x>=10 && y<=15){
            for(int i=x;i<15;i++){
                if(i%2==0){
                    System.out.println("Even numbers are: "+i);
                }
            }
            x++;
            y++;
        }
        
       
        
    }
    
     public void divby5(int aa1,int bb1){
        
        while(aa1>=10 && bb1<=30){
            for(int i=aa1;i<=30;i++){
                if(i%5==0){
                    System.out.println("Numbers divisible by 5 are: "+i);
                }
            }
            aa1++;
            bb1++;
        }
        
       
        
    }
    
    public void divby5and3(int xx1,int yy1){
        while(xx1>=5 && yy1<=18){
            for(int i=xx1;i<=18;i++){
                if(i%5==0 && i%3==0){
                    System.out.println("Numbers divisible by 5 and 3 are: "+i);
                }
            }
            xx1++;
            yy1++;
        }
    }
    
     public void divby7and13(int pp,int qq){
        while(pp>=5 && qq<=40){
            for(int i=pp;i<=40;i++){
                if(i%7==0){
                    System.out.println(i+" is divisible by 7");
                }
                else if (i%13==0){
                    System.out.println(i+" is divisible by 13");
                }
            }
            pp++;
            qq++;
        }
    }
    public static void main(String args[]) {
        MyClass m=new MyClass();
      Scanner sc= new Scanner(System.in);     
      System.out.println("Enter numbers between 10 to 15");
    System.out.print("Enter first number- ");  
    int a= sc.nextInt();  
    System.out.print("Enter second number- ");  
    int b= sc.nextInt();  
    m.evennos(a,b);
     System.out.println("Enter numbers between 10 to 30");
       System.out.print("Enter first number- ");  
    int aa= sc.nextInt();  
    System.out.print("Enter second number- ");  
    int bb= sc.nextInt(); 
    m.divby5(aa,bb);
    System.out.println("Enter numbers between 5 to 18");
       System.out.print("Enter first number- ");  
    int xx= sc.nextInt();  
    System.out.print("Enter second number- ");  
    int yy= sc.nextInt(); 
    m.divby5and3(xx,yy);
      
       System.out.println("Enter numbers between 5 to 40");
       System.out.print("Enter first number- ");  
    int p= sc.nextInt();  
    System.out.print("Enter second number- ");  
    int q= sc.nextInt(); 
    m.divby7and13(p,q);
      
    }
}
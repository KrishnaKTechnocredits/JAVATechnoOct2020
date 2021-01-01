package darshana;

import java. util. Scanner;
public class Assignment17{
public static void main(String args[]){
//variable declaration 
    String str=" ";
int count=0,length=0,num=0;
//vriable declaration and initialization
 Scanner scan=new Scanner(System.in); 
    //create a scanner object for input
    
System.out.println("Enter the String  ");
str=scan.nextLine();
length=str.length();
for(int i=0; i<length; i++){
count=0;
   for(int j=0; j<length; j++){
       if(str.charAt(j)==str.charAt(i))
       count++;
   }
   for(int k=0; k<i; k++){
       if(str.charAt(k)==str.charAt(i))
       num=1;
   }
       if(num!=1)
         System.out.print(str.charAt(i)+" is occured: "+count+"times"+"\n");
     num=0;
   }
}
}
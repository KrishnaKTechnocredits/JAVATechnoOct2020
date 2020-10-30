package anjaliS;

public class Divisible{
    
 void even(int start,int end)
 {
  System.out.println("Even numbers are ");
  for(int i=start; i<=end; i++) 
  {
   if(i%2==0)
    System.out.println(i);
  } 
 }
  void divisibleBy5(int start,int end){
   System.out.println("Divisible by 5, numbers are:");
   for(int i=start; i<=end; i++) 
  {
   if(i%5==0)
    System.out.println(i);
  } 
 }
  void divisibleBy3and5(int start,int end){
   System.out.println("Divisible by 5 & 3, numbers are:");
   for(int i=start; i<=end; i++)
 {
  if(i%5==0 && i%3==0)
   System.out.println(i);
 }
}
 void divisibleBy13or7(int start,int end){
  System.out.println("Divisible by 7 or 13, numbers are");
  for(int i=start; i<=end; i++)
 {
  if(i%7==0 )
   System.out.println(i +" is divisible by 7");
  if(i%13==0)
   System.out.println(i +" is divisible by 13");
 }
} 
 public static void main(String[] args){
    Divisible divisible = new Divisible();
    divisible.even(10,15);
    divisible.divisibleBy5(10,30);
    divisible.divisibleBy3and5(5,18);
    divisible.divisibleBy13or7(5,40);
         
 }
 
}

}

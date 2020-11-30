package rohit;
//find duplicate from given array.
public class Exam3intdupliate {

void findduplicatenumber(int[] number){
for (int i = 0; i < number.length; i++)
        {
            for (int j = i+1; j < number.length; j++)
            {
                if( (number[i]==(number[j])))
                {
                    System.out.println("Duplicate numbers are : "+number[i]);
                }
            }
        }
}
public static void main(String[] args) 
    {
        Exam3intdupliate exam3intdupliate=new Exam3intdupliate();
        int[] number = {10,12,55,32,17,12,32};
        exam3intdupliate.findduplicatenumber(number);     
    }    
}
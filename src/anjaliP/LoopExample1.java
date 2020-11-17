package anjaliP;

public class LoopExample1 {
	
		void display1(int start, int end) {
			System.out.println("--------------Display1------------------");
			for (int index = start; index <= end; index++)
			{
				if(index%2==0)
					System.out.println(index);
			}
			
		}
		void display2(int start, int end) {
			System.out.println("-------------Display2-------------------");
			for (int index = start; index <= end; index++) 
			{
				if(index%5==0)
					System.out.println(index);
			}
		}

		void display3(int start, int end) {
			System.out.println("-------------Display3-------------------");
			for (int index = start; index <= end; index++)
			{
				if(index%5==0 && index%3==0)
					System.out.println(index);
			}
		}

		void display4(int start, int end) {
			System.out.println("-------------Display4-------------------"+"\n");
			for (int index = start; index <= end; index++)
			{
				if(index%7==0)
					System.out.println(index +" is divisible by 7");
				else if(index%13==0)
					System.out.println(index +" is divisible by 13");
			}
		}

		public static void main(String[] a) {
			LoopExample1 loopExample=new LoopExample1();
			loopExample.display1(10, 15);
			loopExample.display2(10, 30);
			loopExample.display3(5, 18);
			loopExample.display4(5, 40);

		}

	}

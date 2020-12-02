package rohan;

public class NumberPrinting {

		void evenNumbers(int startIndex, int endIndex) {
			System.out.println("Even numbers are:");
			for(int i=startIndex;i<=endIndex;i++)
			{
				if(i%2 == 0)
					System.out.println(i);
			}
		}
		
		void divisibleByFive(int startIndex, int endIndex) {
			System.out.println("Numbers divisible by 5 are:");
			for(int i=startIndex;i<=endIndex;i++)
			{
				if(i%5 == 0)
					System.out.println(i);
			}
		}
		
		void divisibleByFiveAndThree(int startIndex, int endIndex) {
			System.out.println("Numbers divisible by 5 and 3 are:");
			for(int i=startIndex;i<=endIndex;i++)
			{
				if(i%5 == 0 && i%3==0)
					System.out.println(i);
			}
		}
		
		void divisibleBySevenOrThirteen(int startIndex, int endIndex) {
			System.out.println("Numbers divisible by 7 or 13 are:");
			for(int i=startIndex;i<=endIndex;i++)
			{
				if(i%7 == 0)
					System.out.println(i+" is divisible by 7");
				if(i%13 == 0)
					System.out.println(i+" is divisible by 13");
			}
		}
		
		public static void main(String[] a) {
			NumberPrinting numberPrinting = new NumberPrinting();
			numberPrinting.evenNumbers(10,20);
			numberPrinting.divisibleByFive(10, 20);
			numberPrinting.divisibleByFiveAndThree(10, 20);
			numberPrinting.divisibleBySevenOrThirteen(5, 40);
		}
}

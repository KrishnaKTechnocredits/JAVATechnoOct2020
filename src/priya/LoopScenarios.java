package priya;

public class LoopScenarios {

	void evenNumbers(int startIndex,int endIndex) {
		System.out.println("Even numbers are : ");
		for(int Index=startIndex;Index<=endIndex;Index++) {
			if (Index % 2 == 0) {
			System.out.println(Index);
			}
		}
	}
	
	void divisibleBy5(int startIndex, int endIndex) {
		System.out.println("Divisible by 5, numbers are: ");
		for (int Index=startIndex;Index<=endIndex;Index++){
			if (Index % 5 == 0) {	
			System.out.println(Index);
			}
		}
	}
	
	void divisibleBy5And3(int startIndex, int endIndex){
		System.out.println("Divisible by 5 & 3, are: ");
		for (int Index=startIndex;Index<=endIndex;Index++) {
			if (Index % 3 ==0 && Index % 5==0) {
			System.out.println(Index);
			}
		}
	}
	void divisibleBy7Or13(int startIndex, int endIndex){
		System.out.println("Numbers divisible by 7 & 13 are :");
		for (int Index=startIndex;Index<=endIndex;Index++) {
			if (Index%7==0) {
			System.out.println(Index+ " is divisible by 7");
			}else if(Index%13==0) {
			System.out.println(Index+ " is divisible by 13");
			}
		}	
	}
	public static void main(String[] args){
		LoopScenarios loopscenarios = new LoopScenarios();
		loopscenarios.evenNumbers(10,15);
		loopscenarios.divisibleBy5(10,30);
		loopscenarios.divisibleBy5And3(5,18);
		loopscenarios.divisibleBy7Or13(5,40);
		}
}
	


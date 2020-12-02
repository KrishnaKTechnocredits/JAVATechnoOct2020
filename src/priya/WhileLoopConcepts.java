package priya;

public class WhileLoopConcepts {

	void evenNumbers(int startIndex, int endIndex) {
		System.out.println("Even numbers are : ");
		int Index = startIndex;
		while (Index <= endIndex) {
			if (Index % 2 == 0) {
				System.out.println(Index);
			}
			Index++;
		}
	}

	void divisibleBy5(int startIndex, int endIndex) {
		System.out.println("Divisible by 5, numbers are: ");
		int Index = startIndex;
		while (Index <= endIndex) {
			if (Index % 5 == 0) {
				System.out.println(Index);
			}
			Index++;
		}
	}

	void divisibleBy5And3(int startIndex, int endIndex) {
		System.out.println("Divisible by 5 & 3, are: ");
		int Index = startIndex;
		while (Index <= endIndex) {
			if (Index % 3 == 0 && Index % 5 == 0) {
				System.out.println(Index);
			}
			Index++;
		}
	}

	void divisibleBy7Or13(int startIndex, int endIndex) {
		System.out.println("Numbers divisible by 7 & 13 are :");
		int Index = startIndex;
		while (Index <= endIndex) {
			if (Index % 7 == 0) {
				System.out.println(Index + " is divisible by 7");
			} else if (Index % 13 == 0) {
				System.out.println(Index + " is divisible by 13");
			}
			Index++;
		}
	}

	public static void main(String[] args) {
		WhileLoopConcepts whileloopconcepts = new WhileLoopConcepts();
		whileloopconcepts.evenNumbers(10, 15);
		whileloopconcepts.divisibleBy5(10, 30);
		whileloopconcepts.divisibleBy5And3(5, 18);
		whileloopconcepts.divisibleBy7Or13(5, 40);
	}
}

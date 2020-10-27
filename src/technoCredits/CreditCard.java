package technoCredits;

public class CreditCard {

	void verifyCreditCardInformation(int ccNumber, int cvv, String expDate) {
		///// Logic
	}

	void findAllInvalidccCard() {

	}

	public static void main(String[] args) {
		CreditCard creditCard_1 = new CreditCard();
		creditCard_1.verifyCreditCardInformation(1232131, 123, "10/22");
		creditCard_1.verifyCreditCardInformation(9475, 423, "20/23");
	}
}

package rohit;

public class Shop {
	int maggie = 50;
	int dosa = 43;
	int pouches = 39;
	int panipuri = 43;
	int masalas = 73;
	int remainingmaggie;
	int remainingdosa;
	int remainingpouches;
	int remainingpanipuri;
	int remainingmasalas;

	void displayavailableitemsd(int gotmaggie, int gotdosa, int gotpouches, int gotpanipuri, int gotmasalas) {
		remainingmaggie = maggie - gotmaggie;
		remainingdosa = dosa - gotdosa;
		remainingpouches = pouches - gotpouches;
		remainingpanipuri = panipuri - gotpanipuri;
		remainingmasalas = masalas - gotmasalas;
		System.out.println("List Of Remaining Items Are:: " + "Available maggie packets= " + remainingmaggie
				+ " Available dosa= " + remainingdosa + " Available pouches= " + remainingpouches
				+ " Available panipuri= " + remainingpanipuri + " Available masalas= " + remainingmasalas);
	}

	void outofstock() {
		if (remainingmaggie == 0) {
			System.out.println("Maggie is out of stock now");
		}
		if (remainingdosa == 0) {
			System.out.println("Dosa is out of stock now");
		}
		if (remainingpouches == 0) {
			System.out.println("Pouches is out of stock now");
		}
		if (remainingpanipuri == 0) {
			System.out.println("Panipuri is out of stock now");
		}
		if (remainingmasalas == 0) {
			System.out.println("Masalas is out of stock now");
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Shop shop = new Shop();
		shop.displayavailableitemsd(45, 21, 38, 43, 7);
		shop.outofstock();
	}

}

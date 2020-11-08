package apurva;

class Shop {
	int maggie;
	int dosa;
	int oil;
	int panipuri;
	int masala;
	int packets;

	void runningOutStock(int packets) {

		if (maggie == 0) {
			System.out.println("Running out stock");
		} else {
			System.out.println("maggie packets = ");
		}
	}

	void availableStock(int maggie, int dosa) {
		this.maggie = maggie;
		this.dosa = dosa;
		if (maggie < 50 && dosa < 43) {
			System.out.println("Available in stock");
		} else {
			System.out.println("Out of stock");
		}
	}

	void outOfStock(int maggie, int masala, int oil) {
		this.maggie = maggie;
		this.masala = masala;
		this.oil = oil;
		if (maggie > 50 && masala > 73 && oil > 39) {
			System.out.println("Out of stock");
		} else {
			System.out.println("Available in stock");
		}
	}

	public static void main(String[] args) {
		Shop shop = new Shop();
		shop.runningOutStock(0);
		shop.availableStock(28, 14);
		shop.outOfStock(59, 76, 92);
	}
}
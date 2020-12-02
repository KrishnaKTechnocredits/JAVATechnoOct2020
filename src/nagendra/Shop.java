package nagendra;

class Shop {

	static int maggiePackets = 50;
	static int dosaPackets = 43;
	static int oilPackets = 39;
	static int panipuriPackets = 43;
	static int masalaPackets = 73;

	void CustomerShoping(int maggie, int dosa, int oil, int panipuri, int masala) {

		maggiePackets = maggiePackets - maggie;
		dosaPackets = dosaPackets - dosa;
		oilPackets = oilPackets - oil;
		panipuriPackets = panipuriPackets - panipuri;
		masalaPackets = masalaPackets - masala;
	}

	void OutOfStock() {
		System.out.println("<--------- Out of stock Items  --->");
		if (maggiePackets == 0) {
			System.out.println("Maggie");
		}
		if (dosaPackets == 0) {
			System.out.println("Dosa Packet");
		}
		if (oilPackets == 0) {
			System.out.println("Oil Packet");
		}
		if (panipuriPackets == 0) {
			System.out.println("Pani Puri Packets");
		}
		if (masalaPackets == 0) {
			System.out.println(" Masala Packet");

		}
	}

	void AvailableInStock() {
		System.out.println("<--------- Available  In Stock  --->");

		if (maggiePackets > 0) {
			System.out.println("Available Maggie stocks are : " + maggiePackets);
		}
		if (dosaPackets > 0) {
			System.out.println("Available Dosa  stocks are : " + dosaPackets);
		}
		if (oilPackets > 0) {
			System.out.println("Available Oil stocks are : " + oilPackets);
		}
		if (panipuriPackets > 0) {
			System.out.println("Available Panipuri stocks are : " + panipuriPackets);
		}
		if (masalaPackets > 0) {
			System.out.println("Available Masala stocks are : " + masalaPackets);

		}
	}

	public static void main(String[] args) {
		Shop shop = new Shop();
		shop.CustomerShoping(50, 25, 12, 43, 73);
		shop.OutOfStock();
		shop.AvailableInStock();

	}
}

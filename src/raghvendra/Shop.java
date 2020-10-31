package raghvendra;

public class Shop {
	static int maggieStock=50;
	static int dosaStock=43;
	static int oilPacket=39;
	static int paniPuriPacket=43;
	static int masalaPacket=73;
	
	void currentShoping(int needMaggiePkt,int needDosaPkt,int needOilPkt,int needPanipuripkt,int needMaslaPkt) {
		maggieStock-=needMaggiePkt;
		dosaStock-=needDosaPkt;
		oilPacket-=needOilPkt;
		paniPuriPacket-=needPanipuripkt;
		masalaPacket-=needMaslaPkt;
	}
	
	void outOfStock() {
		if (maggieStock==0)
			System.out.println("Maggie packets are out of stock");
		else if (dosaStock==0)
			System.out.println("Dosa packets are out of stock");
		else if (oilPacket==0)
			System.out.println("Oil packets are out of stock");
		else if (paniPuriPacket==0)
			System.out.println("Pani Puri packets are out of stock");
		else if (masalaPacket==0)
			System.out.println("Masala packets are out of stock");
	}
	
	void stockAvailablity() {
		if (maggieStock>0)
			System.out.println("Available stock of Maggie packets: "+maggieStock);
		if (dosaStock>0)
			System.out.println("Available stock of Dosa packets: "+dosaStock);
		if (oilPacket>0)
			System.out.println("Available stock of Oil packets: "+oilPacket);
		if (paniPuriPacket>0)
			System.out.println("Available stock of Pani Puri packets: "+paniPuriPacket);
		if (masalaPacket>0)
			System.out.println("Available stock of Masal packets: "+masalaPacket);
	}
	
	public static void main(String[] args) {
		Shop shop=new Shop();
		shop.currentShoping(50, 10, 23, 14, 50);
		shop.outOfStock();
		shop.stockAvailablity();
	}

}

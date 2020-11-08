package mrunal;

public class Shop {
	
	int maggiPackets=50;
	int dosaPackets=43;
	int oilPouches=39;
	int panipuriPackets=43;
	int masalaPackets=73;
	
	void SetmaggiPackets(int maggiPackets)
	{
		this.maggiPackets=maggiPackets;
	}
	void SetdosaPackets(int dosaPackets)
	{
		this.dosaPackets=dosaPackets;
	}
	void SetoilPouches(int oilPouches)
	{
		this.oilPouches=oilPouches;
	}
	void SetpanipuriPackets(int panipuriPackets)
	{
		this.panipuriPackets=panipuriPackets;
	}
	void SetmasalaPackets(int masalaPackets)
	{
		this.masalaPackets=masalaPackets;
	}
	
	void displayCustomerInformation()
	{
		if (maggiPackets>60 && dosaPackets>45 && oilPouches>40 
			&& panipuriPackets>45 && masalaPackets>75)
			{
				System.out.println("Dear Customer products you have entered are "
						+ "available in stock ");
			}
		else
			{
				System.out.println("Dear Customer products you have entered are "
						+ "out of stock ");
			}
	}
	
	void OutOfStock()
	{
		System.out.println("\n" + "***products which are out of stock** ");
		if (maggiPackets>60)
		{
			System.out.println("Maggipackets");
		}
		else
		{
			System.out.println("Maggipackets");
			}
		
		if (oilPouches>60)
		{
			System.out.println("Oilpouche");
		}
		else
		{
			System.out.println("Oilpouche");
			}
	}
	void AvailableStock()
	{
			System.out.println("\n" + "***products which are avalable in stock** ");
		if (dosaPackets>20)
		{
			System.out.println("Dosa Packets ");
		}
		else
		{
			System.out.println("Dosa Packets");
			}
		
		if (masalaPackets>30)
		{
			System.out.println("Masala Packets");
		}
		else
		{
			System.out.println("Masala Packets");
			}
	}
	public static void main(String[] args) {
		Shop  a = new Shop ();
		a.displayCustomerInformation();
        a.OutOfStock();
        a.AvailableStock();
	}

}

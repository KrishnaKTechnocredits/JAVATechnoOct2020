package suvela;

public class Assignment13 {
	static int ibalance;
	static int hbalance;
	static int bbalance;
	static int sbalance;
	static int icreditcounter=0;
	static int idebitcounter=0;
	static int hdebitcounter=0;
	static int bdebitcounter=0;
	static int sdebitcounter=0;
	static int hcreditcounter=0;
	static int screditcounter=0;
	static int bcreditcounter=0;
	
	int geticicibalance(int ibalance) {
		return ibalance;
	}
	int gethdfcbalance(int hbalance) {
		return hbalance;
	}
	int getbobbalance(int bbalance) {
		return bbalance;
	}
	int getsbibalance(int sbalance) {
		return sbalance;
	}
	static void credit(String bankname, int amount) {
		switch (bankname) {
			case "icici":
				ibalance = ibalance +amount;
				
				icreditcounter++;
				
				break;
			case "bob":
				bbalance = bbalance+amount;
				;
				bcreditcounter++;
				
				break;
			case "sbi":
				sbalance = sbalance+amount;
				
				screditcounter++;
				
				break;
			case "hdfc":
				hbalance= hbalance +amount;
				
				hcreditcounter++;
				
				break;
		}
	}
		static void debit(String bankname, int amount) {
			switch (bankname) {
				case "icici":
					if(ibalance <amount)
						System.out.println("Insufficient balance");
					ibalance = ibalance - amount;
					
					idebitcounter++;
					
					break;
				case "bob":
					if(bbalance <amount)
						System.out.println("Insufficient balance");
					bbalance = bbalance- amount;
					
					bdebitcounter++;
					
					break;
					
				case "sbi":
					if(sbalance <amount)
						System.out.println("Insufficient balance");
					sbalance = sbalance- amount;
					
					sdebitcounter++;
					
					break;
					
				case "hdfc":
					if(hbalance <amount)
						System.out.println("Insufficient balance");
					hbalance= hbalance - amount;
					
					hdebitcounter++;
					
					break;
			}
	
				
	}
		int totalcreditcounter() {
			int totalcreditcounter = icreditcounter + bcreditcounter + hcreditcounter + screditcounter;
			return totalcreditcounter;
		}
		int totaldebitcounter() {
			int totaldebitcounter = idebitcounter + bdebitcounter+ hdebitcounter+ sdebitcounter;
			return totaldebitcounter;
		}
		
		static int totalbalance(int ibalance,int bbalance,int hbalance,int sbalance) {
			int totalbalance = ibalance+bbalance+hbalance+sbalance;
			return totalbalance;
		}
		static void transaction(String bankname, int amount, String op) {
			if(bankname.equals("icici") && op.equals("credit"))
				credit(bankname,amount);
			if(bankname.equals("bob") && op.equals("credit"))
				credit(bankname,amount);
			if(bankname.equals("sbi") && op.equals("credit"))
				credit(bankname,amount);
			if(bankname.equals("hdfc") && op.equals("credit"))
				credit(bankname,amount);
			 if(bankname.equals("icici") && op.equals("debit"))
				debit(bankname,amount);
			 if(bankname.equals("bob") && op.equals("debit"))
					debit(bankname,amount);
			 if(bankname.equals("sbi") && op.equals("debit"))
					debit(bankname,amount);
			 if(bankname.equals("hdfc") && op.equals("debit"))
					debit(bankname,amount);
		}
	public static void main(String[] args) {
		Assignment13 assign = new Assignment13();
		int bobbalance =assign.getbobbalance(20000);
		int icicibalance = assign.geticicibalance(500);
		int hdfcbalance = assign.gethdfcbalance(10000);
		int sbibalance = assign.getsbibalance(5000);
		ibalance=icicibalance;
		bbalance=bobbalance;
		hbalance=hdfcbalance;
		sbalance=sbibalance;
		int total=totalbalance(icicibalance, bobbalance, hdfcbalance, sbibalance);
		System.out.println("Total balance is : "+total);
		transaction("icici",500,"credit");
		transaction("icici",500,"credit");
		transaction("sbi",500,"credit");
		transaction("hdfc",100,"debit");
		System.out.println("ICICI credit operations :" +icreditcounter);
		System.out.println("BOB credit operations :" +bcreditcounter);
		System.out.println("SBI credit operations :" +screditcounter);
		System.out.println("HDFC credit operations :" +hcreditcounter);
		System.out.println("ICICI debit operations:" +idebitcounter);
		System.out.println("BOB debit operations:" +bdebitcounter);
		System.out.println("SBI debit operations:" +sdebitcounter);
		System.out.println("HDFC debit operations:" +hdebitcounter);
		int totalcredit=assign.totalcreditcounter();
		System.out.println("Total credit opertions : "+totalcredit);
		int totaldebit = assign.totaldebitcounter();
		System.out.println("Total debit opertions : "+totaldebit);
		
	}

}

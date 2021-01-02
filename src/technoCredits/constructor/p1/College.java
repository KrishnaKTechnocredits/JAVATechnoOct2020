package technoCredits.constructor.p1;

public class College {
	String colName;
	int pincode;
	int colId;
	
	private College(){
		colName = "MIT";
		pincode = 411014;
		colId = 10101;
	}
	
	College(int colId){
		colName = "MIT";
		pincode = 411014;
		this.colId = colId; 
	}
	
	public College(String colName, int pincode, int colId){
		this.colName = colName;
		this.pincode = pincode;
		this.colId = colId;
	}
	
	void College() {
		
	}
	
	public static void main(String[] args) {
		College c1 = new College();
		
	}

}

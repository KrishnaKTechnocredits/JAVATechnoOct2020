package designpattern;

// Lazy Loading 
public class Connection {
	
	private  static Connection con;
	
	private Connection(){
		//// DB Connection code
	}
	
	static Connection getConnection(){
		if(con == null)
			con = new Connection();	
		return con;
	}
	
	void selectData(String query) {
		//// 
	}
}

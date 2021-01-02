package designpattern;

// Egar Loading 
public class Connection2 {
	
	private final static Connection2 con;
	
	static{
		con = new Connection2();
	}
	
	private Connection2(){
		//// DB Connection code
	}
	
	static Connection2 getObject(){
		return con;
	}
	
	void selectData(String query) {
		//// 
	}
}

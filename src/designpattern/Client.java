package designpattern;

public class Client {
	public static void main(String[] args) {
		Connection con1 = Connection.getConnection();
		System.out.println(con1);
		//con1.selectData("Select * from Table1");
		
		Connection con2 = Connection.getConnection();
		System.out.println(con2);
		
		Connection con3 = con2;
		
		System.out.println(con3);
	}
}

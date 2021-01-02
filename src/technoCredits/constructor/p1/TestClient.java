package technoCredits.constructor.p1;

class TestClient {
	
	{
		System.out.println("Milind");
	}
	
	
	TestClient(){
		super();
		System.out.println(1);
	}
	
	TestClient(int x){
		System.out.println(2);
	}
	
	public static void main(String[] args) {
		TestClient testClient = new TestClient();
		
	}
}

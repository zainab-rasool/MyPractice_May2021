package pkg2;
//Example Hierarchical inheritance

public class API_Testing extends Automation_testing{
	
	int x=200;
	public void ap() {
		System.out.println("API testing class");
	
	}
	
	public static void main(String[] args) {
		API_Testing at=new API_Testing();
		
		System.out.println(at.z);;
		at.a();
		System.out.println(at.x);
		at.ap();
		
	}

}

package pkg2;
//Example Hierarchical inheritance

public class Selenium_testing extends Automation_testing {

	int y=100;
	public void s() {
		System.out.println("Selenium testing class");
	}
	
	public static void main(String[] args) {
		Selenium_testing st=new Selenium_testing();
		
		System.out.println(st.z);;
		st.a();
		System.out.println(st.y);
		st.s();
		
	}
}

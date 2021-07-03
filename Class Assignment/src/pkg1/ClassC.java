package pkg1;

public class ClassC {
	
	public void p_method() {
		System.out.println("parent default method");
	}
	
	public void p_method1(int a) {
		System.out.println("parent 1 parameterized method");
	}
	
	public void p_method2(int a, int b) {
		System.out.println("parent 2 parameterized method");
	}
	
	public void p_method3(int a, int b, int c) {
		System.out.println("parent 3 parameterized method");
	}
	
	public void p_method4(int a, int b, int c,int d) {
		this.p_method();
		this.p_method1(4);
		this.p_method3(3, 7, 9);
		this.p_method2(5, 8);
		System.out.println("parent 4 parameterized method");
	}

}

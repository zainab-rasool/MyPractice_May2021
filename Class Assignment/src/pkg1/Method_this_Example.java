package pkg1;

public class Method_this_Example {
	public void mehod() {
		System.out.println("default method");
	}
	
	public void method1(int a) {

		System.out.println("1 parameterized method");
	}
	
	public void method2(int a, int b) {
		System.out.println("2 parameterized method");
	}
	
	public void method3(int a, int b, int c) {
		this.mehod();
		this.method4(2, 4, 5, 7);
		this.method1(3);
		System.out.println("3 parameterized method");
		this.method2(3, 4);
	}
	
	public void method4(int a, int b, int c, int d) {
		System.out.println("4 parameterized method");
	}
	
  public static void main(String args[]) {
	Method_this_Example ob=new Method_this_Example();
	ob.method3(2, 4, 6);
  }
}

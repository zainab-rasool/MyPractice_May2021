package pkg2;

import pkg1.ClassC;

public class ClassD extends ClassC {
	public void c_method() {
		super.p_method4(7, 9, 5, 1);
		this.c_method3(6, 8, 9);
		System.out.println("child default method");
	}
	
	public void c_method1(int a) {
		this.c_method();
		this.c_method2(2, 3);
		System.out.println("child 1 parameterized method");
		this.c_method4(2, 5, 7, 9);
	}
	
	public void c_method2(int a, int b) {
		System.out.println("child 2 parameterized method");
	}
	
	public void c_method3(int a, int b, int c) {
		System.out.println("child 3 parameterized method");
	}
	
	public void c_method4(int a, int b, int c, int d) {
		System.out.println("child 4 parameterized method");
	}
	
	public static void main(String[] args) {
		ClassD ob=new ClassD();
		ob.c_method1(2);
	}

}

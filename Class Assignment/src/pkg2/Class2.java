package pkg2;

import pkg1.Class1;

public class Class2 {
	
	public void method2() {
		System.out.println("Class 2 method");
	}
	
	public static void main(String[] args) {
		Class1 ob11=new Class1();
		ob11.method1();
		System.out.println(ob11.a11);
	}

}
  
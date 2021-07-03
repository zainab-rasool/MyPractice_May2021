package pkg1;

public class ClassA {
	
	public ClassA() {
	this(7,6,9);
	System.out.println("parent default constructor");
	}
	
	public ClassA(int a) {
	this();
	System.out.println("parent 1 paramerterized constructor");
	}
	
	public ClassA(int a, int b) {
    this(7,9,3,8);
	System.out.println("parent 2 paramerterized constructor");
	}
	
	public ClassA(int a, int b, int c) {
	System.out.println("parent 3 paramerterized constructor");
	}

	public ClassA(int a, int b, int c, int d) {
	this(8);
	System.out.println("parent 4 paramerterized constructor");
	}

}

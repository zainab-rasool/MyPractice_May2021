package pkg1;

public class Constructor_this {
	
	public Constructor_this() {
		this(4,7,8);
		System.out.println("default constructor");
	}
	
	public Constructor_this(int a) {
		this();
		System.out.println("1 parameterized constructor");
	}
	
	public Constructor_this(int a, int b) {
		this(2,3,4,5);
		System.out.println("2 parameterized constructor");
	}
	
	public Constructor_this(int a, int b, int c) {
		System.out.println("3 parameterized constructor");
	}
	
	public Constructor_this(int a, int b, int c, int d) {
		this(8);
		System.out.println("4 parmeterized constructor");
	}
	
	public static void main(String[] args) {
		Constructor_this ob1=new Constructor_this(2,7);
	}

}

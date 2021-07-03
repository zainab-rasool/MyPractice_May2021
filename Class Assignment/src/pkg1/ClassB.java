package pkg1;

public class ClassB extends ClassA{
	
 public ClassB() {
	super(3,4);
	System.out.println("child default constructor");
}
 
 public ClassB(int a) {
	    this(6,9,8);
		System.out.println("child 1 parmerterized constructor");
	}
 
 public ClassB(int a, int b) {
        this(2,5,8,9);
		System.out.println("child 2 parmerterized constructor");
	}
 
 public ClassB(int a, int b, int c) {
	    this();
		System.out.println("child 3 parmerterized constructor");
	}
 
 public ClassB(int a, int b, int c, int d) {
	    this(4);
		System.out.println("child 4 parmerterized constructor");
	}
 
 public static void main(String[] args) {
	ClassB ob=new ClassB(2,5);
}
}

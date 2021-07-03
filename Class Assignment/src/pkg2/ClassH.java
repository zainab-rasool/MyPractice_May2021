package pkg2;

public class ClassH extends ClassF{
	
	 public void abc() {
		  System.out.println("Child");
	  }
//	 public final void xyz() {
//		  System.out.println("final method");
//	  }

	public static void main(String[] args) {
		ClassH ob3=new ClassH();
		System.out.println(ob3.a);
		ob3.a=44;
		System.out.println(ob3.a);
		ob3.abc();
		ob3.xyz();
	}
}

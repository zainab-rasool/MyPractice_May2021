package pkg2;

//Example Multi level inheritance

public class Child extends Father{
	
	int c=50;
	
	public void c_method() {
		System.out.println("Class child");
	}
	
	public static void main(String[] args) {
		Child ob=new Child();
		ob.g_method();
		ob.f_method();
		ob.c_method();
		System.out.println(ob.g);
		System.out.println(ob.f);
		System.out.println(ob.c);
	}

}

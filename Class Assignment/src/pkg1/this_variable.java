package pkg1;

public class this_variable {
	
	int x;
	public void method(int x) {
		this.x=x;
	}
	public static void main(String[] args) {
		this_variable ob=new this_variable();
		ob.method(123);
		System.out.println(ob.x);
	}

}

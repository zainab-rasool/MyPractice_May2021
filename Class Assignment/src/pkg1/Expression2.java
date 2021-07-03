package pkg1;

public class Expression2 {

	public int sum(int a, int b) {
		int c=a+b;
		return c;
	}
	
	public int sub(int a, int b) {
		int c=a-b;
		return c;
	}
	
	public void multiply(int a, int b) {
		int c=a*b;
		System.out.println("Expreeion 2:- ((((10/2)-2)-2)+2)*2) :-" +c);
	}
	public int divide(int a, int b) {
		int c=a/b;
		return c;
	}
	
	public static void main(String[] args) {
		Expression2 ob1=new Expression2();
		int divide=ob1.divide(10,2);
		int sub1=ob1.sub(divide, 2);
		int sub2=ob1.sub(sub1, 2);
		int sum=ob1.sum(sub2, 2);
		ob1.multiply(sum, 2);
	}
}

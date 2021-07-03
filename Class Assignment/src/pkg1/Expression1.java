package pkg1;

public class Expression1 {
	
	public int sum(int a, int b) {
		int c=a+b;
		return c;
	}

	public int sub(int a, int b) {
		int c=a-b;
		return c;
	}
	
	public int multiply(int a, int b) {
		int c=a*b;
		return c;
	}
	
	public void divide(int a, int b) {
		int c=a/b;
		System.out.println("Expression 1:- ((((10+2)+2)-2)*2)/2) =" +c);
	}
	
  public static void main(String[] args) {
	  Expression1 ob1=new Expression1();
	  int sum1=ob1.sum(10, 2);
	  int sum2=ob1.sum(sum1, 2);
	  int sub=ob1.sub(sum2, 2);
	  int mul=ob1.multiply(sub, 2);
	  ob1.divide(mul, 2);	
}
}

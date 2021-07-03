package pkg2;

import java.util.Scanner;

public class Swap_Number {
	int a, b,c;
	public void swap_with_variable(int a, int b) {
		c=a;
		a=b;
		b=c;
		System.out.println("Swap with third variable");
		System.out.println("Updated value of a: " +a);
		System.out.println("Updated value of b: " +b);
	}
	
    public void swap_without_third_variable(int a, int b) {
    	a=a+b;
    	b=a-b;
    	a=a-b;
    	System.out.println("Swap without third variable");
		System.out.println("Updated value of a: " +a);
		System.out.println("Updated value of b: " +b);
}

	
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.println("Enter value of a =");
		int a=s.nextInt();
		System.out.println("Enter value of b =");
		int b=s.nextInt();
		Swap_Number obj=new Swap_Number();
	    obj.swap_with_variable(a,b);
	    obj.swap_without_third_variable(a, b);  
	    
	}

}

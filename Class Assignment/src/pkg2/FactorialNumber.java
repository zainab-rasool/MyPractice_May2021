package pkg2;

import java.util.Scanner;

public class FactorialNumber {
	
	public void factorial(int n) {
		
		int s=1;
		for(int i=1; i<=5; i++) {
		s=s*i;
		}
		System.out.println("factorial of number : " +s);
}
	
	
	public static void main(String[] args) {
	Scanner s=new Scanner(System.in);
	System.out.println("Enter the number : ");
	int n=s.nextInt();
	FactorialNumber obj=new FactorialNumber();
	obj.factorial(n);
	
}

}

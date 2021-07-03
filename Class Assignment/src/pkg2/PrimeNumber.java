package pkg2;

import java.util.Scanner;

public class PrimeNumber {
	
	public void prime(int n) {
	   int half=n/2;
	   int c=0;
	   for(int i=2; i<=half; i++) {
		   
		   if(n%i==0) {
			   System.out.println("Not a prime number");
			   c=1;
			   break;
		   }   
	   }
	   if(c==0) {
		   System.out.println("Prime Number");
	   } 
		
	}
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.println("Enter the number : ");
		int n=s.nextInt();
		PrimeNumber obj=new PrimeNumber();
		obj.prime(n);
		
	}

}

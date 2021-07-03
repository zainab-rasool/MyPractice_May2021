package pkg2;

import java.util.Scanner;

public class PalindromeNumber {
	
	public void palindrome(int n) {
		int r,temp=n;
		int s=0;
		while(n>0) {
		r=n%10;
		s=s*10+r;
		n=n/10;
		}
		if(s==temp) {
			System.out.println("Palindrome Number");
		}
		
		else {
			System.out.println("Not Palindrome Number");
		}
		
		
		
	}
	
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.println("Enter the number : ");
		int n=s.nextInt();
		PalindromeNumber obj=new PalindromeNumber();
		obj.palindrome(n);
		
	}

}

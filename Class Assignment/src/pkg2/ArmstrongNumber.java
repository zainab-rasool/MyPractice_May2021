package pkg2;

import java.util.Scanner;

public class ArmstrongNumber {
	public void armstrong(int n) {
		int r, temp=n;
		int s=0;
		while(n>0) {
		r=n%10;   
		s=s+r*r*r;
		n=n/10;
		}
		
		if(s==temp) {
			System.out.println("Armstrong Number");
		}
		
		else {
			System.out.println("Not Armstrong Number");
		}
		
		
	}
	
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.println("Enter the number : ");
		int n=s.nextInt();
		ArmstrongNumber obj=new ArmstrongNumber();
		obj.armstrong(n);
		
	}
	}

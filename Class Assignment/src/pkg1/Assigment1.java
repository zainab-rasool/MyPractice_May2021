package pkg1;

import java.util.Scanner;

public class Assigment1 extends  Arithmetic_Operation{
	
	public static void main(String[] args) {
		
		Scanner s=new Scanner(System.in);
		System.out.println("Enter the value of x1:-");
		int x1=s.nextInt();
		System.out.println("Enter the value of x2:-");
		int x2=s.nextInt();
		System.out.println("Enter the value of x3:-");
		int x3=s.nextInt();
		System.out.println("Enter the value of x4:-");
		int x4=s.nextInt();
		System.out.println("Enter the value of x5:-");
		int x5=s.nextInt();
		System.out.println("Enter the value of x6:-");
		int x6=s.nextInt();
		
		Assigment1 ob1=new Assigment1();
		int x12=ob1.multiply(x1, x2);
		int x13=ob1.add(x12, x3);
		int x14=ob1.add(x13, x4);
		int x15=ob1.sub(x14, x5);
		float x16=ob1.divide(x15, x6);
		System.out.println("Result in float :- ((((x1*x2)+x3)+x4)-x5)/x6):" +x16);
		int x17=(int)x16;                                 //Explicit conversion
		System.out.println("After conversion result in int :- ((((x1*x2)+x3)+x4)-x5)/x6):" +x17);
	}

}

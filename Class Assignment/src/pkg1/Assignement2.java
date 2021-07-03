package pkg1;

import java.util.Scanner;

public class Assignement2 extends Arithmetic_Operation{

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
		System.out.println("Enter the value of x6:-");
		int x6=s.nextInt();
		System.out.println("Enter the value of x7:-");
		int x7=s.nextInt();
		
		Assignement2 ob2=new Assignement2();
		int y12=ob2.multiply(x1, x2);
		int y13=ob2.sub(y12, x3);
		int y14=ob2.add(y13, x4);
		int y16=ob2.sub(y14, x6);
		float y17=ob2.divide(y16, x7);
		System.out.println("(((((x1*x2)-x3)+x4)-x6)/x7 :" +y17);
		
	}
}

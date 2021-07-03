package pkg2;

import java.util.Scanner;

public class PrintTable {
	
	public void table(int n) {
		for(int i=1; i<=10; i++) {
			int t=n*i;
			//System.out.println(+t);
			System.out.println(n + "*" +i +"=" +t );
		}
		
	}
	
	public static void main(String[] args) {
		PrintTable obj=new PrintTable();
		Scanner s=new Scanner(System.in);
		System.out.println("Enter the number :-");
		int n=s.nextInt();
		System.out.println("Print table =");
		obj.table(n);
	}

}

package pkg3;

public class E {
	public static void main(String[] args) {
		int n=4;
		for(int i=1;i<=5;i++) {
			for(int k=1; k<=n; k++) {
				System.out.print(" ");
			}
		    for(int j=1;j<=i;j++) {
		    	System.out.print("*");
		    }
			System.out.println();
			n--;
		}
	}

}

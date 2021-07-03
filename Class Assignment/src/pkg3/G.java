package pkg3;

public class G {
	public void first() {
		int n=4;
		for(int i=1; i<=5; i++) {
			for(int k=1; k<=n; k++) {
				System.out.print(" ");
			}
			for(int j=1;j<=2*i-1;j++) {
				System.out.print("*");
			}
			System.out.println();
			n--;
	}
	}
	
	public void second() {
		int n=1;
		for(int i=1; i<=4; i++) {
			for(int k=1; k<=n; k++) {
				System.out.print(" ");
			}
			for(int j=8-2*i+1;j>=1;j--) {
				System.out.print("*");
			}
			System.out.println();
			n++;
		}		
	}
	
 public static void main(String[] args) {
	G obj=new G();
	obj.first();
	obj.second();
}
}

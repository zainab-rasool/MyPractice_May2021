package pkg6;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class Write1 {
	public void WriteData(int row) throws IOException {
		File f=new File("../Class Assignment/Ouput.txt");
		FileWriter fw=new FileWriter(f);
		BufferedWriter bw=new BufferedWriter(fw);
	    for(int i=1; i<=row;i++) {
	    	Scanner s=new Scanner(System.in);
	    	System.out.println("Enter data");
	    	String data=s.next();
	    	bw.write(data);
	    	bw.newLine();
	    }
	    bw.close();
		
	}
  public static void main(String[] args) throws IOException {
	Write1 obj=new Write1();
	Scanner s=new Scanner(System.in);
	System.out.println("Enter row number");
	int r=s.nextInt();
	obj.WriteData(r);
}

}

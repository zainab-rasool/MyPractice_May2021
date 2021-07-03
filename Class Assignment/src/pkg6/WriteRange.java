package pkg6;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;
///wrongggggggggggggggggggg

public class WriteRange {
	public void write_range(int intial, int end ) throws IOException {
		File f=new File("../Class Assignment/Ouput.txt");
		FileWriter fw=new FileWriter(f);
		BufferedWriter bw=new BufferedWriter(fw);
		int i=0;
		if((i>=intial) && (i<=end))  {
	    	Scanner s=new Scanner(System.in);
	    	System.out.println("Enter data");
	    	String data=s.next();
	    	bw.write(data);
	    	bw.newLine();
	    }
	    bw.close();
		
	}
  public static void main(String[] args) throws IOException {
	  WriteRange obj=new WriteRange();
	Scanner s=new Scanner(System.in);
	System.out.println("Enter row number");
	int r=s.nextInt();
	System.out.println("Enter row number");
	int c=s.nextInt();
	obj.write_range(r,c);
}

}

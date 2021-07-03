package pkg6;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class WriteMultiple {
	public static void main(String[] args) throws IOException {
		File f=new File("../Class Assignment/Ouput.txt");
		FileWriter fw=new FileWriter(f,true);
		BufferedWriter bw=new BufferedWriter(fw);
		bw.newLine();
		bw.write("My sister name is Honey");
		bw.newLine();
		bw.write("intelligent");
	    bw.close();	
	}
}

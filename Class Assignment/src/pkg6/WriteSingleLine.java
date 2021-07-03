package pkg6;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class WriteSingleLine {
	public static void main(String[] args) throws IOException {
		File f=new File("../Class Assignment/Ouput.txt");
		FileWriter fw=new FileWriter(f);
		fw.write("Mini is good girl");
		fw.write("cute");
		fw.close();		
	}

}

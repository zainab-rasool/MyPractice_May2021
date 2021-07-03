package pkg6;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class ReadCharacter {
	public static void main(String[] args) throws IOException {
		//System.out.println("zainab");
		File f=new File("../Class Assignment/Input.txt");
		FileReader fr=new FileReader(f);
		int a;
		while((a=fr.read())!=-1) {
			System.out.println((char)a);
		}
		
		
	}

}

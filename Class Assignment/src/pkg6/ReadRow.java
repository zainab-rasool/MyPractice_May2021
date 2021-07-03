package pkg6;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

public class ReadRow {
	public void read_row(int r) throws IOException {
		File f=new File("../Class Assignment/Input.txt");
		FileReader fr=new FileReader(f);
		BufferedReader br=new BufferedReader(fr);
		String s;
		int i=0;
		while((s=br.readLine())!=null) {
			i++;
			if(i==r)
			System.out.println(s);
		}
	}
	public static void main(String[] args) throws IOException {
		
		ReadRow obj=new ReadRow();
		Scanner s=new Scanner(System.in);
		System.out.println("Enter row nuber");
		int r=s.nextInt();
		obj.read_row(r);
	}
}

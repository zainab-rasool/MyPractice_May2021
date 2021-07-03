package pkg6;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

public class Read_data_range {
	
	

		public void read_range_row(int intial, int End) throws IOException {
			File f=new File("../Class Assignment/Input.txt");
			FileReader fr=new FileReader(f);
			BufferedReader br=new BufferedReader(fr);
			String s;
			int i=0;
			while((s=br.readLine())!=null) {
				i++;
				if((i>=intial) && (i<=End)) {
				System.out.println(s);
				}
			}
		}
		public static void main(String[] args) throws IOException {
			
			Read_data_range obj1=new Read_data_range();
			Scanner s=new Scanner(System.in);
			System.out.println("Enter Intial row number");
			int r=s.nextInt();
			System.out.println("Enter End row number");
			int c=s.nextInt();
			obj1.read_range_row(r,c);
		}

}

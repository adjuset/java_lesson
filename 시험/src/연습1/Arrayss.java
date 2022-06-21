package 연습1;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Scanner;

public class Arrayss {

	public static void main(String[] args) {

		String filename = "C:\\a.GookBe\\java.txt";
		File file = new File(filename);
		
		try(PrintWriter pw = new PrintWriter(file); Scanner sc = new Scanner(file) ){
			
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	
		
	}

}

package koreait.day15;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class C67_Resouce {

	public static void main(String[] args) {
		
		String filename = "C:\\a.GookBe\\자바테스트.txt";
	
		File file3 = new File(filename);
		
		Scanner sc = null ;
		
		try {
			sc = new Scanner(file3);
			while(sc.hasNext()) {
				System.out.println(sc.nextLine());
			}
			System.out.println("불러옴");
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} finally {
			if(sc != null) sc.close();
		}
		
	}

}

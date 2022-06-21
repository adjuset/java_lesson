package 연습1;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Scanner;

public class Array {
	public static void main(String[] args)  {

		//PrintWriter : 파일 없어도 됨 입력받기
		//Scanner : 출력하기 : 파일 있어야 됨
		Scanner sc = new Scanner(System.in);
		
		String filename = "C:\\a.GookBe\\java.txt";
		File file = new File(filename);
		PrintWriter pw= null ;
		
		try {
			pw = new PrintWriter(file);
			pw.println("모모 모모 모모왔져");
			pw.println("미나 미나 미나왔엉");
			pw.println("신비 신비 신비");
			System.out.println("출력완료");
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}finally {
			pw.close();
		}
	
	
	
	
	
	}

}

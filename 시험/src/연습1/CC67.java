package 연습1;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Scanner;

public class CC67 {

	public static void main(String[] args) {

		String filename = "C:\\a.GookBe\\자바.txt";

			try {
				fileWriter2(filename);
				fileRean(filename);
			} catch (FileNotFoundException e) {
				System.out.println("사용자 실행 오류 : "+e.getMessage());
				System.out.println("파일 ㅣ이 존재하는지 확인");
			}
			

		
		
		
	}
	
	
	public static void fileWriter2(String filename) throws FileNotFoundException{
		File file = new File(filename);
		PrintWriter pw = new PrintWriter(file);
		pw.println("모모 나이는 1살이에요");
		pw.println("나이 나이는 2살이에요");
		pw.println("이힝 나이는 3살이에요");
		System.out.println("완료됨");
		pw.close();

	}
	
	public static void fileRean(String filename) throws FileNotFoundException {
		File file = new File(filename);
		Scanner sc = new Scanner(file);
		while(sc.hasNext()) {
			System.out.println(sc.nextLine());
		}
		sc.close();
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

	//try catchans
	public static void fileWriter(String filename) {
		File file = new File(filename);
		PrintWriter pw = null;
		try {
			pw =new PrintWriter(file);
			pw.println("모모 나이는 1살이에요");
			pw.println("나이 나이는 2살이에요");
			pw.println("이힝 나이는 3살이에요");
			System.out.println("완료됨");
		} catch (FileNotFoundException e) {
			System.out.println("사용자오류발생 : "+e.getMessage());
			e.printStackTrace();
		}finally {
			pw.close();
		}
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}



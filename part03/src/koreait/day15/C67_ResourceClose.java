package koreait.day15;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;

public class C67_ResourceClose {

	public static void main(String[] args) {
		String filename = "C:\\a.GookBe\\자바.txt";
		
		File file = new File(filename);
		
		try (PrintWriter pw = new PrintWriter(file)){
			pw.println("안녕하세요");
			pw.println("반갑습니다");
			pw.println("또만나요");
			System.out.println("출력 완료");
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
		
		//finally를 써서 sc.close나 pw.close 써주지 않아도 됨
		
	}

}

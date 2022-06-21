package koreait.day15;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;

public class C65_FileWriterTest {		///io : input, output 입출력 관련된 기능들의 클래스

	public static void main(String[] args) {

		String filename ="C:\\a.GookBe\\자바테스트.txt";
		
		File file = new File(filename);
		
		//PrintWriter : 출력 기능을 갖는 클래스
		//Unhandled exception type FileNotFoundException : 오류의 가능성이 있으므로 try~catch 필요
		PrintWriter pw = null;
		try {
			pw= new PrintWriter(file);		//file로 지정된 위치에 출력을 위한 객체
//			System.out.println(); 에서 system.out대신에 파일출력 객체  pw
			pw.println("모모 90 89 82");
			System.out.println();
			pw.println("다현 89 90 82");
			System.out.println();
			pw.println("나연 82 89 90");
			System.out.println("파일 출력이 완료되었습니다.");	//System.out : 표준 출력 (콘솔 출력)

		} catch (FileNotFoundException e) {
			//출력 기능에는 파일이 없으면 자동으로 파일이 만들어집니다
			System.out.println("사용자 오류 발생 : "+e.getMessage());
			e.printStackTrace();
			
		}finally {
			pw.close();
		}
		
	
		
	}

}

package koreait.day16;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Scanner;

//Exception 처리 명령이 별도 메소드에서 정의될 때. 다른 방법 : 
public class C68_FileReadWriterTest {
	//main 메소드가 throws Exception 한다면 jvm 에게 넘긴다. 처리내용은  printStackTrace 결과과 동일
	
	public static void main(String[] args) {
		String filename = "C:\\a.GookBe\\자바테스트11.txt";
		
		try {
			fileWriter2(filename);
//			filename = "C:\\a.GookBe\\자바테스트11.txt";		//없는 파일 테스트용
			fileRead(filename);

		} catch (FileNotFoundException e) {
			System.out.println("사용자 실행 요류 : "+e.getMessage());
			System.out.println("파일이 존재하는지 확인하세요");
		}
		
	}
	

	//방법 1 : Exception을 try ~ catch로 직접처리 합니다
	public static void fileWriter(String filename) {
		File file = new File(filename);

		PrintWriter pw = null;
		//java.io.PrintWriter.PrintWriter(File file) thorws FileNotFoundException
		
		try {
			pw = new PrintWriter(file); 
			pw.println("모모 90 89 82");
			System.out.println();
			pw.println("다현 89 90 82");
			System.out.println();
			pw.println("나연 82 89 90");
			System.out.println("파일 출력이 완료되었습니다."); // System.out : 표준 출력 (콘솔 출력)

		} catch (FileNotFoundException e) {
			//출력 기능에는 파일이 없으면 자동으로 파일이 만들어짐
			System.out.println("사용자 오류 발생 : " + e.getMessage());
			e.printStackTrace();

		} finally {
			pw.close();
		}
	}

	
	//방법 2 : throws 키워드로 해당 Exception 처리를 호출한 곳으로 넘긴다. (여기서는  main메소드로 떠넘긴다)
	//		 throws 뒤에, 로 구분해서 여러개를 지정할 수 있다.
	//		 Exception 처리해야 할 메소드가 많이 정의되고 사용될 때, 한곳에서 모두 처리할 수 있다.
	public static void fileWriter2(String filename) throws FileNotFoundException {
	
			File file = new File(filename);

			PrintWriter pw = null;
			pw = new PrintWriter(file); 
			pw.println("모모 90 89 82");
			System.out.println();
			pw.println("다현 89 90 82");
			System.out.println();
			pw.println("나연 82 89 90");
			System.out.println("파일 출력이 완료되었습니다."); // System.out : 표준 출력 (콘솔 출력)
			
			pw.close();
	}
	
	
	public static void fileRead(String filename) throws FileNotFoundException{
		
		File file = new File(filename);
		Scanner sc = new Scanner(file);
		while(sc.hasNext()) {
			System.out.println(sc.nextLine());
		}
		sc.close();
	}

}






package koreait.day15;

import java.util.InputMismatchException;
import java.util.Scanner;

class C63_TryCatchTest {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		//try 형식
		try {
			//Exception 가능성이 있는 명령을 작성한다. -> 오류가 생기면 catch로 감
			//이 위치에서 변수 선언하면 try{ }의 지역변수
			
			
		} catch (NullPointerException e) {		//오류 원인에 따른 Exception 종류를 검사한다
			//NullPointerException  일때만 아래 명령을 처리합니다.
			e.printStackTrace();  //오류를 추척하기 위해 원인을 출력함 (기존 Exception 출력 내용)
			
			
		} catch(InputMismatchException e) {
			// catch는 여러번 작성 가능
			
			
		}finally {		//마지막으로, 최종적으로 : 오류 발생과 상관없이 실행되는 부분
			//주로 자원을 해제하는 코드 작성함
			sc.close();
			
		}
		
		
		//try 블럭의 명령 또는 catch 블럭의 명령이 끝나면 실행이 계속됨
		
		
	}

}

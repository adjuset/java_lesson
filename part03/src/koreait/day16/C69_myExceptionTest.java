package koreait.day16;

import java.util.Scanner;

public class C69_myExceptionTest {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.print("나이를 입력 > ");
		
		try {
			int age = Integer.parseInt(sc.nextLine());
			if(age < 0 || age >100) 
				throw new AgeException("나이의 범위는 0~100입니다 "); //클래스에서 추가적인 동작이 있을때
			//throw new Exception("나이의 범위는 0~100입니다 ");  메시지만 바꿀때
			//throw 는 지정된 Exception을 발생시킨다  
			System.out.println("당신의 나이는 "+age+"살이 맞습니까?");
			
			if(age == 0) throw new NullPointerException();
			
		} catch(NumberFormatException e) {
			System.out.println("나이 입력은 숫자로만 하세요!");
			
		} catch(Exception e) {
			System.out.println("사용자 실행 오류 : "+e.getMessage());
		}
		
	}
}

// 사용자 Exception을 만듬 : Exception 상속
class AgeException extends Exception{

	//Serializable 인터페이스와 관련된 값
	private static final long serialVersionUID = 1L;
	
	
	//사용자가 임의로 메시지를 지정할 수 있음
	public AgeException(String message) {
		super(message);			//Exception의  message 필드를 설정
	}
	
}

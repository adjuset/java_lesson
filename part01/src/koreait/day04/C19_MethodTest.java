package koreait.day04;

public class C19_MethodTest {
	
	//main 메소드 : 실행의 사작점, 프로그램 실행을 위해서는 꼭 있어야 할 메소드.  static
	public static void main(String[] args) {
		
		System.out.println("메소드를 직접 정의해서 사용해봅니다");
		System.out.println("프로그램은 main 메소드의 명령문을 순서대로 실행하고 중간에 메소드 호출을 만나면 메소드가 정의된 실행을 위해");
		System.out.println("제어(실행)를 이동합니다. 메소드 실행이 종료되면 다시 main 메소드로 제어가 돌아옵니다");
		System.out.println("1.");
		methodA();			//메소드 호출(실행)  : 필요할 떄 호출함
		
		System.out.println("2. ");
		methodB(11,33);		// ★★ 11, 33은 메소드 실행에 필요한 인자★★
		methodB(929,12);	// 오류 : 매개변수 형식변형
		
		System.out.println("3.");
		methodC(929,12.1);
		methodC(929,121);	
		//오류 아님  : 자동캐스팅(자동형변환)  : double -> int O,  int -> double X
		
		System.out.println("4.");
		methodD();						//반환값이 있는 메소드에서 반환값 저장을 안함 : 리턴값은 sys.out로 출력해야 나옴
		System.out.println("return ="+methodD());	//반환값을 받아서 출력하는 예시
		int temp = methodD();
		System.out.println("return = "+temp);    //반환값만 출력

		
		System.out.println("5.");
		methodE(11,11.55);
		System.out.println("return="+methodE(11,12.6));
		double result = methodE(314,3.14);
		System.out.println("return = "+result);
		
		
		System.out.println("6.");
		System.out.println(methodF('i',4));
		
		
		char ch = 'a';
		int val = 3;
		ch = methodF(ch,val);
		System.out.println("return = "+ch);
	}
	
	
	//static 안  main에서 실행할 메소드는 동일하게 static이여야 함
	//메소드 선언(정의)
	public static void methodA() {				
		System.out.println("##첫번쨰 메소드 정의 연습입니다.##");	
	}
	
	public static void methodB(int a, int b) {		//  ☆ int a, b는 인자값을 전달받는 매개변수(지역변수)
		System.out.println("##두번쨰 메소드 정의 연습입니다##");
		System.out.println("전달받은 값 a = "+a+", b = "+b);
	}
	
	public static void methodC(int a, double b) {		
		System.out.println("##두번쨰 메소드 정의 연습입니다##");
		System.out.println("전달받은 값 a = "+a+", b = "+b);
	}
	
	public static int methodD() {					//반환값이 있는 형식 : 반환값은 int 데이터, 반드시 return이 필효아다
		System.out.println("##4번째 메소드 정의 연습입니다.##");
		return 999;				//main에서 출력해야 나옴
	}
	
	public static double methodE(int a, double b) {
		System.out.println("##5번쨰 메소드 정의 연습입니다##");
		return a+b;									//인자로 전달받은 값으로 실행하고 처리결과 리턴
	}
	
	
	public static char methodF(char ch, int size) {
		System.out.println("##여섯번쨰 메소드 정의 연습#");
		return (char)(ch+size);
	}
	
	
	/* 	String 클래스의 메소드를 이해 하기 위해서, 먼저 (메소드의 구조 연습)
	 * 
	 * 
	 * 	메소드의 주요 요소 : 반환값(형식), 인자(argument)또는 매개변수(parameter), 메소드 이름, public 또는 static 등의 설정
	 * 		- 반환값 : 메소드 실행 완료되면 얻어지는 결과값
	 * 		-  인자  : 메소드 실행을 위해서 필요한 데이터 (형식과 변수명 선언 필요)	- 인자의 갯수와 형식은 다양함
	 * 		- 메소드 이름 : 식별자
	 * 		- public : 접근한정자 , static : 정적 요소
	 * 
	 */
}

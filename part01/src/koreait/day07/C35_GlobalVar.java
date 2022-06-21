package koreait.day07;

public class C35_GlobalVar {
	
	/*	[변수가 선언된 위치로 판단]
	 * 	지역변수(local variable) : 메소드, for, if, while 등  { } 에서 선언된 변수, 블록에서 벗어나면 변수 사용 못함
	 * 	전역변수(global variable) : 클래스{ }에서 선언된 변수 
	 * 	노란색 : 지역변수
	 * 	파란색 : 전역변수
	 * 
	 * [전역변수를 static 여부로 구분]
	 * 	클래스이름.변수명
	 * 	객체를 만들어서 사용하는 this.변수명 (이때 변수는 인스턴스 변수)
	 * 
	 * 
	 * 	전역변수는 클래스의 또는 객체의 특성을 나타낼때 필드(프로퍼티)라고 부름
	 */
	
	int count ;			//전역변수
	String message;
	static int num;	
	static double point;
	static final int TEST = 9999;	//static final이 상수
	
	public static void main(String[] args) { 	//static은 객체 생성하지 않고 작동할 수 있는 것 : static은 static만 접근함
		int num = 10;		//main 메소드에만 사용
		System.out.println("num = "+num);
//		System.out.println("message : "+message);	 오류 : static이 아닌 변수는 사용못함
		
		methodB();
//		methodA();		오류 : static이 아닌 메소드
	
	}
	

	public void methodA() {		//static메소드가 아니므로 객체를 만들어서 객체를 만들어서 사용하는 메소드
		int num =99;		//methodA 에서만 사용 
		System.out.println("num = "+num);
		System.out.println("message : "+message);			//전역변수로 선언된 message
	}
	
	// ***중요
	public void methodC(int count) {
		this.count = count;		//this는 new로 만들어진 객체. methodC 메소드를 실행시키는 객체
	}
	
	public static void methodB() {
		int num =99;		//methodA 에서만 사용 
		//지역변수와 전역변수와 이름이 같은 경우, 지역변수를 가져옴
		
		System.out.println("num = "+num);
		System.out.println("num : "+C35_GlobalVar.num);		//Integer.BYTES와 같은 형태
		//전역변수로 선언된 num,  static 일떄는 클래스이름.변수명  	/  static이 아닐떄는 this.변수명
	}

}

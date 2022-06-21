package koreait.day13a;

import koreait.day13.InterfaceA;
import koreait.day13.InterfaceB;

public class C56_Anonymous {
	
//인터페이스 구현체를 익명 내부 클래스로 생성하기  : 1회용 클래스
// 	ㄴ 익명 클래스는 현재 파일에서만 사용할 수 있음.
	
	public static void main(String[] args) {

		InterfaceA ia = new InterfaceA() {
			
			@Override
			public int methodB(int num) {
				System.out.println("i am anonymous. !!");
				return 1234;
			}
			
			@Override
			public void methodA() {
				System.out.println("InterfaceA methodA");
			}
		};
		
		InterfaceB ib = new InterfaceB() {
			
			@Override
			public String name(String name) {
				return "익명 내부 클래스: "+name;
			}
		};

		
		ia.methodA();					//추상메소드
		ia.methodD("hi interface ~"); 	//추상메소드
		InterfaceA.methodC();			//static 메소드
		System.out.println("상수 : "+InterfaceA.SIZE);	//인터페이스에서는 public static 생략 > 상수
		
		System.out.println(ib.name("테스트"));	
	}
}

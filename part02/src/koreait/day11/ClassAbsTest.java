package koreait.day11;

import koreait.day10.Person;

public class ClassAbsTest {

	public static void main(String[] args) {
		
		Person momo = new Person();			//일반클래스
//		ClassAbs abs = new ClassAbs();		    오류 : ClassAbs는 추상클래스  -> new 못함
		ClassAbs abs = new ClassX();		//부모 타입 참조
		ClassX cls = new ClassX();			//구현(자식) 클래스 타입
		
		System.out.println("테스트 1번째 : test 메소드");
		abs.test();
		cls.test();
		abs.name="손흥민";		//name은 부모클래스 필드
		cls.name="모모";
		abs.print();			//print() 부모 클래스 메소드
		
		System.out.println("태스트 2번째 : 자식 필드 num");
		cls.setNum(23);
		cls.test();
		
		ClassX x = (ClassX)abs;
		x.setNum(99);			//다운캐스팅 해줘야 됨
		x.test();
		
		
		
		
	}

}

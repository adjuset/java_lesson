package koreait.day09b;

import koreait.day09a.ClassA;

public class ClassAB extends ClassA{
	//과연 이 클래스가 필드, 메소드 상속받았나 확인.
	
	public void test() {
		//System.out.println("name = "+name);  
		//오류 : name필드 접근한정자는 디폴트 : 다른 패키지에서 사용 못함
		
		title = "momo";
		System.out.println("title = "+title);
		//상속받은 title필드 : 다른 패키지 이지만 protected 접근한정자로 자식클래스는 허용
		
		setName("신비");
		System.out.println("Name="+getName());
	
	
	
	
	}
	
}

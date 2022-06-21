package koreait.day08;

import java.util.Calendar;

public class MyClass3Test {
	public static void main(String[] args) {
		
//		MyClass3 my3 = new MyClass();			오류 : 생성자가 private 한정자
		MyClass3 my3 = MyClass3.getInstance();	//미리 만들어진 객체를 리턴
		my3.test();								//객체의 인스턴스 메소드	
		my3.staticTest();						//static 메소드 (객체 만들지 않음 )
	
		
		Calendar today = Calendar.getInstance();
		System.out.println(today);
	
		
	
	}
}

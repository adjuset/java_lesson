package koreait.day08;


public class MyClass1Test {

	public static void main(String[] args) {
		//MyClass1 객체 생성
		MyClass1 my = new MyClass1();	//public 클래스이지만 import 필요
		
		//패키지가 다른 MyClass1 클래스의 필드 중 사용할 수 있는 것은?
		my.name = "momo";
		my.point=1.234;
//		my.age = 23;						오류 : private 한정자
		my.setAge(24);						//priavate 필드값 (변경)대입하는 메소드  : setter
//		System.out.println("Age = "+age);	오류 : private 한정자 필드
		my.setAge(-100);
		System.out.println("age ="+my.getAge());     //private 필드값 읽어오는 메소드 : getter
		System.out.println("point = "+my.point);     //public 한정자 필드
	
	}

}
/*
 *  private int age;			//private  : 다른 클래스에서 사용 못합니다. 나(현재 클래스)만 사용한다.
	String name;				//default(package)  : 다른 패키지에서 사용 못합니다. 이웃이면 같이쓰자.
	public int score;			//public   : 어디서나 사용합니다.공공의,공용의... 다같이 쓰자.

 *  private , default, protected, public은 
 *  변수(필드),메소드,생성자, 클래스 등에 사용되는 접근한정자 입니다.(클래스는 접근한정자 default,public 만 사용합니다.)
 */

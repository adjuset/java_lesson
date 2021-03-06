package koreait.day04;

public class C17_StringTest {

	public static void main(String[] args) {
		
		String name ="kim";			//참조형 변수(클래스 타입)
		String name2 = "kim";
		String name3 = "lee";
		String name4 = new String("kim");			//새로운 String 객체 생성 (내용이 다른 변수와 같아도 새로운 객체 생성함)
		
		System.out.println("name == name2  참조위치 ? "+(name == name2));	//참
		System.out.println("name == name4  참조위치 ? "+(name == name4));	//거짓
		System.out.println("name2 == name4  참조위치 ? "+(name2 == name4));	//거짓
		
		name2 = "son";
		System.out.println("name == name2  참조위치 ? "+(name == name2));
		
		System.out.println("name = "+name);
		System.out.println("name2 = "+name2);
		System.out.printf("name3 = %s\n",name3);
		System.out.printf("name4 = %s\n",name4);
		
	}
	
/*		문자열 : 기호 ""를 사용하면 문자열임
 * 			     자바에서는 기본형 데이터 아니고 String 클래스 타입으로 사용 (필드, 메소드 이용하여 문자열 기능 사용)
 * 			  
 * 
 */
}
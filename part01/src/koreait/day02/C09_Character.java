package koreait.day02;

public class C09_Character {

	public static void main(String[] args) {

		char c1 = 'a';
		char c2 = 97;		//문자코드는 정수값
	
		//둘다 'a' 출력
		System.out.println("C1 = "+c1);
		System.out.println("C2 = "+c2);
		
		
		//문자코드 정수값 출력은 ?   -> int로 캐스팅 필요 : 둘 다 97 출력
//		System.out.printf("c1 = %d\n",c1);		오류 : char형은 %d가 아니다
		System.out.printf("c1 = %d\n",(int)c2);
		System.out.printf("c2 = %d\n",(int)c2);
		
		c1 = (char)(c1+1);				//덧셈 연산 가능. 연산결과 대입할 때는 casting 필요
		System.out.println("c1 = "+c1);
		
		
		c1++;	//++연산은 c1 = c1+1  ,  char형에서는 casting도 합니다
		System.out.println("c1 = "+c1);
	
		
		//한글 문자 테스트  :  한글문자코드는 10진수값을 44032 ~ 55203, 16진수(2진수) ac00 ~ d7a3
		char h1 = '가';
		char h2 = 44032;		//
		char h3 = '\uac00';		// \\u는 16진수유니코드, ac00은 16진수 값
		System.out.println("h1= "+h1);
		System.out.println("h2 = "+h2);
		System.out.println("h3 = "+h3);
		
		System.out.printf("h1 = %d\n",(int)h1);
		System.out.printf("h2 = %d\n",(int)h2);
		System.out.printf("h3 = %d\n",(int)h3);
		
		h1++;
		System.out.println("h1 = "+h1);
		
		h1++;
		System.out.println("h1 = "+h1);
		
		
		//한글의 마지막 문자
		char h4 = 55203;		//힣
		char h5 = '\ud7a3';		//힣
		System.out.println("h4 = "+h4);
		System.out.println("h5 = "+h5);
		
		h4++;
		System.out.println("h4 = "+h4);		//해당되는 모양의 문자가 없음 : ?표시
	
		h5--;		
		System.out.println("h5="+h5);		//힢
	}
	//char이 모여서 한 줄로 나란히 나열하면  -> 문자열이 됩니다.  "Hello"는 'H', 'e','e',..
}

/*	기본형식 데이터 : 문자형 char
 * 		문자데이터를 저장하는 2바이트 형식,  정수값 0 ~ 65535 범위 저장도 가능
 * 		컴퓨터에서 다루는 문자는 문자코드로 처리되는데 코드는 정수값이다.
 * 		문자데이터는 '' 기호를  사용한다.
 * 
 *		영문자, 숫자, 특수문자는  ASCII(아스키)코드로 표현됩니다 
 * 		영문자, 숫자, 특수문자 외의 다국어문자는 문자를 처리하는 인코딩방식에 따라
 *		문자코드값이 다르다.	국제화 인코딩으로  UTF-8방식을 많이 사용한다.
 */

package koreait.day14;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;
import java.util.Vector;

public class C60_CharSequence {

	//CharSequence 인터페이스 구현체 :  StringBuffer, String >  CharSequence의 구현체
	public static void main(String[] args) {
		
		String result = new String();				//result = "test" ,  result = new String("test")
		System.out.println("초기 result="+result);	//""
		System.out.println("1. String 타입 테스트");	//문자열 내용이 바뀌면 문자열 객체가 새로 생성되고 위치가 달라짐
		
		for(int i=2 ; i<6 ; i++) {
			//문자열 내용이 바뀌면 문자열 객체가 새로 생성되고 위치가 달라짐
			result+= i+ "/";						//result = result + (i + "/")
			System.out.println("result = "+result);
		}
		
			
		StringBuffer sb = new StringBuffer();			//StringBuilder와 함께 많이 사용되는 클래스
		System.out.println("2. StringBuffer 타입 클래스");	
	//StringBuffer객체의 문자열 내용이 바뀌어도 기존 객체에 추가되는 동작을 함
	//반복되는 연결 연산이 많은 경우  : String? X  StringBuffer? O
		for(int i=2 ; i<6 ;i++) {
				sb.append(i).append(":");				//문자열 연결 연산 + 와 같은 동작
				System.out.println("sb : "+sb);
		}
		
		//CharSequence 인터페이스 사용 : contain메소드의 매개변수 타입
		//			boolean java.lang.String.contains
		//CharSequence 인터페이스 확인
		String sample = "abc2/3/4/5/xyz";
		System.out.println("3. contain메소드 확인");
		System.out.println("contains(result) : "+sample.contains(result));	//true : sample의 데이터 타입이 result와 같나?
		System.out.println("contains(sb) : "+sample.contains(sb));	//false
		
		//메소드의 형식 또는 다른 여러 형식들을 확인할 때 : 1)클래스 or 인터페이스   2) 인터페이스일 떄 구현체는 무엇인가?
		
		//참고 : ArrayList 선언할 때 변수 선언 List 인터페이스 타입으로 함
		//		HashMap	   선언할 떄 변수 선언  Map  인터페이스 타입으로 함
		List<String> names = new ArrayList<>();
		names = new Vector<>();						//나중에 다른 데이터타입으로 바꿀 수 있음
		
		Map<String, Integer> map = new HashMap<>();
		map = new TreeMap<String, Integer>();		//나중에 다른 데이터타입으로 바꿀 수 있음
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}

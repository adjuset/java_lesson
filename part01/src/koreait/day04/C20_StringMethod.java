package koreait.day04;

public class C20_StringMethod {

	public static void main(String[] args) {	
		
		String message = "hello~";			//java.lang.String (기본패키지 클래스)
		
		//String 클래스의 메소드는 많음	 > 메소드의 이름, 인자, 리턴형식을 참조해서 사용
		
//		message.length();		//public int length()	: 길이
//		message.charAt(0);		//public char charAt(int index)	
//		
//		message.equals("hello~.");		//public boolean equals(Object anObject), Object는 모든타입
//										//message 가 String 타입이므로 Object 는 String으로 해석함	
		
		
		message.indexOf('e');			//public int indexOf(int ch) 
		message.indexOf("lo");			//public String indexOf(String str)
		message.substring(2);			//public String substring(int beginIndex)
		message.substring(2, 4);		//public String substring(int beginIndex, int endIndex)
		message.replace("ll", "*@");	//	  replace(CharSequence target, CharSequence replacement)
		
		//메소드 오버로딩(overloading) : 메소드 이름과 리턴형식은 같고 인자값의 갯수와 형식이 다르게 정의된 것. 
		
		
		int len = message.length();
		char temp = message.charAt(3);					//0부터 시작해서 3번 문자가 무엇인지 리턴
		boolean isState = message.equals("Hello~.");	//문자열이 같은지 비교
		
		System.out.println("length() = "+len);				//6
		System.out.println("charAt(3) = "+temp);			//l
		System.out.println("equels(\"Hello\")="+isState);	//false
		
		System.out.println("indexOf('e') = "+message.indexOf('e'));		//1
		System.out.println("indexOf('lo') = "+message.indexOf("lo"));	//3
		System.out.println("indexOf() = "+message.indexOf("ol"));		//-1 : 찾는 문자열이 없을 떄
		String test = "hello~ hello";
		System.out.println("test.indexOf(\"lo\") = "+test.indexOf("lo"));
		System.out.println("test.lastIndexOf(\"lo\") = "+test.lastIndexOf("lo"));
		
		System.out.println("substring(2) = "+message.substring(0));		//llo~
		System.out.println("substring(2,4) = "+message.substring(2, 4));		//ll
		System.out.println("replace(ll, *@) = "+message.replace("ll", "*@"));	//he*@o~
		System.out.println("startWith(\"H\") = "+message.startsWith("H"));		//false
		System.out.println("endsWith(\"~\") = "+message.endsWith("~"));			//true
	
	}

}

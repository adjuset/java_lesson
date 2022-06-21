package koreait.day06;

import java.util.Arrays;

public class C29_CharArray {
//	char 배열의 특징 및 문자열과 연관된 내용 파악하기
//		-char 형은 2바이트 정수를 저장하여 문자로 표현한다
	public static void main(String[] args) {

		//char배열의 선언
		char[] arr1 = {'i','a','m',' ','j','a','v','a'};
		char[] arr2 = new char[20];
		System.out.println("[[[char배열 테스트 - 1]]]");
		System.out.println("arr1 : "+Arrays.toString(arr1));
		System.out.println("arr2 : "+Arrays.toString(arr2));	//값 0 에 대한 문자는 빈칸
		System.out.println("arr1 배열 길이(크기) : "+arr1.length);
		System.out.println("arr2 배열 길이(크기) : "+arr2.length);
	
		System.out.println("arr1 배열 3번째 데이터 값(문자) : "+arr1[2]);	//값?
		System.out.println("arr1 배열 3번째 데이터 값(문자) : "+arr2[2]);	//값?
		
		System.out.println("arr1 배열 3번째 데이터 값(정수) : "+(int)arr1[2]);	//값? 109
		System.out.println("arr1 배열 3번째 데이터 값(정수) : "+(int)arr2[2]);	//값?   0
	
		
		System.out.printf("\n 2. for문으로 출력_");
		for(int i=0 ; i<arr1.length; i++) {
			System.out.print(arr1[i]+" ");
		}
		
		System.out.println("\n 3. 배열이름(참조형 변수)으로 출력");
		System.out.println(arr1);
		//위의 2번 for문과 동일한 결과 : 정수형배열과 다르게 문자열 참조변수처럼 동작함
		
		String mag = "iam java";
		System.out.println(mag);
		
		System.out.println("\n [[[char 배열 테스트 _ 3]]]");
		System.out.println("3. 문자열을 배열로 변경");
//		arr1 = "hello h1 goodbye";
		arr2 = "hello h1 goodbye".toCharArray();		//String 문자열 객체를 char배열로 변환
		System.out.println(arr2);
		System.out.println(arr2[2]);
		System.out.println("arr2.length : "+arr2.length);
		
		
		arr2 = "hello h1 goodbyehello h1 goodbye".toCharArray();	//문자열이 선언된 배열크기보다 크다
		System.out.println("arr2.length : "+arr2.length);			//배열 크기가 커짐
		
		
		String temp =String.valueOf(arr1);		//static 메소드 : char[]배열을 문자열로 변환
												//String 객체의  toCharArray() 메소드와 반대
		//참고 : String.valueOf 매소드는 여러가지 매개변수 형식을 다룹니다(overloading)
		
		System.out.println("String.valueOf(arr1) : "+arr2);
		System.out.println("String.valueOf(arr1) : "+String.valueOf(arr1));
		
		
		
	}

}

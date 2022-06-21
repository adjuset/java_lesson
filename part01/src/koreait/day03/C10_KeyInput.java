package koreait.day03;

import java.util.Scanner;		
// ctrl + shift + o

public class C10_KeyInput {

	public static void main(String[] args) {
		// sc는 변수명입니다. 기본 변수가 아닌 클래스 타입의 변수입니다.   ->  참조형 변수
		Scanner sc = new Scanner(System.in);	
		
		int data;
		double point;
		
		System.out.print("정수값 입력하세요 >  ");
		data = sc.nextInt();	
		
		//사용자가 숫자만 입력하지 않았을 때는 정수로 변환하지 못하고 오류 발생시킴
		System.out.println("입력된 값은 "+data+"입니다.");
		
		System.out.print("실수값 입력하세요 > ");
		point = sc.nextDouble();
		System.out.println("실수값 : "+point+"입니다.");
		
	}
}
/*
 * 	표준 출력 : System.out
 *  표준 입력 : System.in     -> Scanner 클래스를 이용해서 입력값을 특정 기본형식으로 변환시켜는 기능 사용.
 * 						   -> 기본 패키지의 클래스가  아니므로 import 가 필요합니다.	
 * 
 */


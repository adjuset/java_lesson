package koreait.day02;

import java.util.Scanner;

public class C08_Test {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		//사각형 넓이 구하기
		//가로 , 세로
		// 넓이를 구했습니다. -> 437 cm
		
		System.out.println("[[사각형 도형의 넓이 구하기]]");

		System.out.print("가로 길이를 입력하세요 : ");
		int width = sc.nextInt();
		System.out.print("세로 길이를 입력하세요 : ");
		int length = sc.nextInt();
		
		int box_area = width * length;
		
		System.out.println("가로  : "+width+"cm");
		System.out.println("세로  : "+length+"cm");
		System.out.println("넓이를 구했습니다. ->"+box_area+"㎠");
		
		
		//원 도형의 넓이와 둘레 구하기
		//반지름
		//둘레를 구했습니다 -> cm         둘레공식 = 2*3.14 * 반지름
		//넓이를 구했습니다 -> cm			넓이공식 = 3.14*3.14*반지름
		
		final double PI = 3.14; 
		
		System.out.println("[[원 도형의 넓이와 둘레 구하기]]");
		
		System.out.print("반지름을 입력하세요 : ");
		double radius = sc.nextDouble();
		
		double round = 2*3.14*radius;
		double area = 3.14*radius*radius;
		
		System.out.println("반지름 :"+radius+"㎠");
		System.out.printf("둘레를 구했습니다. ->%-10.3f㎠ \n",round);
		System.out.printf("넓이를 구했습니다. ->%-10.3f㎠ \n",area);
		
		sc.close();               //키보드(표준입력장치)를 더 이상 사용하지 않음
	

		//final 테스트
		//		변수선언 앞에 final 키워드를 붙이면 값을 변경하지 못합니다
		
		final int test = 123;				//값을 변경 못하는 상수
		System.out.println("test = "+test);
		
//		test = 456;					오류 : final로 선언함					
	
	}

}

package koreait.day03;

import java.util.Scanner;

public class O12_ConditionOp {
// 조건식의 결과에 따라 명령을 선택하는 조건연산자 : 조건식 ? 값/수식T : 값/수식F
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int korean , math;		//국어, 수학점수
		System.out.print("국어점수 : ");
		korean = sc.nextInt();
		System.out.print("수학점수 : ");
		math = sc.nextInt();
		
		//국어점수와 수학점수 모두 80점 이상인가?		->	모범학생
		System.out.println("모범학생 ? "+((korean>=80 && math>=80)?"맞습니다":"아닙니다"));
		
		
		
		//IF : 처리할 명령을 제어하는 조건문
		//		{	} 는 명령문 블록이고 여러개의 명령들을 감싸는 역할의 기호,
		//		{	} 안에 들어가는 명령이 1개일 때느 생략할 수 있다.
		
		if(korean >=80 && math>=80) {
			//조건이 참일 떄 실행하는 문장
			System.out.println("맞습니다.");
		}else {
			//조건이 거짓일 때 실행하는 명령문
			System.out.println("아닙니다.");
		}
		
		
		// System.out.println("특기학생? "+(korean>=90 || math>=90));
		if(korean>=90||math>=90)	
			System.out.println("맞습니다");
		else
			System.out.println("아닙니다");
		
		// 프로그램 처리조건이  else{	}에 해당해는 내용이 없으면 작성 안합니다
		if(!(korean>=20 && korean<=80))
				System.out.println("표준편차 값이 큰 점수입니다");
		
		

		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}

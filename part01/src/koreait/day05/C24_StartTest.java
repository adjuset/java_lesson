package koreait.day05;

import java.util.Scanner;

public class C24_StartTest {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println("[[영화감상 후기]]");
		System.out.print("평점을 몇 점 주시겠습니까 ? (1~5) -> ");
		int score = sc.nextInt();
		
		System.out.println("방법 1)");
		for(int i=0 ; i<5 ; i++) {
			if(score>i) {
				System.out.print("★");
			}
		}
		
//		for(int i=0 ; i<score ; i++) {
//			System.out.print("★");
//		}
		
		
		System.out.printf("\n\n방법 2)");
		
		for(int i=0 ; i<score ; i++) {
			System.out.print("★");
		}
		for(int i=0 ; i<5-score ; i++) {
			System.out.print("☆");
		}
		
		
		System.out.printf("\n\n방법 2_");    //출력횟수는 5-count
		for(int i=0 ; i<5 ; i++ ) {
			if(score>i) {
				System.out.print("★");
			}else {
				System.out.print("☆");
			}
		}
		
		System.out.printf("\n\n방법2__");
		int k;								//loop count 변수가 main메소드의 지역변수
		for(k = 0; k<score ; k++) {			//count = 3;
			System.out.print("★");
		}
		for(;k<5;k++) {						//k의 값은 얼마부터 시작하는 걸까 ? k는 count부터
			System.out.print("☆");
		}
		
	}

}

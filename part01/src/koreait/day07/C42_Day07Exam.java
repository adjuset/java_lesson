package koreait.day07;

import java.util.Random;
import java.util.Scanner;

// 작성자 : 이소원
public class C42_Day07Exam {
//	1. 덧셈 문제는 두자리 덧셈입니다.
//	2. 문제는 난수로 만듬
//	3. 테스트할 때는 문제를 5개로 줄여서 함
//	4. 기본형 int배열로 만들기
//	5. 첫번째 피연산자 배열, 두번째 피연산자 배열, 사용자가 입력한 정답 배열
	
	//모든문제 10개 저장? or 틀린 문제만 저장?
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Random r = new Random();
		int[] fNum = new int[10];	//첫 번쩨 값
		int[] lNum = new int[10];	//두 번쨰 값
		int[] input = new int[10];	//입력받은 값
		int count = 0;				//틀린 갯수 세기
		int score = 0;				//시험 점수
		
		System.out.println("---------------------------------");
		System.out.println("빨간펜 수학 2자리 덧셈 문제 풀기");
		System.out.println("---------------------------------");
		System.out.println("시작합니다.");
		
		for(int i=0 ; i <fNum.length ;i++) {	
			System.out.printf("문제%d. %4d + %3d = 답 입력 -> ",i+1,fNum[i] = r.nextInt(89)+11,lNum[i] = r.nextInt(89)+11);
			input[i] = sc.nextInt();
			
			if(input[i] == fNum[i] + lNum[i]) 	{
				count++;
				score+=10;
			}
		}
		
		System.out.println("-----------------------------------");
		System.out.println("채점합니다. 맞은 갯수 : "+count+"("+ score+"점)");
		System.out.println(":::: 틀린 문제 정답 보기  ::::");

		for(int i=0 ; i<fNum.length; i++) {
			if(input[i]!= fNum[i]+lNum[i]) {
				System.out.printf("문제%d. %4d + %3d = 답 입력 -> %d \n",i+1,fNum[i],lNum[i],fNum[i]+lNum[i]);
				
			}
		}
	}
}
		
		
		
	

package koreait.day09;

import java.util.Random;
import java.util.Scanner;

//C43번을 MathProblem 클래스를 사용하는 것으로 바꾸기 : 연산은 덧셈
public class C43_RedProblem {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Random r = new Random();
		int size = 5;
		int max_size = MathProblem.max_size;	//size 변수값이 max_size 초과하는지 장치 추가

		MathProblem[] problem = new MathProblem[size];
		//모든 문제 저장하는 배열
		
		//배열의 타입은 MathProblem 객체참조형 : n1,n2,op,isCorrect
		
		int count = 0;				//틀린문제 번호 세기
		int answer = 0;			//n1과 n2 제거예정
		
		System.out.println("---------------------------------");
		System.out.println("빨간펜 수학 2자리 덧셈 문제 풀기");
		System.out.println("---------------------------------");
		System.out.println("시작합니다.");
		
		for(int i=0 ; i <size ;i++) {	
			MathProblem temp = new MathProblem('+');
			// problem[i] = new MathProble('+')
			temp.makeProb();              		//n1,n2값이 객체의 필드로 난수생성
			System.out.println("문제"+(i+1)+". "+temp.problem()+" 답 입력 ->");
			
			answer = sc.nextInt();
		
			if(answer == temp.showAnswer()) 	{	//정답과 비교
				count++;
				temp.setCorrect(true);
			}
			//배열에 temp객체 값들 저장
			problem[i] = temp;
		}
		
		System.out.println("-----------------------------------");
		System.out.println("채점합니다. 맞은 갯수 : "+count+"("+ count*100/size+"점)");
		System.out.println(":::: 틀린 문제 정답 보기  ::::");
		
		//향상된 for문 쓰기
//		for(MathProblem temp:problem) {
//			int i=0;
//			if(!temp.isCorrect()) {	//틀렸을 때
//				System.out.println(temp.problem()+temp.showAnswer());
//				i++;
//			}
//		}
		

		for(int i=0 ; i<problem.length; i++) {
			//배열 활용하기
			if(!problem[i].isCorrect()) {	//틀렸을 때
//				System.out.println("문제"+(i+1)+ "번. "+problem[i].getN1()+" + "+problem[i].getN2()+"= "+problem[i].showAnswer());
				System.out.println("문제"+(i+1)+". "+problem[i].problem()+problem[i].showAnswer());
			}
		}
		

		sc.close();

	}
// 추가 : 사용자 입력한 answer을 저장해서 오답 출력시 같이 보여주고 싶다면 ? 
}

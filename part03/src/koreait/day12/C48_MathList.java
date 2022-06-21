package koreait.day12;

import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;


//C43번 예제에서 베열을 리스트로 변경하기
public class C48_MathList {
// 작성자 : 이소원
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Random r = new Random();
		int size = 5;
		ArrayList<MathProblem> problems = new ArrayList<>();
		
		int count = 0;
		int answer;
		
		System.out.println("---------------------------------");
		System.out.println("빨간펜 수학 2자리 덧셈 문제 풀기");
		System.out.println("---------------------------------");
		System.out.println("시작합니다.");
		
		for(int i=0 ; i<size ;i++) {
			MathProblem temp = new MathProblem('+');
			temp.makeProb();
			System.out.print("문제"+(i+1)+". "+temp.problem()+" 답 입력 ->");
			answer = sc.nextInt();
			
			if(answer == temp.showAnswer()) {
				count++;
				temp.setCorrect(true);
			}
			
			problems.add(temp);			//배열, 인덱스 i에 temp 객체 참조값을 저장해라
			
		}
		
		System.out.println("-----------------------------------");
		System.out.println("채점합니다. 맞은 갯수 : "+count+"("+ count*100/size+"점)");
		System.out.println(":::: 틀린 문제 정답 보기  ::::");
		
		for(int i=0 ; i<problems.size(); i++) {
			if(!problems.get(i).isCorrect()) {		//거짓이면 참으로 바뀜
				System.out.println("문제"+(i+1)+". "+(problems.get(i).problem())+(problems.get(i).showAnswer()));
			}
		}
		


	}

}

package koreait.day09;

import java.util.Random;
import java.util.Scanner;

public class C42_RedPanExam {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Random r = new Random();
		int[] fNum = new int[10];	//첫 번쩨 값
		int[] lNum = new int[10];	//두 번쨰 값
		int[] no = new int[10];		//틀린 값 저장
		int count = 0;				//틀린문제 번호 세기
		int n1,n2;
		
		System.out.println("---------------------------------");
		System.out.println("빨간펜 수학 2자리 덧셈 문제 풀기");
		System.out.println("---------------------------------");
		System.out.println("시작합니다.");
		
		for(int i=0 ; i <fNum.length ;i++) {	
			System.out.printf("문제%d. %4d + %3d = 답 입력 -> ",i+1,fNum[i] = r.nextInt(89)+11,lNum[i] = r.nextInt(89)+11);
			int anwer = sc.nextInt();
			
			if(anwer != fNum[i] + lNum[i]) 	{	//답을 맞추면 answer ==n1+n2
				//3개 배열에 틀린문제 내용 저장하기
				fNum[count] = n1;
				lNum[count] = n2;
				no[count] = i+1;
				count++;
			}
		}
		
		System.out.println("-----------------------------------");
		System.out.println("채점합니다. 맞은 갯수 : "+(fNum.length-count)+"("+ (fNum.length-count)*100/size+"점)");
		System.out.println(":::: 틀린 문제 정답 보기  ::::");

		for(int i=0 ; i<fNum.length; i++) {
			if(answer!= fNum[i]+lNum[i]) {
				System.out.printf("문제%d. %4d + %3d = 답 입력 -> %d \n",i+1,fNum[i],lNum[i],fNum[i]+lNum[i]);
				
			}
		}

	}

}

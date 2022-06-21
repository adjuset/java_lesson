package koreait.day04;

import java.util.Scanner;

public class C18_ReviewEx {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String best = "";
		int max;
		
		
		System.out.println("[[성적집계 : 평균과 총점 구하기]]");
		System.out.println("성적 입력하세요.");
		System.out.print("국어 ->");
		int lan = sc.nextInt();
		System.out.print("영어 -> ");
		int eng = sc.nextInt();
		System.out.print("과학 ->");
		int sci = sc.nextInt();
		
		int total = lan + eng + sci;
		double avg = (double)total / 3;
		
		if(lan > eng) {
			max = lan;
			best = "국어";
		}
		else {
			max = eng;
			best =  "영어";
		}
		
		if(max<sci) {
			max = sci;
			best = "과학";
		}
			
		
		System.out.println("총점 : "+total);
		System.out.printf("평균 : %d  (%.2f)  , 과목 수 : %d\n ",(int)avg,avg,3);
		System.out.println("이 핵생의 특기 과목은 "+best+"입니다");
		
	}

}

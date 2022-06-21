package koreait.day03;

import java.util.Scanner;

public class C13_MaxMinEx {
//이름 : 이소원
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		//3개의 입력한 값 중에서 가장 큰 값을 출력합니다
		System.out.println("첫번쨰 값 > ");
		int a = sc.nextInt();
		System.out.println("두번쨰 값 > ");
		int b= sc.nextInt();
		System.out.println("세번쨰 값 > ");
		int c= sc.nextInt();
		
		int max;
		int min;
		
		if(a>b) {
			max = a;
			min = b;
		} else {
			max = b;
			min =a;
		}
		
		if(max<c) max = c;
		if(min>c) min = c;
	
		
		System.out.println("최대값 : "+max+"  최소값: "+min);
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}

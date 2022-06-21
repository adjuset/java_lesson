package koreait.day06;

import java.util.Arrays;
import java.util.Random;

public class C31_RandomEx {

	public static void main(String[] args) {
		/*
		 * 	학생 성적(국어) 분포 보고서를 만듭니다
		 * 	학생 인원은 100명   - 점수는 랜덤값으로 테스트(1 <- 난수 <-100 )
		 * 
		 *  90 ~100	: 0명  (2.3%)	카운트변수 5개 필요함 ( cntA cntB cntC cntD )
		 *  80 ~ 89 : 0명  (10.3%)					- counts[5] : counts[0], counts[1]
		 *  70 ~ 79 : 0명	counts[2];
		 *  60 ~ 69 : 0명	counts[3];
		 *  60점미만    : 0명	counts[4];  
		 */
	
		int[] koreans = new int[10];
		int[] counts = new int[5];
		Random r = new Random();
		
		for(int i=0 ; i<koreans.length; i++) {
			koreans[i] = r.nextInt(101);	
		}
		
		String tmp = Arrays.toString(koreans);
		System.out.println(tmp);
		
		//점수 분포 count 하기	: 100보다 크다는 안만들어도됨
		for(int i=0 ; i<koreans.length; i++) {
				if(koreans[i]>=90) 	counts[0]++;
				else if(koreans[i]>=80) counts[1]++;
				else if(koreans[i]>=70) counts[2]++;
				else if(koreans[i]>=60) counts[3]++;
				else if(koreans[i]<60) counts[4]++;

		}
		
		//점수 분포 결과 출력하기
		System.out.printf("90~100\t 80~89\t 70~79\t 60~60\t 60미만\n");
		System.out.printf("%8s %8s %8s %8s %8s\n","90~100,","80~89","70~79","60~69","60미만");
		System.out.println("---------------------------------------------------------------");
		for(int i=0 ; i<counts.length ; i++) {
			//counts 배열값 출력
			System.out.printf("%8d",counts[i]);
		}
		
		System.out.println();
		for(int i=0 ; i<counts.length;i++) {
			//백분율 구하기
			System.out.printf("%8.1f%%",(double)counts[i]/koreans.length*100);
		}
		
	}

}

//배열에서 기능이 향상(데이터 삭제/삽입,크기도 동적으로 변함)된 것이 자바  ArrayList
//배열에서는 직접 데이터 삽입/삭제를 구현합니다 ->메소드 정의

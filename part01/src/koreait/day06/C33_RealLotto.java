package koreait.day06;

import java.util.Arrays;
import java.util.Random;

public class C33_RealLotto {
//작성자	: 이소원
	public static void main(String[] args) {
		
		int[] numbers = new int[45];	
		Random r = new Random();
		
		//처음 상태 : 값을 인덱스 +1 -> 인덱스 난수를 뽑고 해당 값을 삭제하면 이 규칙은 적용이 안 됨
		for(int i=0 ; i<numbers.length; i++) {	// 인덱스 범위 : 0~44	 -> 난수로 뽑히는 값
			numbers[i] = i+1;					// 로또 값 범위  :   1~45 ->lotto배열에 저장되는 값
		}
		
		System.out.println("numbers 배열 초기값---------------------------------");
		System.out.println(Arrays.toString(numbers));
		System.out.println("-------------------------------------------------");
		System.out.println();

		int[] lotto = new int[6];	//로또 뽑힌 값 담을 배열
		int k;						//뽑힐 값의 인덱스 -> 난수로 정함
		
		for(int cnt=0 ; cnt<6 ; cnt++) {	
			
			k = r.nextInt(45-cnt);	
			//cnt =0,1,2,3,4,5에 대해 난수의 bound 값은 45,44,43,42,41,40 -> 중복방지(확률적인 범위를 줄이기)
			//k의 난수범위? 0~44, 0~43, 0~42, 0~41, 0~40, 0~39
			
			System.out.println("k="+k+", number ="+numbers[k]);
			//뽑힌 값(k)과 numbers배열의 k의 값을 넣어서 출력해줌
			
			lotto[cnt] = numbers[k];
			//number배열에서 난수로 뽑힌 인덱스k의 값이 저장
			
			for(int i=k; i<numbers.length-1;i++ ) {				
				numbers[i] = numbers[i+1];
			}
			
			
			System.out.println(Arrays.toString(numbers));
			//numbers 배열의 값들을 보여줌
	
		}
		System.out.print("최종 선택 숫자 : ");
		System.out.println(Arrays.toString(lotto));
		//뽑힌 6개의 숫자들을 출력해줌
		
		Arrays.sort(lotto);
		//정렬해줌
		
		System.out.println(Arrays.toString(lotto));
		//정렬된 수들을 다시 출력해줌
		
	}

}

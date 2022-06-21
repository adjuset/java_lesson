package koreait.day12;

import java.util.ArrayList;
import java.util.Random;

public class C49_RealLottoTest {
	public static void main(String[] args) {
		
		ArrayList<Integer> numbers = new ArrayList<>();
		
		for(int i=0 ; i<45 ; i++) { //0~44
			numbers.add(i+1);		//1 ~ 45
		}
		System.out.println("numbers");
		System.out.println(numbers);	//toString이 재정의
		
		Random r = new Random();
		
		ArrayList<Integer> lotto = new ArrayList<>();
		
		int k;		//난수로 뽑힐 값 인덱스 정함
		
		for(int cnt=0 ; cnt<6;cnt++) {
			k = r.nextInt(45-cnt);		//중복방지
			System.out.println("k="+k+" , number : "+numbers.get(k));
			lotto.add(numbers.get(k));	
			numbers.remove(k);			//뽑힌 값 삭제해줌
			System.out.println("남은 공");
			System.out.println(numbers);
		}
		
		System.out.println("최종 선택 숫자 6개");
		System.out.println(lotto);
		
	}
	
	// 배열의 저장된 값의 위치 변경(삽입/삭제) 메소드가 없습니다.  
	//배열의 크기는 정적이지만 list의 크기는 동적이라 사용함 -> 웹 프로그래밍 할 때 ArrayList는 필수임
	
	
	
}

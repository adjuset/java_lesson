package koreait.day12;

import java.util.HashMap;
import java.util.Scanner;

public class C52_MyDictionary_for {

	// 선택기능 1.단어저장 , 2.단어검색  3.단어장보기  4.프로그램 끝내기
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		HashMap<String,String> my = new HashMap<>();
		String English;
		String eng;
		String Korean;
		boolean result = true;
		
		System.out.println("선택기능  →  1.단어저장    2.단어검색    3.단어장보기    4.프로그램 끝내기");
		
		while(result) {
			System.out.print("선택🙌 ->");
			int choice = sc.nextInt();
			
			if(choice == 1) {		//단어저장
				System.out.print("English -> ");
				English = sc.next();
				System.out.print("Korean -> ");
				Korean = sc.next();
				
				my.put(English, Korean);
				
			}else if(choice == 2) {		//단어검색
				System.out.print("검색 단어  English -> ");
				eng = sc.next();
				
				if(my.containsKey(eng)) {
					System.out.println("단어장 검색했습니다. 결과=>"+my.get(eng));
				}else {
					System.out.println("단어장 검색했습니다. 결과=>null");
				}
				
			}else if(choice == 3) {		//단어장 보기
				System.out.print("단어장 전체보기 : ");
				System.out.println(my);
				
			}else if(choice == 4) {		//프로그램 끝내기
				result = false;
			}else {
				System.out.println("번호를 잘못 입력하셨습니다.");
			}
		}
		System.out.println("-------프로그램 종료--------");
	}
}

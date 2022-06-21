package koreait.day12;

import java.util.HashMap;
import java.util.Scanner;
import java.util.TreeMap;

public class C52_MyDictionary_switch {

	public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
		
//		HashMap<String,String> my = new HashMap<>();
		TreeMap<String, String> my = new TreeMap<>();
		
		String English;
		String eng;
		String Korean;
		boolean result = true;
		
		System.out.println("선택기능  →  1.단어저장    2.단어검색    3.단어장보기    4.프로그램 끝내기");
		

		while(result) {
			System.out.print("선택🙌 ->");
			int choice = sc.nextInt();
			
			switch(choice) {
			case 1:
				System.out.print("English -> ");
				English = sc.next();
				System.out.print("Korean -> ");
				Korean = sc.next();
				
				my.put(English, Korean);
				break;
			case 2:
				System.out.print("검색 단어  English -> ");
				eng = sc.next();
				
				System.out.println("단어장 검색했습니다. 결과=>"+my.get(eng));
				
				break;
			case 3:
				System.out.print("단어장 전체보기 : ");
				System.out.println(my);
				break;
			case 4:
				result = false;
				break;
			default:
				System.out.println("번호를 잘못 입력하셨습니다");
			}
		}
		System.out.println("-------프로그램 종료--------");
	
		
		//참고 : 정수 데이터 입력을 받아야한다면 문자열 nextLine() 받아서 정수로 변환합니다.
		//		int score = Integer.parseInt(sc.nextLine());
		//이유 : nextInt()은 엔터를 처리하지 않아서 다음에 나오는 nextLine()에게 전달되어 입력 흐름에 방해가 됨
		
		
		
	}
}

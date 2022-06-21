package 연습;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;

public class Main1 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		List<Word> words = new ArrayList<>();
		
		boolean result = true;
		String Eng, Kor, eng;
		int level = 0;
		
		//3,4번은 밑에 메소드 정의하기
		System.out.println("선택기능  →  1.단어저장    2.단어검색    3.전체보기    4. 레벨로 검색    5.프로그램 끝내기");
		
		
		while(result) {
			System.out.print("선택 : ");
			String choice = sc.nextLine();
			
			switch(choice) {
			case "1":		//단어저장
				System.out.print("English > ");
				Eng = sc.nextLine();
				System.out.print("Korean > ");
				Kor = sc.nextLine();
				System.out.print("level > ");
				level = Integer.parseInt(sc.nextLine());
				
				words.add(new Word(Eng, Kor, level));
				break;
				
			case "2":		//단어검색	
				System.out.print("검색하고 싶은 English > ");
				eng = sc.nextLine();
				for(Word temp : words) {
					if(temp.getEnglish().equals(eng)) {
						System.out.println("단어장 검색 완료  : "+temp.toString());
					}
				}
				break;
				
			case "3":		//전체보기 : 오름차순
				all(words);
				break;
			case "4":		//레벨로 검색
				System.out.print("검색할 level : ");
				int no = Integer.parseInt(sc.nextLine());
				search(no, words);
				break;
			case "5":		//끝내기
				result = false;
				break;
			}
		}
	
	}

	private static void search(int no, List<Word> words) {
		
		for(Word temp : words) {
			if(temp.getLevel() == no) {
				System.out.println(temp);
			}
		}
		
	}

	private static void all(List<Word> words) {

		words.sort(new Comparator<Word>() {

			@Override
			public int compare(Word o1, Word o2) {
				Integer level1 = o1.getLevel();
				Integer level2 = o2.getLevel();
				return level1.compareTo(level2);
			}
		});
		
		for(Word temp : words) {
			System.out.println(temp.toString());
		}
	}
}


package 연습1;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;

public class Direct {

	public static void main(String[] args) {

		Scanner sc= new Scanner(System.in);
		List<Word> myword = new ArrayList<>();
		boolean result = true;
		String Eng;
		String Kor;
		String eng;
		int level;
		int num;
		
		
		System.out.println("선택기능  →  1.단어저장    2.단어검색    3.전체보기    4. 레벨로 검색    5.프로그램 끝내기");

		while(result) {
			System.out.print("선택 -> ");
			String choice = sc.nextLine();
			
			switch(choice) {
			case "1":	//단어저장
				System.out.print("English : ");
				Eng = sc.nextLine();
				System.out.print("Korean : ");
				Kor = sc.nextLine();
				System.out.print("단어 level : ");
				level = Integer.parseInt(sc.nextLine());
				
				myword.add(new Word(Eng, Kor,level));
				break;
			case "2":	//단어검색
				System.out.print("English 검색 : ");
				eng = sc.nextLine();
				
				for(Word temp : myword) {
					if(temp.getEnglish().equals(eng)) {
						System.out.println(temp.toString());
					}
				}
				
				break;
			case "3":	//전체보기  : 레벨로 오름차순으로 보기
				all(myword);
				
				break;
			case "4":	//레벨로 검색
				System.out.print("원하는 레벨을 검색하세요(1~3) : ");
				num = Integer.parseInt(sc.nextLine());
				
				for(Word temp : myword) {
					if(temp.getLevel() == num) {
						System.out.println(temp.toString());
					}
				}
				
				break;
			case "5":	//종료
				result = false;
				break;
			}
			
		}
		
		
		
	}

	private static void all(List<Word> myword){
		myword.sort(new Comparator<Word>() {

			@Override
			public int compare(Word o1, Word o2) {
				Integer level1 = o1.getLevel();
				Integer level2 = o2.getLevel();
				return level1.compareTo(level2);
			}
		});

		for(Word temp : myword) {
			System.out.println(String.format("%-10s %-10s %10d", temp.getEnglish(),temp.getKorean(),temp.getLevel()));
		}
		
	}
}



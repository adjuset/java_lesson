package koreait.day17;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;
import java.util.StringTokenizer;

import koreait.day16.Word;

public class MyDictionaryV2 {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		Scanner ssc = new Scanner(System.in);
		
		List<Word> mywords = new ArrayList<>();		//my를 mywor로 바꿔서 구현해보기
		try {
			System.out.print("파일에서 읽어올까요 ? (y or n) :");
			if(ssc.nextLine().equals("y"))
				read(mywords,"C:\\a.GookBe\\나의영한사전.txt");
			else
				System.out.println("파일을 새로 만듭니다");
			
		} catch (FileNotFoundException e1) {
			System.out.println("파일 읽는 중에 오류발생 : "+e1.getMessage());
		}			//파일에 기존 내용 읽어오고 그 내용을 mywords 리스트에 저장하기

		
		String English;
		String eng;
		String Korean;
		int level;
		boolean result = true;
		
		System.out.println("선택기능  →  1.단어저장    2.단어검색    3.전체보기    4. 레벨로 검색    5.프로그램 끝내기");
		

		while(result) {
			System.out.print("선택🙌 ->");
			int choice = sc.nextInt();
			
			switch(choice) {
			case 1:
				System.out.print("English -> ");
				English = sc.next();
				System.out.print("Korean -> ");
				Korean = sc.next();
				System.out.print("단어 level ? : ");				
				level = sc.nextInt();
				
				mywords.add(new Word(English, Korean,level));
				break;
				
			case 2:
				System.out.print("검색 단어  English -> ");
				eng = sc.next();
				
				for(Word temp : mywords) {
					if(temp.getEnglish().equals(eng)) {
						System.out.println("단어장 검색 완료했습니다 결과 ->  ");
						System.out.println(temp.toString());
					}
				}
			break;

			case 3:
//				System.out.print("단어장 전체보기 : "+mywords);
				all(mywords);		
				break;
				
			case 4:
				System.out.print("검색할 레벨 입력 (1~3) -> ");
				int no = sc.nextInt();
				level(mywords, no);
				break;
				
			case 5:
				result = false;
				break;
			default:
				System.out.println("번호를 잘못 입력하셨습니다");
				break;
			}
		}
		
		
		try {	//myword 리스트의 내용을 파일에 저장하기	
			System.out.print("파일에 저장할까요 ? (y or n) :");
			if(ssc.nextLine().equals("y"))
				save(mywords, "C:\\a.GookBe\\나의영한사전.txt");
			else
				System.out.println("파일이 저장되지 않음");
			
			
		} catch (FileNotFoundException e) {
			System.out.println("파일 저장 중에 오류가 생겼습니다."+e.getMessage());
		}			
		System.out.println("-------프로그램 종료--------");
			
		
	}
	
	
	//파일에 출력하기(저장하기)
	private static void save(List<Word> mywords, String filename) throws FileNotFoundException {
		File file = new File(filename);
		PrintWriter pw = new PrintWriter(file);
		for(Word w : mywords) 
			pw.println(w);
		
		pw.close();
		System.out.println("파일 저장이 완료되었습니다.");
	}
	
	
	//파일 읽어오기 and StringTokenizer로 myword에 저장하기
	private static void read(List<Word> mywords, String filename) throws FileNotFoundException {
		File file = new File(filename);
		Scanner sc = new Scanner(file);
		
		while(sc.hasNext()) {
			String temp = sc.nextLine();		//파일에서 1줄 잃어온 것 저장
			String t = temp.substring(0, temp.indexOf("("));
			System.out.println(t);	
			//이에 결과를 참고로 StringTokenizer로 Word객체 만들기 myWord 리스트에 추가하기
			//코딩 완성되면 3번 전체보기 실행해봄
			StringTokenizer st = new StringTokenizer(t);
			
			while(st.hasMoreTokens()) {
				mywords.add(new Word(st.nextToken(),					//english
									st.nextToken(),						//korean
									Integer.parseInt(st.nextToken())));	//level
			}
		}
		sc.close();
		System.out.println("파일 읽어오기 완료되었습니다");
	}
	
	
	//level 같은 거 가져오기
	private static void level(List<Word> mywords, int no) {
		for(Word w : mywords) {
			if(w.getLevel() == no) {
				System.out.println(w);
			}
		}
	}
	
	
	//sort로 정렬하기
	private static void all(List<Word> mywords) {	
		mywords.sort(new Comparator<Word>(){		//비교할 요소가 2개 이상이므로 그냥하면 오류남
			@Override
			public int compare(Word o1, Word o2) {	// 오름차순 정렬
				return o1.getEnglish().compareTo(o2.getEnglish());
			}
		});
		
		System.out.println(String.format("%-20s %-20s %10s", "English","Korean","Level"));
		System.out.println("--------------------------------------------------------");
		for(Word w : mywords) {
			System.out.println(String.format("%-20s %-20s %10d", w.getEnglish(), w.getKorean(), w.getLevel()));
		}
		
	}	
}


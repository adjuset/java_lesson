package koreait.day12;

import java.util.ArrayList;
import java.util.Arrays;

public class C46_ArrayList {

	public static void main(String[] args) {
		
		int[] dates = {45,23,7,21,19,11,44};	//배열은 선언할 때 배열의 크기를 정함	>  ☆정적임
												//배열은 기본형 데이터 타입 int, double, float, long ... 또는 참조형 타입
		
		ArrayList<Integer> list = new ArrayList<>();	//ArrayList는 크리가 ★동적임
														//데이터타입은 항상 참조형타입.  > 기본형은 래퍼클래스를 사용합니다
														//<> 는 제네릭 타입이라고 부름  : 데이터 요소의 타입을 정한다 > Generic
		String[] names = {"쯔위","모모","사나","은하","나나"};
		ArrayList<String> name_list = new ArrayList<>(); 
		
		//ArrayList에 데이터 추가는  add() 메소드
		list.add(45); list.add(7); list.add(21);
		list.add(19); list.add(11); list.add(44);
		
		
		System.out.print("1. 첫 번째 ArrayList<Integer> 출력  : ");
		System.out.println(list);
		System.out.println("참고(배열_ : "+Arrays.toString(dates)+", 배열크기 : "+dates.length);
		System.out.println("리스크 크기:"+list.size());
		System.out.println();
		
		
		name_list.add("쯔위"); name_list.add("모모");
		name_list.add("은하"); name_list.add("나나");
		System.out.println("2. 두 번쨰 리스크<String> 출력");
		System.out.println(name_list);						
		System.out.println("리스크의 크기 : "+name_list.size());	//데이터 없을 떄는 0
		System.out.println();
		
		
		
		System.out.println("3. 특정 위치에 데이터 추가");
		list.add(1, 23);	//(인덱스 위치, 추가될 값)
		System.out.println("add(1, 23) 결과 : "+list);
		name_list.add(2, "신비");
		System.out.println("add(2, \"신비\") 결과 :"+name_list);
		System.out.println();
		
		
		System.out.println("4. 배열처럼 인덱스 데이터 가져오기 (get)");
		System.out.println("get(3) : "+list.get(3));
		System.out.println("get(3) : "+name_list.get(3));
		System.out.println();
		
		
		System.out.println("5. 특정 위치의 데이터(요소) 삭제");
		list.remove(4);
		System.out.println("remove(4) 결과: "+list);
		name_list.remove(4);
		System.out.println("remove(4) 결과 : "+name_list);
		
		
		System.out.printf("\n6. 특정 값 위치를 알아내기 ('신비'는 몇 번 인덱스 ?) \n");
		System.out.println("배열 : "+Arrays.binarySearch(names,"신비"));		//★ 처음 보는 것
		System.out.println("리스트 : "+name_list.indexOf("신비"));
		
		
		System.out.printf("\n 7. 6번의 실행내용을 for문으로 한다면 ? \n");
		System.out.println("배열");
		int i;
		for(i=0 ; i<names.length; i++) {
			if(names[i].equals("신비")) 
				break;
		}
		System.out.println("신비는 인덱스 : "+i);
		
		System.out.println("리스트");
		for(i=0 ; i<name_list.size() ;i++) {
			if(name_list.get(i).equals("신비"))		break;}
		
		System.out.println("신비는 인덱스 : "+i);
		
	
		// '신비' 요소가 여러개 일떄  : lastIndexOf 메소드로 마지막 일치 요소를 찾을 수 있음
		System.out.printf("\n 8. contains 메소드");
		System.out.println("\'나나\'가 리스트에 있는가 ? "+name_list.contains("나나"));
		System.out.println("\'다현\'이 리스트에 있는가 ? "+name_list.contains("다현"));
		
	
	}

}

/*	배열 : 많은 양의 데이터를 저장하는 방법
 * 
 * 	컬렉션(Collection)	: 자료구조, 많은 양의 데이터를 저장하는 것이고 데이터 특징에 따라
 * 						    관리(저장, 읽기/쓰기)하는 차이가 있다
 * 						    데이터를 삽입/삭제 등의 알고리즘이 메소드로 구현되어 있습니다
 * 		ㄴ  ArrayList  클래스		
 * 		ㄴ HashMap 	   클래스
 */ 

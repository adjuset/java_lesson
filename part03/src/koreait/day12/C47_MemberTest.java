package koreait.day12;

import java.util.ArrayList;

public class C47_MemberTest {

	public static void main(String[] args) {

//		Member[] members = new Member[10];
		ArrayList<Member> list = new ArrayList<>();	//리스트에 저장되는 것은 객체의 참조값
		
		list.add(new Member("모모",27));		//새로운 객체가 생성되고 참조값을 리스트에 추가
		
		
		Member member = new Member("다현 ",26);
		list.add(member);
		list.add(new Member("나나",22));
		list.add(new Member("슬기",23));
		
		list.get(0);						//list 0번째 값인 (모모,27)을 보여줌
		
		System.out.println("현재 list의 요소 갯수 : "+list.size());
		System.out.println("1. 리스트 출력");
		System.out.println(list);
		
		
		System.out.println("2. list의 요소 중 참조 객체 age 의 필드 값이 25 이하인 것만 출력해보기. ");
		for(int i=0 ; i<list.size();i++) {
			if(list.get(i).getAge() <= 25) {
				System.out.println("i = "+i+","+list.get(i));
			}
		}
		System.out.println();
	
		System.out.println("3. '나나'는 몇번 인덱스에서 참조하고 있는 객체인가?");
		
		for(int i=0 ; i<list.size() ;i++) {
			if(list.get(i).getName().equals("나나")) {
				System.out.println("참조값 위치 : "+i);
			}
		}
		
		//리스트 요소가 여러개의 필드값을 갖는 객체일 때, 필드값 비교하는 equals 예제 입니다
		//						ㄴ indexOf는 String, 기본형 래커클래스만 추가적인 기능 구현없이 사용함
				
		
		System.out.println("Member 객체로 indexOf 실행 : "+list.indexOf(new Member("나나",20)));
		//-1   : 못찾음 (이유: 참조값이 같은 것을 찾는것인데 이것을 필드값 비교해서 찾도록 바꾸어 주는 기능 구현이 필요)
		
		System.out.println("Member 객체로 indexOf 실행 : "+list.indexOf(member));
		
		
		//비행기 82000  호텔 23000  배 30000 
		// 준 것 52000  > 83000
		
		
		
		
		
		
		
		
		
		
		
	
	}
}

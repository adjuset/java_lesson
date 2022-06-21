package koreait.day13a;

import java.util.Comparator;
import koreait.day12.Member;

//Member 객체의 sort  :  비교가능한 값으로 필드 중 하나를 선택해서 비교자(Comparator) 구현체 만듬
//Member 클래스  변수 하나를 선택해서 비교 (Comparator)
public class MemberAgeAscending implements Comparator<Member> {	

	@Override
	public int compare(Member o1, Member o2) {
		Integer age1 = o1.getAge();
		Integer age2 = o2.getAge();
		
		//age 필드값(1차 기준 - 나이 )이 같을 때 name필드(2차 기준 - 이름) 오른차순으로 정렬
		if(age1 == age2) {
			return o1.getName().compareTo(o2.getName());
		}
		else {
			return age1.compareTo(age2);
		}
		
		//오름차순 : age1 < age2 일 때 -1을 리턴
		//출력할 때 나이 오름차순 순서대로 출력됨
	}
	
}

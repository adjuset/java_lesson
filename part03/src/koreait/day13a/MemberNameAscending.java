package koreait.day13a;

import java.util.Comparator;
import koreait.day12.Member;

//Member 클래스를 비교하기 위한 비교자(Comparator)
public class MemberNameAscending implements Comparator<Member> {

	
	@Override
	public int compare(Member o1, Member o2) {
		//name 필드 비교 : 오름차순(오른쪽이 더 커야됨) > 왼쪽이 더 크면 1, 오른쪽이 더 크면 -1
		return o1.getName().compareTo(o2.getName());
	}

}

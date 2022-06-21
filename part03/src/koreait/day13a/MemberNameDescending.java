package koreait.day13a;

import java.util.Comparator;
import koreait.day12.Member;

public class MemberNameDescending implements Comparator<Member>{

	@Override
	public int compare(Member o1, Member o2) {
	//name 필드 비교	: 내림차순(왼쪽이 더 커야됨)
		
		
		return o1.getName().compareTo(o2.getName());
	}

}

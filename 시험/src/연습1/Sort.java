package 연습1;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class Sort {

	public static void main(String[] args) {

		System.out.println("Comparator 사용");
		List<Member> list = new ArrayList<>();
		
		list.add(new Member("ali",23));
		list.add(new Member("nana",21));
		list.add(new Member("jiun",25));
		list.add(new Member("zion",28));
		list.add(new Member("con",23));
		
		System.out.println("리스트 상태 : "+list);
		
		
		list.sort(new MemberAge());
		System.out.println("오름차순 완료 : "+list);
		
		list.sort(new MemberAgeDe());
		System.out.println("내림차순 완료 : "+list);
		
		
		List<Us> ulist = new ArrayList<>();
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}

package 연습1;

import java.util.Comparator;

public class MemberAge implements Comparator<Member> {

	@Override
	public int compare(Member o1, Member o2) {	//오름차순
		Integer age1 = o1.getAge();
		Integer age2 = o2.getAge();
		
		if(age1 == age2) {
			return o1.getName().compareTo(o2.getName());
		}else {
			return age1.compareTo(age2);
		}
		
	}

}

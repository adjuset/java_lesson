package 연습1;

import java.util.Comparator;

public class MemberAgeDe implements Comparator<Member> {

	@Override
	public int compare(Member o1, Member o2) {	//내림차순
		Integer age1 = o2.getAge();
		Integer age2 = o1.getAge();
		return age1.compareTo(age2);
	}

}

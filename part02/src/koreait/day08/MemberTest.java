package koreait.day08;

public class MemberTest {

	public static void main(String[] args) {
		Member m1 = new Member();
		
		Member m2 = new Member("최나나","NANA@gmail.com");
		System.out.println("nana name : "+m2.getName());
		m2.setAge(26);
		System.out.println("nana age : "+m2.getAge());
		
	}

}

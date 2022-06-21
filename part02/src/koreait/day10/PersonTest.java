package koreait.day10;

public class PersonTest {

	public static void main(String[] args) {

		Person sinb = new Person();
		sinb.setName("신비");
		sinb.setAge(27);
		System.out.println(sinb);			//toString 재정의 해야됨
		System.out.println(sinb.toString());	
		
		Person momo = new Person();
		System.out.println(momo);
		
		
	}

}

package koreait.day13a;

//객체의 비교 두번째 반복  : 비교할 수 있는 타입으로 만들기.
//		- Comparable<User> 인터페이스 구현 : java.lang > import 안해도 됨
public class User implements Comparable<User>{

	private String name;
	private int age;
	
	public User(String name, int age) {
		this.name = name;
		this.age = age;
	}
	
	//Comparable 인터페이스 추상클래스 구현  : 구현 안하면 sort로 오름차순 못함
	@Override
	public int compareTo(User o) {	//현재객체의 age와 인자값 age 비교
		Integer o1 = this.age;
		Integer o2 = o.getAge();
		
		return o1.compareTo(o2);		
		//오름차순 일 때
	}

	//Object 클래스 : toString() 재정의
	@Override
	public String toString() {
		return "User [name=" + name + ", age=" + age + "]";
	}

	public String getName() {
		return name;
	}
	public int getAge() {
		return age;
	}

		
	
}

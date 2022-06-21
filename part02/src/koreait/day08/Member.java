package koreait.day08;

public class Member {
	
	private String name;
	private String email;
	private int age;
	private int level;
	
	public Member(String name, String email){
		this.name = name;
		this.email = email;
	}
	
	public Member() {
		System.out.println("기본생성자는 \"name,email,age,level 필드는 기본 값입니다.\"");
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public int getLevel() {
		return level;
	}

	public void setLevel(int level) {
		this.level = level;
	}

		
}

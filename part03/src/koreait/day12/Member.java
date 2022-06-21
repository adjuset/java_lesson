package koreait.day12;

public class Member {
	private String name;
	private int age;
	protected boolean vaild;

	public Member(String name, int age) {
		this.name = name;
		this.age = age;
	}
	
	public String getName() {
		return name;
	}

	public int getAge() {
		return age;
	}

	@Override
	public String toString() {
		return "[name=" + name + ", age=" + age + ", vaild=" + vaild + "]";
	}

	
















}	

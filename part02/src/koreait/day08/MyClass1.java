package koreait.day08;

public class MyClass1 {

	private int age;
	public double point;
	String name;
	
	
	void setAge(int age) {
		if(age >1 && age<=150)
			this.age = age;		//age필드는 현재 클래스에서만 접근
		else
			System.out.println("잘못된 값입니다");
	}
	
	int getAge() {		//getAge는 package 한정자
		return age;
	}	
}
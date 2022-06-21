package 연습;

import java.util.Comparator;

public class U implements Comparator<U>{

	private int age;
	private String name;
	
	public U(int age, String name){
		this.age = age;
		this.name = name;
	}
	

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}



	@Override
	public int compare(U o1, U o2) {
		Integer age1 = o1.getAge();
		Integer age2 = o2.getAge();
		return age1.compareTo(age2);
	}

	
	
	
}


package koreait.day09a;

import koreait.day11.test.Animal;

public class Dog extends Animal {
	
	protected int legs;
	
	public Dog() {
		System.out.println("새로운 동물가족은 Dog 입니다");
		type = Animal.DOG;
	}
	
	public void run() {
		setName("강아지");
		setColor("브라운");
		System.out.println("특징 : 달리기");
	}

	//추상메소드 재정의(구현)
	@Override
	public void act() {
		System.out.println("Animal 행동 : 하루에 두 번 산책하기");
	}
	
	//추상메소드 재정의(구현)
	@Override
	public String eat(Object object) {
		return "먹이는 "+object+"입니다.";
	}
	
}

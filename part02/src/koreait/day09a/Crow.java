package koreait.day09a;

import koreait.day11.test.Animal;

public class Crow extends Animal{
	protected int wings;	
	//디폴트 한정자  + 다른 패키지 자식클래스
	
	public Crow() {
		System.out.println("새로운 동물가족은 crow");
		type =Animal.CROW;
	}
	
	public void fly() {
		setName("끼미귀");
		setColor("검정색");
		System.out.println("특징 : 날기");
	}

	//추상메소드 재정의(구현)
	@Override
	public void act() {
		System.out.println("벌레 냠냠");
		
	}
	//추상메소드 재정의(구현)
	@Override
	public String eat(Object object) {
		return "먹이는 "+object+"마리 입니다";
	}
	

}

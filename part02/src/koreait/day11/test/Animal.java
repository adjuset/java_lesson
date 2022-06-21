package koreait.day11.test;

import koreait.day09a.Cat;
import koreait.day09a.Crow;
import koreait.day09a.Dog;

//추상클래스
public abstract class Animal{
	
	//미리 약속된 상수값으로 type을 정하는 예시
	static final int CAT = 1;
	static final int DOG = 2;
	static final int CROW = 3;
	static final int FROG = 4;
	static final int SNAKE = 5;
	
	
	private String name;
	private String color;
	protected int type;
	
	
	public static boolean isDog(Object object) {
		return object instanceof Dog;
	}
	
	public boolean isCat(Object object) {
		return object instanceof Cat;
	}
	
	public static boolean isCrow(Object object) {
		return object instanceof Crow;
	}
	
	public Animal() {
		System.out.println("새로운 Animal 가족이 생겼습니다.");
	}
	
	//추상메소드로 변경
	public abstract void act();
	
	//추상메소드로 변경	
	public abstract String eat(Object object);
	
	// getter, setter
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		this.color = color;
	}
	
	
	
	
	
	
	
	
}

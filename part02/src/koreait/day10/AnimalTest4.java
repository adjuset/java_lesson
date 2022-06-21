package koreait.day10;

import koreait.day09a.Animal;
import koreait.day09a.Crow;
import koreait.day09a.Dog;

public class AnimalTest4 {

	//Animal클래스 isDog,isCrow 테스트 : 메소드 인자 Object (다형성 구현)
	public static void main(String[] args) {
		
		Animal animal = new Dog();		//업캐스팅 : 부모 메소드만 사용가능 -> 자식 메소드 사용X
		Animal anima2 = new Crow();
		
		Dog puddle = new Dog();
		Crow crow = new Crow();
		
		//메소드 인자로 Object 타입 객체를 받는 메소드   -> 메소드에 static 붙으면 클래스이름으로 선언
		System.out.println(Animal.isDog(puddle));		//false  
		System.out.println(Animal.isCrow(puddle));		//false
		System.out.println(Animal.isDog("동물"));			//false
		System.out.println(Animal.isDog(1));			//false
		System.out.println(Animal.isCrow(animal));		//false
		System.out.println(Animal.isCrow(crow));		//true
		System.out.println(Animal.isCrow(anima2));		//true
		System.out.println(Animal.isCrow("까마귀"));		//false
		
	
	}
	
}

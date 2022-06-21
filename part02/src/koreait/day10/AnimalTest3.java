package koreait.day10;

import koreait.day09a.Animal;
import koreait.day09a.Cat;
import koreait.day09a.Crow;
import koreait.day09a.Dog;
import koreait.day09a.Frog;

public class AnimalTest3 {
	//다형성 구현 예시3
	public static void main(String[] args) {
		
		 //부모타입 클래스 배열  : 배열에는 Animal 타입 인스턴스 객체의 참조값이 저장
		 Animal[] animal = new Animal[10];
		 
		 animal[0] = new Frog();
		 animal[1] = new Cat();
		 animal[5] = new Dog();
		 animal[7] = new Frog();
		 animal[8] = new Crow();
		 
		//타입이 Animal이여서 객체 메소드는 못씀
		 for(Animal temp : animal) {		//배열에서 순차적으로 하나씩 꺼내오기 
			 System.out.println("::::");
			 if(temp!= null) {				//빈 값이 나오면 오류나옴  > temp!=null (null이 아닐떄만 실행)
				Cat cat; Dog dog; Frog frog; Crow crow;

				if(temp instanceof Cat) {		
					cat = (Cat)temp;
					cat.sound();
				}
				if(temp instanceof Dog) {
					dog = (Dog)temp;
					dog.run();
				}
				if(temp instanceof Frog) {
					frog = (Frog)temp;
					frog.fly();
				}
				if(temp instanceof Crow) {
					crow =(Crow)temp; 
					crow.fly();
				}
				temp.act();			//재정의된 메소드 있으면 
				temp.print();
			 }	//if end
			 else {
				 System.out.println("null 참조입니다.");
			 } 
			 System.out.println("::::");
		 }	 
		 
	}
}

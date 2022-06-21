package koreait.day09a;

public class AnimalTest {

	public static void main(String[] args) {

		Animal animal = new Animal();
		animal.act();
		animal.print();
		System.out.println("---------------------------");
		
		Dog dog = new Dog();
		dog.run();
		dog.print();			//상속 메소드
		System.out.println("---------------------------");

		Crow crow = new Crow();
		crow.fly();
		crow.print();
		
		//★☆중요
		System.out.println(":::::::::::::::::::::::::::");
		Animal temp = dog;			//자식객체는 부모클래스 타입으로 참조할 수 있음
		temp.print();
//		temp.run();					오류 : 단 부모타입 변수로는 자식 메소드 실행 못함
		temp =crow;					//자식객체는 부모클래스 타입으로 참조할 수 있음		
		temp.print();				
		
		System.out.println("---------------------------");
		Animal puppy = new Dog();	//자식객체는 부모클래스 타입으로 참조할 수 있음
		puppy.print();
//		puppy.run();				오류 : 부모타입 변수로는 자식 메소드 실행 못함
		
		Dog puddle = (Dog)puppy;	//Animal 타입을 Dog 타입으로 강제 casting
		puddle.run();				//	ㄴ puppy 변수가 참조하는 객체가  Dog타입일때만 가능				
		puddle.print();
				
	}
}

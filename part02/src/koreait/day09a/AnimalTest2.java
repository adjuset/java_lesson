package koreait.day09a;

public class AnimalTest2 {
	public static void main(String[] args) {
		Animal anil1 = new Frog();			//업케스팅 : 자동변환 <-> 다운캐스팅 : 강제변환
		Animal anil2 = new Cat();
		
		Dog puppy = new Dog();
		Crow crow = new Crow();
		//자식객체가 생성될 떄 먼저 부모클래스 객체를 생성하면서 부모클래스 생성자 실행
		
		System.out.println("::::::");
//		animal(anil1);
//		animal(anil2);
//		animal(puddle);
//		animal(crow);
		animal(new Frog());		//새로운 객체 생성
		
		}
	
	//다형성
	//구현 예시 1 : 메소드 인자(또는 리턴) 타입이 Animal : Animal, Dog, Corw, Frog ,Cat (자식) 객체 모두 가능
	public static void animal(Animal animal) {
		//구현 예시 2 :메소드 재정의
		animal.act();
		
		animal.print();
		//인자로 전달받은 animal 객체가 참조하는 것의 진짜 타입(인스턴스 타입) 검사 : instanceof
		System.out.println("dog ? "+(animal instanceof Dog));
		System.out.println("Corw ? "+(animal instanceof Crow));
		System.out.println("Cat ? "+(animal instanceof Cat));
		System.out.println("Frog ? "+(animal instanceof Frog));
		
		
/*	- Animal 부모타입 참조는 자식클래스 필드와 메소드 접근 못함
 * 		animal.jump();		Frog
		animal.run();		Dog
		animal.fly();		Crow
		animal.sound();		Cat
 * 
 */
		//다운캐스팅 : 부모객체에서 > 다시 자식객체로
		Cat cat; Dog dog; Frog frog; Crow crow;

		if(animal instanceof Cat) {		
			cat = (Cat)animal;
			cat.sound();
		}
		if(animal instanceof Dog) {
			dog = (Dog)animal;
			dog.run();
		}
		if(animal instanceof Frog) {
			frog = (Frog)animal;
			frog.fly();
		}
		if(animal instanceof Crow) {
			crow =(Crow)animal; 
			crow.fly();
		}


			
		
	
	}
}


class Frog extends Animal {	//개구리
	
	protected String mouth;	
	//디폴트 한정자  + 다른 패키지 자식클래스
	
	public Frog() {
		System.out.println("새로운 동물가족은 Frog");
	}
	
	public void fly() {
		setName("개구리");
		setColor("초록얼룩이");
		System.out.println("특징 : 점핑");
	}
	
	//다형성 구현 : 메소드 오버라이드    			*비교 : 오버로딩 
	//			ㄴ 부모 클래스의 메소드를 재정의. 이때 인자와 리턴타입은 동일하게 함
	@Override				//annotation 에너테이션 : 코딩(또는 실행)할 떄 참고가 되는 주석
	public void act() {	
		super.act();		//부모클래스의 act() 실행
		System.out.println("Animal 행동 : 수시로 점핑하기");
	}
}


class Cat extends Animal {
	
	protected String eyes;
	
	public Cat() {
		System.out.println("새로운 동물가족은 cat 입니다");
	}
	
	public void sound() {
		setName("고양이");
		setColor("white");
		System.out.println("특징 : 냥냐옹");
	}
	
	@Override
	public void act() {
		super.act();
		System.out.println("Animal 행동 : 수시로 야옹야옹 울기");
	}
	
}



package koreait.day11.test;

import koreait.day09a.Crow;
import koreait.day09a.Dog;

public class AnimalTest {
	
	public static void main(String[] args) {
		
		Animal[] animals = new Animal[10];
		
		animals[0] = new Dog();
		animals[3] = new Crow();
		animals[3].setName("개굴");
		animals[4] = new Crow();
		animals[4].setName("개굴2");
		animals[6] = new Dog();
		
		for(Animal a : animals) {
			if(a != null) {
				a.act();
			}
		}
		
		//개구리가 몇 마리인지...
		System.out.println("개구리 먹이주기-------------------");
		int i=0;
		long start = System.nanoTime();	//현재 시간을 ms로 실행
		for(Animal a : animals) {
			if(a != null && a instanceof Crow) {
				i++;
				System.out.println(a.eat(100*(i+2)));
			}
		}
		long end =System.nanoTime();
		System.out.println("개구리 먹이주는 데 걸린 시간 : "+(end-start) +"ms");
		
		System.out.println("개구리는 "+i+"마리 살고 있습니다");
		
		
		//강아지가 몇 마리인지 ...type 필드 이용해서 함
		System.out.println("강아지 먹이주기--------------------");
		i = 0;
		start = System.nanoTime();
		for(Animal temp : animals) {
			if(temp!=null && temp.type == Animal.DOG) {
				i++;
				System.out.println(temp.eat("맛있는 먹이주기"));
			}
			
		}
		end = System.nanoTime();
		System.out.println("강아지 "+i+"마리 살고 있습니다.");
		System.out.println("강아지 먹이주는데 걸린 시간 : "+(end-start)+"ms");
		
		
		
		
	}
}

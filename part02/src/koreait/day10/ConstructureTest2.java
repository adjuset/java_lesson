package koreait.day10;

public class ConstructureTest2 {

	public static void main(String[] args) {
		
	}

}

class Product2{
	int price;
	
	//부모클래스 디폴트 생성자를 정의해서 자식클래스가 사용할 수 없음
	public Product2() {}
	
	public Product2(int price) {
		this.price = price;
	}
}


class Food extends Product{	//Product() 디폴트 생성자 실행하므로 없으면 오류 -> food() 디폴트 생성자 실행
	
}

class Electronics extends Product{	//Product() 디폴트 생성자 실행 

}
package koreait.day13;

public class C53_InterfaceTest {

	public static void main(String[] args) {
		MyClassX x1 = new MyClassX();
		MyClassY y1 = new MyClassY();
		MyClassZ z1 = new MyClassZ();
		
		InterfaceA x2 = new MyClassX();
		InterfaceB y2 = new MyClassY();
		InterfaceA z2 = new MyClassZ();
		InterfaceB z3 = new MyClassZ();

// 참조 타입에 따른 메소드 실행		: z1,z2,z3 이 어떤 메소드 실행가능한지?
		z1.methodA();
		z1.methodB(22);
		z1.name("쯔위");
		
		z2.methodA();
		z2.methodB(22);
//		z2.name("쯔위");		오류 : InterfaceB의 추상메소드로 실행 못함
		
//		z3.methodA();		오류 : InterfaceA의 추상메소드로 실행 못함
//		z3.methodB(22);
		z3.name("쯔위");
		
		
//	캐스팅 : 다중 구현체의 인터페이스 타입 캐스팅
//		ㄴ MyClassZ는 InterfaceA와 InterfaceB 타입으로 모두 참조할 수 있는 구현체
		InterfaceB ib = (InterfaceB)z2;
		ib.name("쯔위");
		InterfaceA ia =  (InterfaceA)z3;
		
		
//	다형성 구현 예
		
		//MyClassZ는 A,B 다 상속
		//MyClassY는 B 상속
		
		
		iMethod(x2);
//		iMethod(y2);     오류 : InterfacaA 구현체 아님
		iMethod(z2);
		iMethod(x1);
		iMethod(z1);
		
		//Y,Z 다됨
		iBMethod(y1);
		iBMethod(y2);
		iBMethod(z1);
//		iBMethod(z2);		변수 참조타입이 InterfaceA 이면 오류
		iBMethod(y1);
		
		
		
	}
	
	//다형성 구현예 : 메소드 인자 타입인 InterfaceA
	//		Interface 구현체는 모두 인자로 전달가능
	public static void iMethod(InterfaceA ia) {
		ia.methodA();
	}
	
	public static void iBMethod(InterfaceB ib) {
		System.out.println(ib.name("momo"));
		
	}

}

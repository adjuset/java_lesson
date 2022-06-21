package koreait.day11;

public class AShapeTest {
//main 메소드는 클래스로 만들어진 애클리케이션입니다.  추상클래스로 완성된 애플리케이션에서 새로운 추상메소드를 추가하면 ?
//				
	public static void main(String[] args) {
		Triangle t = new Triangle(12, 32);
		Circle c = new Circle();
		Rectangle r = new Rectangle();
		
		
		System.out.println(t.getArea());
		
		c.setRadius(20);
		System.out.println(c.getArea());
		
		r.height = 45;
		r.whidth =31;
		System.out.println(r.getArea());
		
	}
}


abstract class Ashape{			//도형
	protected String shapeName;
	protected int whidth;
	protected int height;
	
	public Ashape() {
		System.out.println("Ashape 디폴트 생성자가 동작합니다");
	}
	
	//추상클래스는 커스텀생성자 만드나요?
	public Ashape(int whidth, int height) {
		System.out.println("Ashpe 커스텀 생성자가 동작합니다");
		this.whidth =whidth;
		this.height = height;
	}
	
	
	public abstract double getArea();	//추상메소드 : 도형의 넓이 구하기
	
	//추상클래스도 인스턴스 메소드 정의해서 자식 클래스가 재정의 할 수 있음
	public Object explain() {		//애플리케이션 완료 후 추상메소드 추가 오류 발생하므로 인스턴스 메소드 추가
		return null;
	}

	@Override
	public String toString() {
		return "Ashape1 [도형종류=" + shapeName + ", whidth=" + whidth + ", height=" + height + ", getArea()="
				+ getArea() + ", getClass()=" + getClass() + ", hashCode()=" + hashCode() + ", toString()="
				+ super.toString() + "]";
	}
	
	
}

class Triangle extends Ashape{	//width * height /2
	
	public Triangle(int whidth, int height) {
		super(whidth, height);
	}
	
	@Override
	public double getArea() {
		return whidth * height / 2;
	}
}

class Circle extends Ashape{	
	private int radius;	//반지름		

	@Override
	public double getArea() {	//반지름 * 반지름 *3.14
		return radius * radius * 3.14;
	}

	public int getRadius() {
		return radius;
	}

	public void setRadius(int radius) {
		this.radius = radius;
	}

	@Override
	public String toString() {
		return "Circle [radius=" + radius + ", shapeName=" + shapeName + ", whidth=" + whidth + ", height=" + height
				+ "]";
	}
	
	
	
}


class Rectangle extends Ashape{	//width * height
	@Override
	public double getArea() {
		return whidth *height;
	}		
}

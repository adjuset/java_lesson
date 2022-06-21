package 시험;

//작성자 : 이소원
public class Bike extends Product {

	private int speed;
	
	public Bike() {};
	
	public Bike(int price, String prdName, int speed) {
		this.price = price;
		this.prdName = prdName;
		this.speed = speed;
	}
	@Override
	public String sell(Object object) {
		return String.format("추가 할인 행사 - %d%%인하", object);
	}
	
	//필드값 이용하기 > 인스턴스로 만들어야 됨 > static임(int speed는)
	public String ride() {
		return "당신은 이것을 시속 "+this.speed+"km로 탈 수 있습니다.";
	}
	
	public int getSpeed() {
		return speed;
	}
	public void setSpeed(int speed) {
		this.speed = speed;
	}

	@Override
	public String toString() {
		return "Bike [speed=" + speed + ", price=" + price + ", prdName=" + prdName + "]";
	}
	
	

}

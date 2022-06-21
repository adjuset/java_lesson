package 시험;


public class ProductTest {
	public static void main(String[] args) {
		//작성자 : 이소원
		
		//13번
		Product[] cart = new Product[10];
		
		cart[0] = new Bike(123000,"MTB",25);
		cart[1] = new Electronics(35000,"USB");
		cart[3] = new Bike(99000,"삼천리",15);
		cart[5] = new Electronics(117000, "ipad");
		cart[7] = new Electronics(2250000,"lg 냉장고");
				
		//14번
		Electronics ele = (Electronics)cart[7];
		ele.setKwh(0.9);
		System.out.println(ele.power());
		
		//15번
		for(int i =0 ; i <cart.length ;i++) {
			
			if(cart[i]!=null && cart[i].price >= 100000) {
				System.out.println(cart[i].toString());
			}
		}
		System.out.println();
		
		//16번
		for(int i=0 ; i < cart.length ;i++) {
			Bike bike;
			if(cart[i] != null && cart[i] instanceof Bike) {
				bike = (Bike)cart[i];
				System.out.println(bike.ride());
			}
		}
		
	}
}

class Electronics extends Product{

	private double kwh;
	
	Electronics(){};
	
	Electronics(int price, String prdName){
		this.price = price;
		this.prdName = prdName;
	}
	
	//필드값 화룡
	public double power() {
		return this.kwh *24 ;
	}
	
	@Override
	public String sell(Object object) {
		return String.format("묶음 상품 - %s(1set)", object);
	}
	

	@Override
	public String toString() {
		return "Electronics [kwh=" + kwh + ", price=" + price + ", prdName=" + prdName + "]";
	}

	public double getKwh() {
		return kwh;
	}

	public void setKwh(double kwh) {
		this.kwh = kwh;
	}
	
	
	
}

package koreait.day09a;

public class C45_Test {

	public static void main(String[] args) {
		ClassAA test1 = new ClassAA();
		test1.ab =123;			//상속받은 필드
		test1.name ="hong";		

		test1.print();
		
		//ClassAA에서 적용된 메서드
		test1.test();
	}


}

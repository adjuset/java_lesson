package koreait.ext;

public class BinaryTest {

	public static void main(String[] args) {

		System.out.println(String.format("%8s\t %8s\t %8s", "10진수","2진수","16진수"));
		for(int i=0 ; i<100; i++) {
			System.out.printf(String.format("%8d\t %8s\t %8s", i,Integer.toBinaryString(i),
								Integer.toHexString(i)));
			System.out.println();
		}
		
		
		
		/*10진수 정수값을 다른 진수로 문자열 변환
		 * 
		 * Integer.toBinaryString(i) -> 2진수로 변환
		 * Integer.toOctalString(i)	-> 8진수로 변환
		 * Integer.toHexString(i)	-> 16진수로 변환
		 * 
		 * int형식은 4바이트 32비트  -> 2진수는 32자리, 16진수로는 8자리, 10진수로는 값범위 -21...~214784
		 * 						 16진수로는  00000000~ffffffff
		 */
	}

}

package koreait.ext;

public class BinaryOp {
	public static void main(String[] args) {

		//2진수의 비트 연산 : &, | , ^, ~ , >> , << 등등 간단히 테스트
		int data = 0b0101110100100110;
		
		System.out.println("1. ~ (비트 반전) 연산 결과");		//참고 : !연산은 true와 false 를 반대로(boolean연산)
		System.out.println(String.format("%32s", Integer.toBinaryString(data)));
		System.out.println(String.format("%32s", Integer.toBinaryString(~data)));
		
		System.out.println("2. >> 오른쪽 쉬프트 연산(오른쪽 정수값은 쉬프트 동작 횟수)");
		System.out.println(String.format("%32s %d", Integer.toBinaryString(data), data));
		System.out.println(String.format("%32s %d", Integer.toBinaryString(data>>1), data>>1));
		System.out.println(String.format("%32s %d", Integer.toBinaryString(data>>2), data>>2));
		// >> 1 은 나누기 2한 결과값.
		
		System.out.println("3. << 왼쪽 쉬프트 연산(왼쪽 정수값은 쉬프트 동작 횟수)");
		System.out.println(String.format("%32s %d", Integer.toBinaryString(data), data));
		System.out.println(String.format("%32s %d", Integer.toBinaryString(data<<1), data<<1));
		System.out.println(String.format("%32s %d", Integer.toBinaryString(data<<2), data<<2));
		// << 1 은 곱하기 2한 결과값
		
		data = -2345;
		System.out.println("4. 음수값 >> 오른쪽 쉬프트 연산(왼쪽에 추가되는 비트는 무엇?)");
		System.out.println(String.format("%32s %d", Integer.toBinaryString(data), data));
		System.out.println(String.format("%32s %d", Integer.toBinaryString(data>>1), data>>1));
		System.out.println(String.format("%32s %d", Integer.toBinaryString(data>>2), data>>2));
		//정수 32비트의 맨왼쪽 비트는 부호를 표시합니다.  오른쪽 쉬프트연산에서 왼쪽에 추가되는 비트는 부호비트과 같습니다.
		//	참고 : 오른쪽 쉬프트 할때 부호와 상관없이 왼쪽에 추가되는 비트를 0으로 해야될떄에는 >>> 연산으로 함
		
		
		System.out.println("5. >>> 오른쪽 쉬프트 연산");
		System.out.println(String.format("%32s %d", Integer.toBinaryString(data), data));
		System.out.println(String.format("%32s %d", Integer.toBinaryString(data>>>2), data>>>2));
		//음수일 떈 1로 채워주고 양수일 떈 0으로 채워줌 (0은 눈에 안보임)
		
//		11111111111111111111011011010111 -2345
//		  111111111111111111110110110101 1073741237  	결과 :앞에 영이 2개 나옴 
		
		
		int n =0xffffffff;		//32비트가 모두 1
		data = 100;
		//참고 논리연산 and 는 참 and 참일떄만 결과가 참, 논리연산 or은 거짓 or 거짓 일떄만 결과가 거짓
		//	비트연산 and는  1&1 일떄만 결과가 1, 비트연산 or는  1or1 일떄만 결과가 0
		System.out.println("6. &는 bit and 연산");
		System.out.println(String.format("%32s %d", Integer.toBinaryString(data), data));
		System.out.println(String.format("%32s %d", Integer.toBinaryString(n), n));
		System.out.println("----------------------------------------------------");
		System.out.println(String.format("%32s %d", Integer.toBinaryString(data&n), data&n));
		
		System.out.println("7. |는 bit or 연산");
		System.out.println(String.format("%32s %d", Integer.toBinaryString(data), data));
		System.out.println(String.format("%32s %d", Integer.toBinaryString(n), n));
		System.out.println("----------------------------------------------------");
		System.out.println(String.format("%32s %d", Integer.toBinaryString(data|n), data|n));


	
		
		
		
		
		
	}

}

package koreait.day03;

import java.util.Scanner;

public class C16_SwichTest {

	public static void main(String[] args) {
		//switch 문은 if ~ else if를 대신하는 명령문입니다.
		Scanner sc = new Scanner(System.in);
		int money = 0;
		int pay = 0;
		
		System.out.println("상품목록 : 1.2200원  2.1900원  3.3600원  4. 2870원");
		System.out.print("상품(번호)을 선택해서 장바구니에 넣은세요 . >>> ");
		int item_no = sc.nextInt();
		
		
		if(item_no == 1) pay =2200;
		else if(item_no ==2) pay = 1900;
		else if(item_no ==3) pay = 3600;
		else if(item_no ==4) pay = 2870;
		else {
			System.out.println("상품 선택을 잘못하셨습니다.");
			pay = 999999;
		}
		
		System.out.println("결제금액은 "+pay+"원 입니다.");
		
//		switch(item_no) {		//if문에서 조건식 작성 했을 때와 같이 비교할 변수
//		case 1:					//검사할 값
//			pay=2200;
//			break;				//아래의 명령문들을 실행하지 않고 switch문을 끝내기
//		case 2:
//			pay=1900;
//			break;
//		case 3:
//			pay=3600;
//			break;
//		case 4:
//			pay=2870;
//			break;
//		default:				//case 문에 해당되지 않은 값에 대해 실행
//			System.out.println("상품 선택이 잘못되었습니다");
//			pay =99999;
//			break;
//		}
		
//		System.out.println("결제금액은 "+pay+"입니다.");

		
		
	}

}

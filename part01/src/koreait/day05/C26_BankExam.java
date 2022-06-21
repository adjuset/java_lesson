package koreait.day05;

import java.util.Scanner;

/*	GUI : Graphic User Interface (사용자 명령을 아이콘, 메뉴방식으로 처리)
 * 	CLI : Commend Line Interface (사용자 명령을 텍스트로만 처리 )
 */


public class C26_BankExam {
	
	//CLI 방식의 메뉴 선택을 while문으로 연습
	public static void main(String[] args) {
		
	// 연습문제 : 가상은행의 예금 / 출금 / 잔고 조회 실행
	Scanner sc = new Scanner(System.in);
	boolean run = true;
	int balance = 0;		//잔고(잔액)
	
	while(run) {			//초기값은 참     : false 값으로 하면 끝남 > 종료 누르면 false 나오게 변경해줌
		int money;			//while문 지역변수, 입금액과 출금액 저장
		System.out.println("-------------------------------------");
		System.out.println("1. 예금  | 2. 출금 | 3. 잔고 확인 | 4. 종료 |");
		System.out.println("--------------------------------------");
		System.out.print("메뉴 선택 >> ");
		int sel = sc.nextInt();
		
		
		switch(sel) {
		case 1:		//입금처리
			System.out.print("예금액 > ");
			money= sc.nextInt();
			balance +=money;
			System.out.println("고객님의 잔액은 "+balance+"입니다.");
			break;
			
		case 2:		//출금처리
			System.out.print("출금액 > ");
			money = sc.nextInt();
			if(money>balance) {
				System.out.println("잔액이 부족해서 출금할 수 없습니다");
			}else {
				balance-=money;
				System.out.println(money+"원 출금 완료");
			}
			break;
			
		case 3:		//잔고(balance 출력)
			System.out.println("현재 잔고 :"+balance);
			System.out.println();
			break;
			
		case 4:		//반복종료
			System.out.println("프로그램을 종료합니다");
			run = false;
			break;
			
		default:
			System.out.println("잘못된 값입니다. 1 ~ 4에서 선텍하세요");
			break;
			}	
		}
	System.out.println("****END****");
	}

}

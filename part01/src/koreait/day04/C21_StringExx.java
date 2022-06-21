package koreait.day04;

import java.util.Scanner;

public class C21_StringExx {

	public static void main(String[] args) {
		/*  구글 이메일 계정을 체크하는 기능 구현 
		 *  1. @ 기호가 1개 포함되어야 합니다. : 맨 끝에 골뱅이	 
		 *  2. 1번이 참일 때 @ 뒤에 gmail.com 이어야 합니다. (메시지 : 도메인 이름이 틀립니다.)	
		 *  3. 2번이 참일 떄 @ 앞까지의 문자열(계정이름)만 추출합니다.
		 *  4. 3번의 계정이름은 6글자 이상이어야 합니다.
		 *  5. 3번의 계정이름에는 특수기호 $,%가 포함되면 안됩니다. 
		 */
		//subString은 0~ 언급한 곳 -1까지 출력해줌
				
		Scanner sc = new Scanner(System.in);
		String Email;
		
		System.out.println("이메일 주소를 입력 : ");
		Email = sc.nextLine();

		int gol = Email.indexOf('@');
		
		if(gol != -1 && gol == Email.lastIndexOf('@')) {
			String domein = Email.substring(gol+1, Email.length());
			String name = Email.substring(0, gol);		
			System.out.println(name);
			System.out.println(domein);
			if(domein.equals("gmail.com")) {
				
				if(name.length() >= 6) {
					
					int no = Email.indexOf('$');
					int no2 = Email.indexOf('%');
						
					if(no == -1 && no2 ==-1) {
						System.out.println("알맞게 입력하셨습니다");
						System.out.println("아이디 완성 ! : "+Email);
					}else {
						System.out.println("잘못입력하셨습니다");
					}
				}else {
					System.out.println("잘못된 형식입니다");
				}	
			}
			else {
				System.out.println("잘못된 형식입니다.");
			}
		}
		else {
			System.out.println("잘못된 형식입니다");
		}
		
		
		
		
		
		
		
		
		
		
		
		
	}

}

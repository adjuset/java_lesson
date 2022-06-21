package koreait.day04;

import java.util.Scanner;

public class C21_StringEx {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		String email;
		boolean isValid = true;
		
		System.out.println("사용할 이메일 입력하세요 >>> ");
		email = sc.nextLine();					//키보드 입력을 문자열로 처리
		
		//입력한 email이 처리조건 1,2,3,4,5에 해당하지 않으면 메시지 출력하고 isValid 변수를 false로 함
		int g = email.indexOf('@');
		int c = email.indexOf('$');
		int cc = email.indexOf('%');
		
		//1번 : @기호가 포함되어야 한다 (문자마지막에)
		if((g != -1) && g == email.lastIndexOf('@')) {
			
			String account = email.substring(0, g);
			String domein = email.substring(g+1, email.length());
			System.out.println(account);
			System.out.println(domein);
			
			if(domein.equals("gmail.com")) {
				
				if(account.length()>=6) {
					
					if(c == -1 && cc ==-1) {
						System.out.println("형식에 맞게 입력하셨습니다 > "+email);
					}
					else {
						System.out.println("맞는 형식이 아닙니다");
						isValid = false;
					}
					
				}else {
					System.out.println("맞는 형식이 아닙니다");
					isValid = false;
				}
			}
			else {
				System.out.println("맞는 형식이 아닙니다");
				isValid = false;
			}
		}else {
			System.out.println("맞는 형식이 아닙니다");
			isValid = false;
		}
	}

}

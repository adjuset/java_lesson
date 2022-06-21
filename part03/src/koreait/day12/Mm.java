package koreait.day12;

import java.util.HashMap;
import java.util.Scanner;

public class Mm {

	public static void main(String[] args) {

		System.out.println("오늘의 저녁 메뉴 입니다");
		System.out.println("치백, 떡볶이, 곱창, 햄버거");
		
		
		HashMap<String,Integer> map = new HashMap<>();
		map.put("치맥", 0);
		map.put("떡볶이", 0);
		map.put("곱창", 0);
		map.put("햄버거", 0);
		
		Scanner sc = new Scanner(System.in);
		while(true) {
			
			System.out.print("선택 메뉴 입력하세요. (종료는 end 입력) ->");
			String menu = sc.nextLine();
			
			if(menu.equals("end")) break;
			
			if(map.containsKey(menu) == false) {
				System.out.println("없는 매뉴 입니다. 메뉴를 추가합니다 ~~");
				continue;
			}
			
			int temp = map.get(menu);
			map.put(menu, ++temp);
		}
		System.out.println("투표 종료합니다");
		System.out.println(map);
		
		
		
		
		
		
		
	}

}

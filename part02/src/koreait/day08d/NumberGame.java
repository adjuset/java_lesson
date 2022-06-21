package koreait.day08d;

import java.util.*;

public class NumberGame {

	public static void main(String[] args) {

		Random r = new Random();
		Scanner sc = new Scanner(System.in);
		int max = 10;						//시도횟수
		int[] trialist = new int[max];		//사람이 골른 수 중 틀린 수 넣을 배열
		
		System.out.println("숫자 맞추기 게임 시작합니다. 나 컴퓨터는 숫자를 결정했습니다");
		System.out.println("너, 휴먼은 맞춰보세요 (101 ~ 299)");
		int numComputer = r.nextInt(199)+100;			//(299-100)+100 : 컴퓨터가 고른 값
		int numHuman;						//사람이 고를 값		
		int i = 0;							//틀린횟수만큼 차감할 변수
		
		do {
			System.out.print("생각한 숫자 입력 (기회 : "+(10-i)+") ->");
			numHuman = sc.nextInt();
			
			if(numComputer > numHuman) {	//내가 선택한 숫자보다 컴퓨터가 선택한 숫자가 더 클떄
				trialist[i] = numHuman;
				i++;				 		//틀렸으니 1번 추가
				System.out.println("아닙니다 더 큰 값입니다");
			}else if(numComputer < numHuman) {	//내가 선택한 수가 컴퓨터가 선택한 수 보다 클떄
				trialist[i] = numHuman;
				i++;							//틀렸으니 i를 1증가 시켜줌
				System.out.println("아닙니다. 더 작은 값입니다.");
			}
			
			if(i == max)		break;		//기회가 10번이였으므로 10번이 되면 중단
			
			
		}while(numComputer != numHuman );	//numHuman과 Computer가 같을떄까지 반복
	
		System.out.println();
		
		if(i == max) {
			System.out.println("너가 입력한 내용 :"+Arrays.toString(trialist));
			System.out.println("주어진 기회를 다 쓰셨습니다. 게임을 다시 시작하세요 ! 답은  "+numComputer+"입니다");
		}else if(i<10) {
			System.out.println("딩동댕 ! 맞추셨습니다. 성공까지 시도 횟수 :"+(i+1)+"번");
		}
		
		sc.close();
	}

}

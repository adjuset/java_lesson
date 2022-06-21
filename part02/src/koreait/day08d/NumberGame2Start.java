package koreait.day08d;

import java.util.*;

public class NumberGame2Start {
	public static void main(String[] args) {

		Random r = new Random();
		Scanner sc = new Scanner(System.in);
		int max = 10;						//시도회수
		int[] trialist = new int[max];		//사람이 골른 수 중 틀린 수 넣을 배열
		GameValue[] history = new GameValue[10];
		int k=0;		//history배열의 인덱스 변수
		
		
		System.out.println("숫자 맞추기 게임 시작합니다");
		System.out.print("게임을 시작하려면 너 휴면의 이름을 쓰시오 >>> ");
		String gamer = sc.nextLine();
		int rmin =11; 
		int rmax = 29;
		
		
		do {
			
			ㅇeValue temp = new GameValue(gamer);
			System.out.println("이제 게임 시작합니다. 나 컴퓨터는 숫자를 결정했습니다");
			System.out.println(String.format("너, 휴먼은 맞춰보세요 (%d ~ %d)", rmin,rmax));
			int numComputer = GameValue.makeNumber(rmin, rmax);
		
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
				temp.setCount(max);
				
			}else if(i<10) {
				System.out.println("딩동댕 ! 맞추셨습니다. 성공까지 시도 횟수 :"+(i+1)+"번");
				temp.setCount(i+1);
				temp.setSuccess(true);
				
			}
			//위의 게임결과를 history배열에 저장
			history[k] = temp;	//temp는 GameValue 객체의 참조값 (주소)
			k++;				//다음 인덱스 값, 카운트 역할(게임한 횟수)
			
			System.out.println("개임을 계속하시겠습니까? 계속하려면 0 입력 >>> ");
			
		} while(sc.nextInt() ==0);
		
		
		System.out.println("::::게임 스코어::::");
		//for 반복으로 history 배열에 저장된 값 출력하기
		for(int j=0 ; j<k;j++) {
			history[j].print();
		}
		System.out.println("::::: The End :::::");
		
		sc.close();	
	}
}

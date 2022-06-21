package koreait.day07;

public class C38_SingerTest {

	public static void main(String[] args) {
		
		Singer twice = new Singer();
		
		twice.name_eng = "Twice";
		twice.name_kor = "트와이스";
		twice.debutYear = 2015;
		twice.genre = "kpop-GirlGroup";
		
		twice.member = new String[9];
		twice.member[0] = "모모";
		twice.member[1] = "나연";
		twice.member[2] = "쯔위";
		
		twice.printMember();
		System.out.println("활동기간 : "+twice.actYears(2022)+"년");
		
		
		Singer beo = new Singer();
		beo.name_eng = "BE'O";
		beo.name_kor="비오";
		beo.genre="힙합";
		beo.printMember();
		
		System.out.println(Singer.job +"  "+ Singer.label);
		System.out.println(twice.toString());
		System.out.println(beo.toString());
		
		//객체 참조 타입일 떄 toString()을 생략한 상태
		System.out.println(twice);			
		System.out.println(beo);
		
		
	}

}

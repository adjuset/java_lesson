package koreait.day07;

public class Singer  {
	//	클래스 정의 하는 것은 현실세계의 데이터를 처리하기 위한 형식을 지정
 
	
	//Singer 객체가 만들어질 떄마다 다른 값 : 인스턴스 필드
	String genre;		//장르
	String name_eng;
	String name_kor;
	int debutYear;
	String[] member;	//그룹일 경우 멤버이름 저장
		
	static final String job = "옌예인";	//변경이 안되는 상수
	static String label = "(ﾉ◕ヮ◕)ﾉ*:･ﾟ✧";				//Singer에게는 모두 동일한 라벨 표시. 변경가능한 변수
	
	
	void printMember() {
		if(member == null)
			System.out.println("그룹이 아닌 솔로 가수 입니다");
		else {
			for(int i=0 ; i<member.length;i++) {
				if(member[i] != null) 					//member값이 비어있지 않을 떄만
					System.out.println((i+1)+" : "+member[i]);
				}
			}
	}
	
	
	int actYears(int year) {	//year 기준 활동기간 계산
		return year-debutYear;
	}

	
	//Source -> toString
	@Override	
	public String toString() {
		return "C37_Singer [genre=" + genre + ", name_eng=" + name_eng + ", name_kor=" + name_kor + ", debutYear="
				+ debutYear + "]";
	}
	
	

	
	
	
}

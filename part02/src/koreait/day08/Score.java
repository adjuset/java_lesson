package koreait.day08;


public class Score {
	private int korean;
	private int english;
	private int science;
	private String grade;
	
	//기본생성자 숨어있음. :  접근한정자는 ? public
	public Score() {}
	
	void setKorean(int korean) {
		this.korean = korean;
		//메소드 인자로 전달받은 값을 클래스 전역변수 korean에 저장
		//this는 setKorean 메소드 실행객체
	}
	
	public int getScience() {
		return science;
	}
	
	int getKorean() {
		return korean;
	}
	
	void setEnglish(int english) {
		this.english = english;
	}
	
	int getEnglish() {
		return english;
	}

	String getGrade() {
		return grade;
	}

	void setGrade(String grade) {
		this.grade = grade;
	}

	
	
}

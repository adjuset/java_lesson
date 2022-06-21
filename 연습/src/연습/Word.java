package 연습;

public class Word {
	private String English;
	private String Korean;
	private int level;
	
	public static final int A = 1;
	public static final int B = 2;
	public static final int C  = 3;
	
	public Word(String English, String Korean, int level) {
		this.English = English;
		this.Korean = Korean;
		this.level = level;
	}

	@Override
	public String toString() {
		return English + " "+ Korean 
				+ " " + level + 
				(level == Word.A ? "초급": level == Word.B ? "중급" : "고급" );
	}

	public String getEnglish() {
		return English;
	}

	public void setEnglish(String english) {
		English = english;
	}

	public String getKorean() {
		return Korean;
	}

	public void setKorean(String korean) {
		Korean = korean;
	}

	public int getLevel() {
		return level;
	}

	public void setLevel(int level) {
		this.level = level;
	}
	
	
	
}

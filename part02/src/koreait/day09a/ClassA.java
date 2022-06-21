package koreait.day09a;

/*		<클래스의 상속>
 * 	1. 클래스 간의 부모(상위클래스,super) - 자식관계(하위클래스)가 만들어진다
 * 	2. 부모의 클래스 구성요소를 자식이 자용할 수 있음.  상속되는 요소는 필드, 메소드
 * 	3. extends 키워드 사용하여 부모클래스 지정함 
 *  4. private 접근한정자는 상속 안됨	-> protected는 다른패키지의 클래스가 상속받을 수 있도록 함
 *  
 *  5. 현실세계에서 반려동물샵을 운영. -> 데이터 저장을 위해서 클래스 정의  -> 
 *     고양이,강아지,햄스터 -> 하나의 그룹으로 Animal 클래스 정의하고 공통적인 요소를 정의
 *     
 * 	6. 슈퍼클래스는 오직 1개입니다
 */


public class ClassA {		//부모클래스
	int ab;
	String name;
	protected String title;	
	//protected는 디폴트 접근한정자이나 자식클래스만 예외로 허용
	
	void print() {
		System.out.println("ab="+ab);
		System.out.println("name="+name);
	}
	
	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
	}

}

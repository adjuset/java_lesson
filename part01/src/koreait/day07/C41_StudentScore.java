package koreait.day07;

public class C41_StudentScore {

	public static void main(String[] args) {

		Student[] stus = new Student[5]; 		//배열요소 5개 Student 객체(총 5개) 참조
		String[] names = {"이하니", "김모모","박나연","홍길동","박지성"};
		
		stus[0] = new Student(); 	//배열 갯수만큼 객체 만들어 줘야됨
		stus[0].name = names[0];
		stus[0].no =1;
		stus[0].grade =3;
		
		//for문으로 나머지 4개 객체를 생성해서 stus 배열요소에 참조시킴니다
		for(int i=1;i<stus.length;i++) {
			stus[i] = new Student();	//**중요 : 배열 갯수만큼 객체 생성
			stus[i].name = names[i];
			stus[i].no = i+1;
			stus[i].grade = 3;
		}
		
		//확인을 위한 출력
		for(int i=0 ; i<stus.length;i++) {
			System.out.println(stus[i]);
		}

		
		//각 생성된 Student객체가  Score 객체를 필드로 갖도록 함 ->Score 객체 3개의 필드값 입력 실행
//		for(int i=0 ; i<stus.length;i++) {
//			System.out.println(stus[i].name+"점수 확인하세요");
//			Score temp = new Score();		//Score 객체생성
//			temp.input();					
//			stus[i].score = temp;			//****
//			System.out.println(stus[i]);	//확인
//		
//		}
		
		for(int i=0 ; i<stus.length; i++) {
			System.out.println(stus[i].name+" 점수 확인하세요");
			stus[i].score = new Score();
			stus[i].score.input();
			System.out.println(stus[i]);
		}
		
		
		System.out.println("[[성적 통계]]");
		System.out.printf("%8s %10s %8s %8s\n","번호","이름","총점","평균");
		for(int i=0 ; i<stus.length;i++) {
			System.out.printf("%4d %6s %8d %8.1f\n",stus[i].no,stus[i].name, stus[i].score.sum(),stus[i].score.average());
		}
		
		
		
	}
}

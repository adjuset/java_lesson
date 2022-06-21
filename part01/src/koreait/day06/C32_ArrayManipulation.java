package koreait.day06;

public class C32_ArrayManipulation {

	public static void main(String[] args) {

		//배열요소의 삽입 / 삭제
		int[] test = {11,22,33,44,55,66,77};
		
		//인덱스 k에 삽입할 때 - 오른쪽 인덱스 증가 방향으로 이동
		// test.length-2 : 마지막에서 바로 앞
		int k = 2;
		for(int i=test.length-2 ; i>=k ; i--) {
			test[i+1] = test[i];
			//계산한 후		뒤에 있는 것이 전
		}
		
		test[k] = 23;
		for(int i=0 ; i<test.length; i++) {
			System.out.print(test[i]+" ");
		}
		System.out.println();
		
		//데이터 삭제
		int[] test2 = {11,22,33,44,55,66,77};
		
		//인덱스 k를 삭제할 떄 - 왼쪽 인덱스 감소방향으로 이동
		//삭제되면 1자리 없어지니까 length에 -1을  빼줌
		for(int i = k+1; i<test2.length; i++) {	
			test2[i-1] = test2[i];
			//현재                   전에 위치한 값
		}
		
		for(int i=0 ; i<test2.length; i++) {
			System.out.print(test2[i]+" ");
		}
	}

}

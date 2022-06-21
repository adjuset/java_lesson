package koreait.day09;

public class C44_ForEachTest {

	public static void main(String[] args) {
// 배열을 for문에서 접근할 때 인덱스 변수를 사용함.  -> 코딩할 때 효율성을 높이기 위해 향샹된 for(for each) 사용
		
		int[] itest = {1,2,3,4,5,6};
		String[] stest = {"break","pulbic","each","package","while"};
		
		
		// 배열을 for문에서 순차적으로 접근할떼 인덱스 변수를 사용함
		for(int i=0 ; i<itest.length ;i++) {
			System.out.println("i = "+i+",itest[i] = "+itest[i]);
		}	//여기서 itest[i]는 int 타입
		
		for(int i=0 ; i<itest.length ;i++) {
			int temp = itest[i];
			System.out.println("i="+i+", itest[i]="+temp);
		}
		
		
		for(int i=0 ; i<stest.length ;i++) {
			System.out.println("i="+i+", stest[i] = "+stest[i]);
		}	//여기서 stest[i]는 String 타입
	
		
		//코딩할 때 효율성을 높이기 위해 향상된 for 사용 : 단, itest[i]만 사용할 때
		System.out.println("itest 배열값");
		for(int temp : itest) {				
			System.out.println(temp);
		}
		System.out.printf("\n stest 배열값");
		for(String temp : stest) {
			System.out.println(temp);
		}
		
		
	}

}

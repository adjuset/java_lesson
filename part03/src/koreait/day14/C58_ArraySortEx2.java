package koreait.day14;


public class C58_ArraySortEx2 {

	public static void main(String[] args) {

		String[] names = {"제니","다현","나연","신비","은하","모모"};
		String temp1;
		
		//o보다 큰 값이면 왼쪽이 더 큼
		
		for(int i=0 ; i<names.length-1 ;i++) {
			for(int k=i+1; k<names.length ;k++) {
				if((names[i].compareTo(names[k]))>0) {
					temp1 = names[k];
					names[k] = names[i];
					names[i] = temp1;
				}
			}
		}
		
		for(int i=0 ; i<names.length ;i++) {
			System.out.printf("%s",names[i]);
		}
		
	}
}

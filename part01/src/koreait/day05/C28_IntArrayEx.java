package koreait.day05;

import java.util.Scanner;

/*	1. int 배열크기 5를 선언하세오. 이름은 nums
 * 	2. 배열 요소의 값은 사용자 입력으로 저장됩니다.
 * 	3. 입력된 값의 합계, 평균을 구합니다
 *  4. 입력된 값의 최대값, 최소값을 구하는 메소드를 만드세요
 *  	- maxOfArray, minOfArray : 인자는 int 배열
 * 
 */

public class C28_IntArrayEx {
	
	// 작성자 : 이소원
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in); 
		int sum = 0;
		int[] nums = new int[5];
		
		for(int i=0 ; i<nums.length; i++) {
			System.out.print(i+"번째 숫자를 입력하세요 : ");
			nums[i] = sc.nextInt();
			sum+=nums[i];
		}
		double avg = (double)sum / nums.length;		
		
		int ma = maxOfArray(nums);
		int mi = minOfArray(nums);
		
		System.out.println("평균 : "+avg);
		System.out.println("합계 : "+sum);
		System.out.println("최대값 : "+ma);
		System.out.println("최소값 : "+mi);
	}

	public static int maxOfArray(int[] ar) {		
		int max = ar[0];
		
		for(int i = 0 ; i<ar.length; i++) {
			if(ar[i] > max) {
				max = ar[i];
			}
		}
		return max;	
	}
	
	public static int minOfArray(int[] ar) {
		int min = ar[0];
		
		for(int i = 0 ; i<ar.length; i++) {
			if(ar[i]<min) {
				min = ar[i];
			}
		}
		
		return min;
	}
	
	//min, max 변수를 각각 배열의 0번 요소값으로 초기화 합니다
	//배열요소 1번부터 마지막요소까지 max,min과 순서대로 비교해서
	// max가 그값보다 작으면 min 그것보다 크면
	
	
}

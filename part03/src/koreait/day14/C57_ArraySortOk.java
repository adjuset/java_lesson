package koreait.day14;

public class C57_ArraySortOk {

	public static void main(String[] args) {

		// 정렬 알고리즘 : 오름차순
		int[] nums = {34,77,19,57,45,9};
		int temp;
		
		for(int i=0 ; i<nums.length-1 ;i++) {
			for(int k = i+1; k<nums.length ; k++) {
				if(nums[i] > nums[k]) {
					temp = nums[k];
					nums[k] = nums[i];
					nums[i] = temp;
				}
			}
		}
		
		for(int i=0 ; i<nums.length ;i++) {
			System.out.printf("%5d",nums[i]);
		}
		
			
	}

}

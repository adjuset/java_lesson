package koreait.day13a;

public class C57_ArraySortEx {

	//배열에 저장된 값 정렬하기 직접 구현하세요
	public static void main(String[] args) {

		int[] nums = {5,8,3,9,6,4,12,6};
		int temp;
		
		for(int i=0 ; i<nums.length-2; i++) {
			for(int k = i+1; i<=nums.length-1 ; k++) {
				if(nums[i] > nums[k]) {
					temp = nums[k];
					nums[k] = nums[i];
					nums[i] = temp;
				}
			
			}
		}
		
		for(int nn : nums) {
			System.out.print(nn+" ");
		}
		
	}

}

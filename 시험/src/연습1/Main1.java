package 연습1;

import java.util.ArrayList;
import java.util.List;

public class Main1 {

	public static void main(String[] args) {
		Solution s = new Solution();
		String[] soult={"Kim","dd","dsf"};
		System.out.println(s.solution(soult));
	}

}


class Solution {
	public String solution(String[] seoul) {
    	int i;
        
        for( i=0 ;i<seoul.length ;i++) {
        	if(seoul.equals("Kim")) {
        		break;
        	}
        		 
        }
        
        return "김서방은"+i+"에 있다";
    }
}
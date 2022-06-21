package Ex;

public class Main {

	public static void main(String[] args) {
		Solution sol = new Solution();
		System.out.println(sol.solution("!@#$%aLDIALFJ"));
	}
}

class Solution {
    public String solution(String new_id) {
        String answer = "";
        
        answer = new_id.toLowerCase();
        answer = new_id.replaceAll("~`!@#$%^&*()", "");
        
        
        
        
        return answer;
    }
}

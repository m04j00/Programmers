class Solution {
    public String solution(int n) {
        //StringBuffer answer = new StringBuffer("");
        StringBuilder answer = new StringBuilder("");
        
        for(int i = 1; i <= n; i++){
            answer = i % 2 != 0 ? answer.append("수") : answer.append("박");
        }
        
        return answer.toString();
        
        /*

        String answer = "";
        
        for(int i = 1; i <= n; i++){
            if(i % 2 != 0) answer += "수";
            else answer += "박";
        }
        
        return answer;
        
        */
    }
}
class Solution {
    public String solution(String s) {
        String answer = "";
        String[] sp = s.split(" ");
        for(int i = 0; i < sp.length; i++){
            if(sp[i].length() == 0) answer += " ";
            else{
                answer += sp[i].substring(0, 1).toUpperCase();
                answer += sp[i].substring(1, sp[i].length()).toLowerCase();
                answer += " ";
            }
            
        }
        answer = answer.substring(0, answer.length() - 1);
        if(s.substring(s.length() -1, s.length()).equals(" ")) answer += " ";
        return answer;
    }
}
class Solution {
    public String solution(String s) {
        StringBuilder answer = new StringBuilder("");
        boolean even = true;

        for(int i = 0; i < s.length(); i++){
            char ch = s.charAt(i);

            if(ch == ' ') {
                answer.append(" ");
                even = true;
                continue;                
            }

            if(even){
                answer.append(String.valueOf(ch).toUpperCase());
            }
            else {
                answer.append(String.valueOf(ch).toLowerCase());
            }

            even = !even;
        }
        return answer.toString();
    }
}
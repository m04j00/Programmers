class Solution {
    public int solution(String s) {
        int answer = 0;
        
        boolean sign = true; // true : +  false : -
        
        for(int i = 0; i < s.length(); i++){
            char ch = s.charAt(i);
            
            if (ch == '-') sign = false;
            
            else if('0' <= ch && ch <= '9') answer = answer * 10 + (ch - '0');
        }
        
        if(sign == false ) answer = -answer;
       
        return answer;
         //return Integer.parseInt(s);
    }
}
class Solution {
    boolean solution(String s) {
        //String[] b = s.split("");
        int open = 0;
        
        for(int i = 0; i < s.length(); i++){
            char b = s.charAt(i);
            
            if(b == '(') open++;
            else if(b == ')') open--;
            if(open == -1) return false;
            
        }
        if(open == 0) return true;
        else return false;
    }
}

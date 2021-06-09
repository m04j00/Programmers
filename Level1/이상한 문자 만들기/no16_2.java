class Solution {
    public String solution(String s) {
        char[] ch = s.toCharArray();
        StringBuilder answer = new StringBuilder();
        boolean even = true;
        
        for(int i = 0; i < ch.length; i++){
            if(ch[i] == ' '){
              even = true;
              answer.append(" ");
              continue;
            } 
            
            if(even){
                answer.append(Character.toUpperCase(ch[i]));
            }
            else{
                answer.append(Character.toLowerCase(ch[i]));
            }
            
            even = !even;
        }
        
        return answer.toString();
    }
  }
  
class Solution {
    public String solution(String s, int n) {
<<<<<<< HEAD
        String answer = "";
        char[] alp = s.toCharArray();
        
=======
      String answer = "";
        char[] alp = s.toCharArray();
        // System.out.println((int)alp[0]);

>>>>>>> 9d92e96f58919236a61db46ce79f95a885a17caa
        for(int i = 0; i < alp.length; i++){
            if(alp[i] == ' ') answer += ' ';
            else if(Character.isUpperCase(alp[i])) {
                int temp = (int)alp[i] + n;
                if(temp > 90) answer += (char)(temp - 26);
                else answer += (char)temp;
            }else{
                int temp = (int)alp[i] + n;
                if(temp > 122) answer += (char)(temp - 26);
                else answer += (char)temp;
            }
        }
<<<<<<< HEAD
        
        return answer;
    }
}
=======
        return answer;
    }
}
>>>>>>> 9d92e96f58919236a61db46ce79f95a885a17caa

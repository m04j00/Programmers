class Solution {
    public int[] solution(int[] answers) {
        int[] answer = {};
        int[] ans1 = {1, 2, 3, 4, 5};
        int[] ans2 = {2, 1, 2, 3, 2, 4, 2, 5};
        int[] ans3 = {3, 3, 1, 1, 2, 2, 4, 4, 5, 5};
        int[] cnt = new int[3];
        
        for(int i = 0; i < answers.length; i++){
            if(ans1[i % ans1.length] == answers[i]) cnt[0]++;
            if(ans2[i % ans2.length] == answers[i]) cnt[1]++;
            if(ans3[i % ans3.length] == answers[i]) cnt[2]++;
        }
        int max = cnt[0];
        
        for(int i = 1; i < 3; i++){
            if(max < cnt[i]) max = cnt[i];
        }
        
        if(max == 0) return answer;
        
        int k = 0;
        for(int i = 0; i < 3; i++){
            if(cnt[i] == max) {
                cnt[i] = -1;
                k++;
            }
        }
        
        answer = new int[k];
        
        for(int i = 0, j = 0; i < 3; i++){
            if(cnt[i] == -1) answer[j++] = i+1; 
        }
        
        return answer;
    }
}
class Solution {
    public int[] solution(int[] lottos, int[] win_nums) {
        int[] answer = new int[2];
        
        for(int i = 0; i < lottos.length; i++){
            for(int j = 0; j < win_nums.length; j++){
                if(lottos[i] == win_nums[j]) answer[1]++;
            }
            if(lottos[i] == 0) answer[0]++;
        }
        
        answer[0] += answer[1];
        
        for(int i = 0; i < 2; i++){
            if(answer[i] == 0) answer[i] = 6;
            else answer[i] = 7 - answer[i];
        }
        return answer;
    }
}
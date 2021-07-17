class Solution {
    public int solution(int[] d, int budget) {
        int answer = 0;
        int sum = 0;
        
        for(int i = 0; i < d.length - 1; i++){
            for(int j = 0; j < d.length - 1- i; j++){
                if(d[j] > d[j+1]){
                    int temp = d[j];
                    d[j] = d[j+1];
                    d[j+1] = temp;
                }
            }
        }
        
        for(int i = 0; i < d.length; i++){
            if((sum + d[i]) > budget) {
                    break;
            }
            sum += d[i];
            answer++;
        }
        return answer;
    }
}
class Solution {
    public long solution(long n) {
        long answer = 0;
        int num = 0;
        
        for(long i = 1; i <= n; i++){
            if(i * i == n) {
                //answer = (long)Math.pow(i+1, 2);
                answer = (i + 1) * (i + 1);
                return answer;
            }
        }
        
        return -1;

    }
}
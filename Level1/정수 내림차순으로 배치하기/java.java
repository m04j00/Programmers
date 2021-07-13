class Solution {
    public long solution(long n) {
        long answer = 0;
        
        String[] num = String.valueOf(n).split("");
        
        for(int i = 0; i < num.length -1; i++){
            for(int j = 0; j < num.length - 1 - i; j++){
                if(Long.valueOf(num[j]) < Long.valueOf(num[j+1])){
                    String temp = num[j];
                    num[j] = num[j+1];
                    num[j+1] = temp;
                }
            }
        }
        for(int i = 0; i < num.length; i++){
            answer += Long.valueOf(num[i]) * (int)(Math.pow(10, num.length - i - 1));
        }
        return answer;
    }
}
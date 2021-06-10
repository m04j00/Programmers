class Solution {
    public long solution(long n) {
        
        double sq = (int)Math.sqrt(n);
        
        if(n == (long)Math.pow(sq, 2)){
            return (long)Math.pow(sq+1, 2);
        }
        else return -1;

    }
}
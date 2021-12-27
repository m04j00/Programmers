class Solution {
    public int solution(int n) {
        int answer = 0;
        int originOne = binaryOne(n);
        //System.out.println(one);
        int num = n + 1;
        while(true){
            int one = binaryOne(num);
            if(one == originOne) return num;
            num++;
        }
       
    }
    private int binaryOne(int n){
        int ret = 1;
        while(n != 1){
            int b = n % 2;
            if(b == 1) ret++;
            n /= 2;
        }
        return ret;
    }
}

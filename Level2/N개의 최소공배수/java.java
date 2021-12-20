class Solution {
    public int solution(int[] arr) {
        int answer = 0;
        int gcd = GCD(arr[0], arr[1]);
        int lcm = arr[0] * arr[1] / gcd;
        System.out.println(gcd + "  " + lcm);
        for(int i = 2; i < arr.length; i++){
            gcd = GCD(lcm, arr[i]);
            lcm = lcm * arr[i] / gcd;
             System.out.println(gcd + "  " + lcm);
        }
        answer = lcm;
        return answer;
    }
    
    // 최대공약수를 반환하는 함수
    private int GCD(int a, int b){
        if( a % b == 0) return b;
        return GCD(b, a % b);
    }
}
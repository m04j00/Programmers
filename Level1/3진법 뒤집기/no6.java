class Solution {
    public int solution(int n) {
        int answer = 0;
        int[] array = new int[50];
        int num = n;

        int cnt;
        for(cnt = 0; num != 0; cnt++){
            if(num % 3 == 0) array[cnt] = 0;
            else array[cnt] = num % 3;
            num /= 3;
        }

        int j = 0;
    
        for(int i = cnt - 1; i >= 0; i--){
            answer+=array[i]*Math.pow(3,j++);
        }
        return answer;
    }
}
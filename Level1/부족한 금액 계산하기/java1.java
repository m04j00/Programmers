class Solution {
    public long solution(int price, int money, int count) {
        long answer = -1;
        long fin = 0;
        for (int i = 1; i <= count; i++) {
            fin += price * i;
        }
        answer = fin - money;
        if (answer <= 0) return 0;

        return answer;
    }
}
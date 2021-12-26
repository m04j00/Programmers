class Solution {
    public int solution(int n) {
        int answer = 1;

        for (int k = 1; k <= n / 2; k++) {
            int sum = 0;
            for (int i = k; i <= n; i++) {
                sum += i;
                // System.out.println(sum);
                if (sum == n) {
                    answer++;
                    break;
                }
                if (sum > n)
                    break;
            }
        }
        return answer;
    }
}
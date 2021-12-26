function solution(n) {
    var answer = 1;
    for (let k = 1; k <= n / 2; k++) {
        let sum = 0;
        for (let i = k; i <= n; i++) {
            sum += i;
            if (sum == n) {
                answer++;
                break;
            } else if (sum > n) break;
        }
    }
    return answer;
}
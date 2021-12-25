function solution(s) {
    const answer = '';
    const num = s.split(' ');
    num.sort((a, b) => a - b);
    answer += num[0] + " " + num[num.length - 1];
    return answer;
}
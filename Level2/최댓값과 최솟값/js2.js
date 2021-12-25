function solution(s) {
    var answer = '';
    let num = s.split(' ');
    
    answer += Math.min(...num) + ' ' + Math.max(...num);
    return answer;
}
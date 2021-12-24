function solution(A, B) {
    var answer = 0;
    A.sort((a, b) => a - b);
    B.sort((a, b) => a - b);

    for (let a of A) {
        //console.log(a, B.pop());
        answer += (a * B.pop());
    }
    return answer;
}
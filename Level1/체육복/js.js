function solution(n, lost, reserve) {
    var answer = n - lost.length;
    
    for(let i = 0, m = 0; i < lost.length; i++){
        for(let j = 0, n = 0; j < reserve.length; j++){
            if(lost[i] == reserve[j]) {
                lost.splice(i--, 1);
                reserve.splice(j, 1);
                answer++;
            }
        }
    }

    for(let i of lost){
        for(let j = 0; j < reserve.length; j++){
            if(i - 1 == reserve[j] || i + 1 == reserve[j]) {
                answer++;
                reserve.splice(j, 1);
                break;
                
            }
        }
    }
    return answer;
}
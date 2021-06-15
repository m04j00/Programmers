function solution(arr) {
    let answer = arr;
    
    if(arr.length == 1){
        return [-1];
    }
    
    let min = Math.min.apply(null, answer);
    
    for(let i = 0; i < answer.length; i++){
        if(answer[i] === min) {
            answer.splice(i, 1)
            break;
        }
            
    }
    
    return answer;
}
function solution(arr) {
    var answer = arr;
    let min = arr[0];
    
    if(arr.length == 1){
        answer[0] = -1;
        return answer;
    }
    
    for(let i of answer){
        if(i < min) min  = i;
    }
    
    for(let i = 0; i < answer.length; i++){
        if(answer[i] === min) {
            answer.splice(i, 1)
            break;
        }
            
    }
    
    return answer;
}
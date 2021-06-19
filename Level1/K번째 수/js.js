function solution(array, commands) {
    let answer = [];
    
    for(let i = 0; i < commands.length; i++){
        let min = commands[i][0];
        let max = commands[i][1];
        let k = commands[i][2] - 1;
        
        let arr = array.slice(min - 1, max);
        
        arr.sort((a, b) => a - b);
        
        answer.push(arr[k]);
    }
    return answer;
}
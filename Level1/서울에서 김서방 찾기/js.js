function solution(seoul) {
    var answer = '';
    let cnt = 0;
    
    for(let i of seoul){
        if("Kim" == i) 
            return "김서방은 " + cnt + "에 있다";
        cnt++;
    }
    
    return answer;
}
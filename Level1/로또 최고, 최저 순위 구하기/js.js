function solution(lottos, win_nums) {
    let answer = [0, 0];
    
    for(let lot of lottos){
        for(let win of win_nums){
            if(lot == win){
                answer[1]++;
                break;
            }
        }
        if(lot == 0) answer[0]++;
    }
    answer[0] += answer[1];
        
    for(let i = 0; i < 2; i++){
        if(answer[i] == 0) answer[i] = 6;
        else answer[i] = 7 - answer[i];
    }
    
    return answer;
}
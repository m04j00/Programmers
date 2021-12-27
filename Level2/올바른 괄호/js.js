function solution(s){
    let open = 0;
    
    for(let b of s){
        if(b === '(') open++;
        else open--;
        if(open == -1) return false;
    }
    
    if(open == 0) return true;
    else return false;
}

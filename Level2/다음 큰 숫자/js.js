function solution(n) {
    const nOne = binaryOne(n);
    let num = n + 1;
    while(true){
        const numOne = binaryOne(num);
        if(nOne == numOne) return num;
        num++;
    }
}

function binaryOne(n){
    let ret = 0;
    let b = n.toString(2);
    for(let i of b){
        if(i == '1') ret++;
    }
    return ret;
}

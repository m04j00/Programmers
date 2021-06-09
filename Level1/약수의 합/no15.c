#include <stdio.h>
#include <stdbool.h>
#include <stdlib.h>

int solution(int n) {
    int answer = 0;
    
    if(n != 0) answer++;
    
    for(int i = 1; i <= n/2; i++){
        if(n % i == 0) answer += n/i;
    }
    
    return answer;
}
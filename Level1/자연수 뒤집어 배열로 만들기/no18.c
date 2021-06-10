#include <stdio.h>
#include <stdbool.h>
#include <stdlib.h>

int* solution(long long n) {
    long long num = n;
    int cnt = 0;
    
    while(num != 0){
        num /= 10;
        cnt++;
    }
    
    int* answer = (int*)malloc(sizeof(int) * cnt);
    memset(answer, 0, cnt);
    
    num = n;
    for(int i = 0; num != 0; i++){
        answer[i] = (int)(num % 10);
        num /= 10;
    }
    
    return answer;
}
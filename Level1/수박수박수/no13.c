#include <stdio.h>
#include <stdbool.h>
#include <stdlib.h>

char* solution(int n) {
    char* answer = (char*)malloc(sizeof(char) * n * 3 + 1);
    memset(answer, 0, sizeof(char) * n);
    
    for(int i = 1; i <= n; i++){
        if(i % 2 != 0) strcat(answer, "수");
        else strcat(answer, "박");
    }
    
    return answer;
}
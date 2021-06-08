#include <stdio.h>
#include <stdbool.h>
#include <stdlib.h>

char* solution(const char* s) {
    char* answer = (char*)malloc(sizeof(char) * 3);
    memset(answer, 0, 3);
    
    if(strlen(s) % 2 == 0){
        answer[0] = s[strlen(s)/2-1];
        answer[1] = s[strlen(s)/2];
    }
    else answer[0] = s[strlen(s)/2];
   
    
    
    return answer;
}
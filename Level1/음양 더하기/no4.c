#include <stdio.h>
#include <stdlib.h>

int solution(int absolutes[], size_t absolutes_len, bool signs[], size_t signs_len) {
    int answer = 0;
    for(int i = 0; i < absolutes_len; i++){
        if(signs[i] == false) absolutes[i] = -absolutes[i];
        answer += absolutes[i];
    }
    
    return answer;
}
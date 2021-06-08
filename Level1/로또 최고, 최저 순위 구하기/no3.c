#include <stdio.h>
#include <stdlib.h>

int* solution(int lottos[], size_t lottos_len, int win_nums[], size_t win_nums_len) {
    
    int* answer = (int*)malloc(sizeof(int) * 2);
    for(int i = 0; i < 2; i++){
        answer[i] = 0;
    }
    int cnt = 0;
    for(int i = 0; i < lottos_len; i++){
        for(int j = 0; j < win_nums_len; j++){
            if(lottos[i] == win_nums[j]){
                answer[1]++;
            } 
        }
        if(lottos[i] == 0) answer[0]++;
    }
    
    answer[0] += answer[1];
    printf("최대 : %d\n", answer[0]);
    printf("최소 : %d\n", answer[1]);
    
    for(int i = 0; i < 2; i++){
        if(answer[i] == 0) answer[i] = 6;
        else answer[i] = 7 - answer[i];
    }
    
    return answer;
}
#include <stdio.h>
#include <stdbool.h>
#include <stdlib.h>
#include <string.h>
// answer에 s 복사
// 큰 수부터 작은 수 순서
// 버블 정렬을 사용하여 아스키코드가 더 클 경우 앞쪽으로 

char* solution(const char* s) {

    int len = strlen(s);
    
    char* answer = (char*)malloc(sizeof(char) * len + 1);
    
    strcpy(answer, s);
    
    for(int i = 0; i < len - 1; i++){
        for(int j = 0; j < len - i - 1; j++){
            if(answer[j] < answer[j+1]){
                int temp = answer[j];
                answer[j] = answer[j+1];
                answer[j+1] = temp;
            }
        }
    }
    
    return answer;
}
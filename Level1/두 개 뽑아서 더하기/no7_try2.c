#include <stdio.h>
#include <stdbool.h>
#include <stdlib.h>
//1. 인덱스 + 인덱스 
//2. 앞 번호와 같을 시 continue
//3. 정렬
int* solution(int numbers[], size_t numbers_len) {
    int* answer = (int*)malloc(sizeof(int) * numbers_len * numbers_len);
    
    for(int i = 0; i < numbers_len * numbers_len;i++){
        answer[i] = 0;
    }
    
    int cnt = 0;
    for(int i = 0; i < numbers_len; i++){
        for(int j = i+1; j <numbers_len; j++){
            int sum = numbers[i] + numbers[j];
            int equal = 0;
            
            for(int z = 0; z < cnt; z++){
                if(sum == answer[z]) equal = 1;
            }
            
            if(equal == 0) answer[cnt++] = sum;
        }
    }
    
    for(int i = 0; i < cnt - 1; i++){
        for(int j = 0; j < cnt - 1 - i; j++){
            if(answer[j] > answer[j+1]) {
              int temp = answer[j];
                answer[j] = answer[j+1];
                answer[j+1] = temp;
            }
        
        }
    }
    return answer;
}
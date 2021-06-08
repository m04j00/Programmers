#include <stdio.h>
#include <stdbool.h>
#include <stdlib.h>
//1. 인덱스 + 인덱스 
//2. 앞 번호와 같을 시 continue
//3. 정렬
int* solution(int numbers[], size_t numbers_len) {
    
    int* array = (int*)malloc(sizeof(int) * 1000);
    
    for(int i = 0; i < 1000;i++){
        array[i] = 0;
    }
    int k = 0;
    for(int i = 0; i < numbers_len; i++){
        for(int j = i+1; j <numbers_len; j++){
            array[k] = numbers[i] + numbers[j];
            int num = k;
           // printf("%d\n", array[k]);
            for(int z = 0; z < num; z++){
                if(array[num] == array[z]) {
                    k--;
                }
            }
            k++; 
        }
    }
    
    int* answer = (int*)malloc(sizeof(int) * k);
    for(int i = 0; i < k; i++)
        answer[i] = array[i];
    free(array);
    for(int i = 0; i < k - 1; i++){
        for(int j = 0; j < k - 1 - i; j++){
            if(answer[j] > answer[j+1]) {
              int temp = answer[j];
                answer[j] = answer[j+1];
                answer[j+1] = temp;
            }
        
        }
    }
    return answer;
}
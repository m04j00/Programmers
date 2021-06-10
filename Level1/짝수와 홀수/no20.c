#include <stdio.h>
#include <stdbool.h>
#include <stdlib.h>

char* solution(int num) {

    char* answer = (char*)malloc(sizeof(char) * 4);
    memset(answer, '0', 4);
    
    answer = num % 2 == 0 ? "Even" : "Odd";
    
    return answer;
}
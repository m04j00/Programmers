#include <stdio.h>
#include <stdbool.h>
#include <stdlib.h>
//공백이면 cnt 초기화
//cnt 홀짝 판단
//짝수이면 소문자인지 판단
//소문자일 경우 대문자로 치환
//홀수이면 대문자인지 판단
//대문자일 경우 소문자로 치환
char* solution(const char* s) {

    int len = strlen(s);
    char* answer = (char*)malloc(sizeof(char) * len + 1);
    bool even = true;
    
    for(int i = 0; i < len + 1; i++){
        answer[i] = '0';
        if(s[i] == ' ') {
            even = true;
            answer[i] = s[i];
            continue;
        }
        
        if(even){
            if(islower(s[i])) answer[i] = s[i] - 32;
            else answer[i] = s[i];
        }
        else{
            if(isupper(s[i])) answer[i] = s[i] + 32;
            else answer[i] = s[i];
        }
        
        even = !even;
    }
    
    return answer;
}
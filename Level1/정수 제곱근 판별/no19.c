#include <stdio.h>
#include <stdbool.h>
#include <stdlib.h>

long long solution(long long n) {
    long long answer = 0;
    double sq = (int)sqrt(n);

    answer = (long long)pow(sq, 2) == n ? (long long)pow(sq + 1, 2) : -1;

    return answer;
}
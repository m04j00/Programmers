function solution(absolutes, signs) {

    return absolutes.reduce((sum, i, j) => sum - (signs[j] ? -i : +i), 0);

}
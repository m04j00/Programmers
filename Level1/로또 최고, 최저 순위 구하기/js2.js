function solution(lottos, win_nums) {
    var rank = [6, 6, 5, 4, 3, 2, 1];
    let answer = [];

    let min = lottos.filter((item) => win_nums.includes(item)).length;
    let max = lottos.filter((i) => i === 0).length + min;

    answer.push(rank[max]);
    answer.push(rank[min]);

    return answer;
}
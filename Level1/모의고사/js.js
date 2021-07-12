function solution(answers) {
    var answer = [];
    let stu1 = [1, 2, 3, 4, 5];
    let stu2 = [2, 1, 2, 3, 2, 4, 2, 5];
    let stu3 = [3, 3, 1, 1, 2, 2, 4, 4, 5, 5];

    let cnt = [];
    cnt.push(answers.filter((cnt, i) => cnt === stu1[i % stu1.length]).length);
    cnt.push(answers.filter((cnt, i) => cnt === stu2[i % stu2.length]).length);
    cnt.push(answers.filter((cnt, i) => cnt === stu3[i % stu3.length]).length);

    let max = Math.max(...cnt);

    if (max === 0) return [];

    for (let i = 0; i < cnt.length; i++) {
        if (max === cnt[i]) answer.push(i + 1);
    }

    return answer;
}
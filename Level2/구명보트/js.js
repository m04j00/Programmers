function solution(people, limit) {
    var answer = 0;
    people.sort((a, b) => a - b);

    while (people.length > 0) {
        const p = people.pop();
        let w = limit - p;
        if (people[0] <= w) {
            people.splice(0, 1);
        }
        answer++;
    }
    return answer;
}
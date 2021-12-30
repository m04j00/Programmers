function solution(dirs) {
    var answer = 0;
    let p = [0, 0];
    const visit = new Set();
    for (let i of dirs) {
        const cur_p = p.slice();

        if (i == 'U' && p[1] < 5) p[1]++;
        else if (i == 'D' && p[1] > -5) p[1]--;
        else if (i == 'R' && p[0] < 5) p[0]++;
        else if (i == 'L' && p[0] > -5) p[0]--;

        const st = p.join('') + cur_p.join('');
        const nd = cur_p.join('') + p.join('');
        if (!visit.has(st) && st != nd) {
            visit.add(st);
            visit.add(nd);
        }

    }
    // console.log(...visit);
    answer = visit.size / 2;
    return answer;
}
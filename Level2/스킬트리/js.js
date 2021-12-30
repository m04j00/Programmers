function solution(skill, skill_trees) {
    var answer = 0;
    const skills = skill.split('');

    for (let i of skill_trees) {
        if (!check(i, skills)) answer++;
    }
    return answer;
}

function check(i, skills) {
    let cnt = 0;
    for (let st of i) {
        for (let k = 0; k < skills.length; k++) {
            if (st == skills[k]) {
                if (cnt < k) {
                    return 1;
                }
                cnt++;
            }
        }
    }
    return 0;
}
console.log("answer : ", solution("CBD", ["BACDE", "CBADF", "AECB", "BDA"]));


/*
function solution(skill, skill_trees) {
    var answer = 0;
    const max_cnt = skill.length;
    const skills = skill.split('');
    
    for (let i of skill_trees) {
        let flag = true;
        let cnt = 0;
        
        for (let st of i) {
            for (let k = 0; k < max_cnt; k++) {
                if (st == skills[k]) {
                    if (cnt < k) {
                        flag = false;
                        break;
                    }
                    cnt++;
                }
            }
            if(!flag) break;
        }
        
        if (flag) {
            answer++;
        }
    }
    return answer;
}
*/
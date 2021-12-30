class Solution {
    public int solution(String skill, String[] skill_trees) {
        int answer = 0;
        String skills[] = skill.split("");
        for (int i = 0; i < skill_trees.length; i++) {
            if (checking(skills, skill_trees[i]))
                answer++;
        }
        return answer;
    }

    public boolean checking(String[] skills, String str) {
        int cnt = 0;
        for (int i = 0; i < str.length(); i++) {
            for (int s = cnt; s < skills.length; s++) {
                if (str.charAt(i) == skills[s].charAt(0)) {
                    if (cnt < s)
                        return false;
                    cnt++;
                }
            }
        }
        return true;
    }
}
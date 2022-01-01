import java.util.Arrays;

class Solution {
    public int solution(int[] people, int limit) {
        int answer = 0;
        Arrays.sort(people);
        int length = people.length - 1;
        for (int i = 0; i < length + 1; i++) {
            // System.out.println(length);
            int pop = people[length--];
            int w = limit - pop;
            if (people[i] > w)
                i--;
            answer++;
        }
        return answer;
    }
}
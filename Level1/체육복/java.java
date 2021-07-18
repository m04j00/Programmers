import java.util.*;
class Solution {
    public int solution(int n, int[] lost, int[] reserve) {
        int answer = n - lost.length;

        HashSet < Integer > hashset = new HashSet < Integer > ();

        for (int i = 0; i < reserve.length; i++) {
            hashset.add(reserve[i]);
        }
        for (int i = 0; i < lost.length; i++) {
            if (hashset.contains(lost[i])) {
                answer++;
                hashset.remove(lost[i]);
                lost[i] = -1;
            }
        }

        for (int i = 0; i < lost.length; i++) {
            if (hashset.contains(lost[i] - 1)) {
                answer++;
                hashset.remove(lost[i] - 1);
            } else if (hashset.contains(lost[i] + 1)) {
                answer++;
                hashset.remove(lost[i] + 1);
            }
        }

        return answer;
    }
}
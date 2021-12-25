import java.util.*;

class Solution {
    public String solution(String s) {
        String answer = "";
        String[] num = s.split(" ");

        int min, max;
        min = max = Integer.parseInt(num[0]);

        for (int i = 0; i < num.length; i++) {
            int n = Integer.parseInt(num[i]);
            if (min > n)
                min = n;
            else if (max < n)
                max = n;
        }
        answer += min + " " + max;

        return answer;
    }
}
import java.util.*;

class Solution {
    public String solution(String s) {
        String answer = "";
        String[] num = s.split(" ");

        int intNum[] = new int[num.length];
        for (int i = 0; i < num.length; i++)
            intNum[i] = Integer.parseInt(num[i]);
        Arrays.sort(intNum);
        answer += intNum[0] + " " + intNum[intNum.length - 1];

        return answer;
    }
}
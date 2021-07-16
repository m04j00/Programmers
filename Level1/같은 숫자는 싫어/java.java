import java.util.*;

public class Solution {
    public int[] solution(int []arr) {
        int[] answer = {};
        int cnt = 0;
        for(int i = 1; i < arr.length; i++){
            if(arr[i] != arr[i-1]) cnt++;
        }
        
        answer = new int[cnt + 1];
        answer[0] = arr[0];
        for(int i = 1, j = 1; i < arr.length; i++){
            if(arr[i] != arr[i-1]) answer[j++] = arr[i];
        }
        return answer;
    }
}
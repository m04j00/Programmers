class Solution {
    public int[] solution(int brown, int yellow) {
        int[] answer = new int[2];
        int i = 1;
        while (true) {
            for (int j = 0; i * j <= yellow; j++) {
                if (i * j == yellow && (i + 2) * (j + 2) - yellow == brown) {
                    answer[0] = j + 2;
                    answer[1] = i + 2;
                    return answer;
                }
            }
            i++;
        }
    }
}
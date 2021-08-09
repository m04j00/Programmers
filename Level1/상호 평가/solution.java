class Solution {
    public String solution(int[][] scores) {
        String answer = "";

        double[] totals = new double[scores.length];

        for (int i = 0; i < scores.length; i++) {
            int max = 0;
            int min = 0;
            for (int j = 0; j < scores.length; j++) {
                totals[i] += scores[j][i];
                if (scores[i][i] > scores[j][i]) max++;
                if (scores[i][i] < scores[j][i]) min++;
            }
            if (max == totals.length - 1 || min == totals.length - 1) {
                totals[i] -= scores[i][i];
                totals[i] /= totals.length - 1;
            } else totals[i] /= totals.length;

        }

        for (int i = 0; i < totals.length; i++) {
            if (totals[i] >= 90) answer += "A";
            else if (totals[i] >= 80) answer += "B";
            else if (totals[i] >= 70) answer += "C";
            else if (totals[i] >= 50) answer += "D";
            else answer += "F";
        }

        return answer;
    }
}
class Solution {
    public String[] solution(int n, int[] arr1, int[] arr2) {
        String[] answer = new String[n];
        int[][] Rarr1 = new int[n][n];
        int[][] Rarr2 = new int[n][n];
        
        
        for(int i = 0; i < n; i++){
            int a = arr1[i];
            int b = arr2[i];
            for(int j = 0; j < n; j++){
                Rarr1[i][j] = a % 2;
                Rarr2[i][j] = b % 2;
                a /= 2;
                b /= 2;
            }
        }
        
        for(int i = 0; i < n; i++){
            String str = "";
            for(int j = n - 1, k = 0; j >= 0; j--, k++){
                if(Rarr1[i][j] == 1 || Rarr2[i][j] == 1) str += "#";
                else str += " ";
            }
            answer[i] = str;
        }
        return answer;
    }
}

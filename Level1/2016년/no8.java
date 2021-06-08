class Solution {
    public String solution(int a, int b) {
        String answer = "";
        int num = 0;

        
        for(int i = 1; i < a; i++){
            if(i == 1 || i == 3 || i == 5 || i == 7 || i == 8 || i == 10 || i == 12)
                num += 31;
            else if(i == 2) num += 29;
            else num += 30;
        }

        num += b;
        
        int week = num % 7;
        switch(week){
            case 1 : answer = "FRI"; break;
            case 2 : answer = "SAT"; break;
            case 3 : answer = "SUN"; break;
            case 4 : answer = "MON"; break;
            case 5 : answer = "TUE"; break;
            case 6 : answer = "WED"; break;
            case 0 : answer = "THU"; break;
        }
        return answer;
    }
}
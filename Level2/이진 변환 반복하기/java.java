package binary;
class Solution {
    public static int[] solution(String s) {
        int[] answer = new int[2];
        
      //  while(s != "1"){
            answer[0]++;
            int cnt = 0;
            for(int i = 0; i < s.length(); i++){
                char d = s.charAt(i);
                if(d == '1') {
                    cnt++;
                    answer[1]++;
                }
            }
            String str = "";
            int d = cnt;
            for(int i= d; i>0; i/=2) {
                str = String.valueOf(i%2) + str;
            }
            s = str;
    //    }
        System.out.println(s);
        return answer;
    }
    public static void main(String[] args){
        solution("111");

    }
}
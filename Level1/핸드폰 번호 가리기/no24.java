class Solution {
    public String solution(String phone_number) {
        
        StringBuilder answer = new StringBuilder(phone_number);
        int cnt = phone_number.length();
        
        answer.delete(0, cnt - 4);
        System.out.println(answer);
        while(cnt != 4){
            answer.insert(0, "*");
            cnt--;
        }
        System.out.println(answer);
        return answer.toString();
    }
}
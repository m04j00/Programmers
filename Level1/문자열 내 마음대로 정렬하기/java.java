class Solution {
    public String[] solution(String[] strings, int n) {
        
        for(int i = 0; i < strings.length - 1; i++){
            for(int j = 0; j < strings.length - 1 - i; j++){
                if(strings[j].compareTo(strings[j + 1])> 0){
                    String temp = strings[j];
                    strings[j] = strings[j + 1];
                    strings[j + 1] = temp;
                }
            }
        }
        
        for(int i = 0; i < strings.length - 1; i++){
            for(int j = 0; j < strings.length - 1 - i; j++){
                if(strings[j].substring(n, n + 1).compareTo(strings[j + 1].substring(n, n + 1))> 0){
                    String temp = strings[j];
                    strings[j] = strings[j + 1];
                    strings[j + 1] = temp;
                }
            }
        }

        return strings;
    }
}
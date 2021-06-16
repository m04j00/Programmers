class Solution {
    public int[] solution(int[] array, int[][] commands) {
        int[] answer = new int[commands.length];

        for(int i = 0; i < commands.length; i++){
            int min = commands[i][0];
            int max = commands[i][1];
            int k = commands[i][2] - 1;
            
            // 배열 생성 
            int[] arr = new int[max - min + 1];
            
            // 배열에 min ~ max 원소 넣기
            for(int j = 0; j < arr.length; j++){
                arr[j] = array[j + min - 1];
                //System.out.print(arr[j]);
            }
            
            //정렬
            for(int a = 0; a < arr.length - 1; a++){
                for(int j = 0; j < arr.length - a - 1; j++){
                    if(arr[j] > arr[j + 1]){
                        int temp = arr[j];
                        arr[j] = arr[j + 1];
                        arr[j + 1] = temp;
                    }

                }
            }
            
            //answer[i]에 k값 저장
            answer[i] = arr[k];
        }
        return answer;
    }
}
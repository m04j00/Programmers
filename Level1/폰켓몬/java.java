import java.util.HashSet;
class Solution {
    public int solution(int[] nums) {
        int answer = 0;
        int length = nums.length/2;
        
        HashSet<Integer> hashset = new HashSet<Integer>();
        
        for(int i = 0; i < nums.length; i++){
            hashset.add(nums[i]);
        }
        
        answer = (hashset.size() < nums.length / 2) ? hashset.size() : nums.length/2;

        return answer;
    }
}
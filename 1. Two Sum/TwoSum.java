class Solution {
    public int[] twoSum(int[] nums, int target) {
        Map<Integer, Integer> map = new HashMap<>();
        int[] answer  = new int[2];  
        map.put(nums[0],0);

        for(int i = 1; i < nums.length ; i++){
           if(map.get(target - nums[i]) != null){
            answer[0] = map.get(target - nums[i]);
            answer[1] = i;
            break;
           }
           else{
            map.put(nums[i],i);
           }
        }
         return answer;
    }
}
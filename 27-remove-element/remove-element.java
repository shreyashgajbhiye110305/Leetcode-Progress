class Solution {
    public int removeElement(int[] nums, int val) {
        int len = nums.length, count = 0;
        for(int i = 0; i < len; i++){
            if(nums[i] == val){
                nums[i] = Integer.MAX_VALUE;
            }
        }
        Arrays.sort(nums);
        for(int i = 0; i < len; i++){
            if(nums[i] == Integer.MAX_VALUE)break;
            count++;
        }
        return count;
    }
}
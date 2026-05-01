class Solution {
    public int removeElement(int[] nums, int val) {
        int len = nums.length, l = -1;
        for(int i = 0; i < len; i++){
            if(nums[i] != val){
                l++;
                nums[l] = nums[i];
            }
        }
        return l+1;
    }
}
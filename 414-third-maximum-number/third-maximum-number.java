class Solution {
    public int thirdMax(int[] nums) {
        int len = nums.length, k = 3, i = len-1;
        long ans = Long.MAX_VALUE;
        Arrays.sort(nums);
        if(len < 3){
            return nums[len-1];
        }
        while(k > 0 && i > -1){
            if(nums[i] < ans){
                ans = nums[i];
                k--;
            }
            i--;
        }
        return k > 0 ? nums[len-1] : (int)ans;
    }
}
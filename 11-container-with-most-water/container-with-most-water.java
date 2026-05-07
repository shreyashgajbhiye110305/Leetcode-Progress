class Solution {
    public int maxArea(int[] height) {
        int max_water = Integer.MIN_VALUE, len = height.length, j = len-1, i = 0;
        while(i < j){
            int width = j - i;
            int hei = Math.min(height[i], height[j]);
            int volume = width * hei;
            if(volume > max_water){
                max_water = volume;
            }
            if(height[i] > height[j])j--;
            else i++;
        }
        return max_water;
    }
}
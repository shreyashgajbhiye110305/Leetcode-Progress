class Solution {
    public int[] intersection(int[] nums1, int[] nums2) {
        Arrays.sort(nums1);
        Arrays.sort(nums2);
        int i = 0, j = 0, len1 = nums1.length, len2 = nums2.length;
        if(len1 == 0 || len2 == 0)return new int[0];
        List<Integer> ans = new ArrayList<>();
        while(i < len1 && j < len2){
            if(nums1[i] == nums2[j] && ans.contains(nums1[i]) == false){
                ans.add(nums1[i]);
                i++;
                j++;
            }else if(nums1[i] < nums2[j]){
                i++;
            }else j++;
        }
        int[] finalAnswer = new int[ans.size()];
        for(int k = 0; k < ans.size(); k++){
            finalAnswer[k] = ans.get(k);
        }
        return finalAnswer;
    }
}
class Solution {
    public int getCommon(int[] nums1, int[] nums2) {
        int i =0;
        int j = 0;
        int n = nums1.length;
        int m = nums2.length;

        while(i < n && j< m){
            if(nums1[i] == nums2[j]){
                return nums2[j];
            }
            else if(nums1[i] < nums2[j]){
                i++;
            }
            else{
                j++;
            }
        }
        return -1;
    }
}
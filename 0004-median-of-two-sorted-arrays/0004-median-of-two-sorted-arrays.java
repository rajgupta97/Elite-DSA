class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int merged[]= new int[nums1.length+nums2.length];
        int currIdx=0;
        int left =0,right=0;
        while(left<nums1.length && right<nums2.length){
            if(nums1[left]<nums2[right]){
                merged[currIdx++]=nums1[left++];
            }else{
                merged[currIdx++]=nums2[right++];
            }
        }
        while(left<nums1.length){
            merged[currIdx++]=nums1[left++];
        }
        while(right<nums2.length){
            merged[currIdx++]=nums2[right++];
        }
        int medium=currIdx/2;
        if(currIdx%2==0)
        return ((double)merged[medium-1]+(double)merged[medium])/2;
        return merged[medium];
    }
}
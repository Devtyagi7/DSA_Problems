class Solution {
    public int[] intersection(int[] nums1, int[] nums2) {
        int min=Math.min(nums1.length, nums2.length);
        int[] arr=new int[min];
        Arrays.sort(nums1);
        Arrays.sort(nums2);
        int i=0, j=0, k=0;
        while(i<nums1.length && j<nums2.length){
            if(nums1[i]<nums2[j]) i++;
            else if(nums1[i]>nums2[j]) j++;
            else{
                if(k==0 || nums1[i]!=arr[k-1]){
                    arr[k++] = nums1[i];
                }
                i++; j++;
            }
        }
        return Arrays.copyOf(arr, k);
    }
}
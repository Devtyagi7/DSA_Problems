class Solution {
    public int[] pivotArray(int[] nums, int pivot) {
        int[] arr=new int[nums.length];
        int less=0, equal=0, greater=0;
        for(int i=0; i<nums.length; i++){
            if(nums[i]==pivot) equal++;
            else if(nums[i]<pivot) less++;
            else greater++;
        }
        int lessIdx=0;
        int equalIdx=less;
        int greaterIdx=equal+less;
        for(int i=0; i<nums.length; i++){
            if(nums[i]<pivot){
                arr[lessIdx++]=nums[i];
            }
            else if(nums[i]==pivot){
                arr[equalIdx++]=nums[i];
            }
            else{
                arr[greaterIdx++]=nums[i];
            }
        }
        return arr;
    }
}
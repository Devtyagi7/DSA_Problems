class Solution {
    public int[] searchRange(int[] nums, int target) {
        int[] arr={-1,-1};
        int low=0, high=nums.length-1;
        while(low<=high){ // first occurence
            int mid=low+(high-low)/2;
            if(nums[mid]==target){
                arr[0]=mid;
                high=mid-1;
            }
            else if(nums[mid]<target){
                low=mid+1;
            }
            else{
                high=mid-1;
            }
        }
        low=0; high=nums.length-1;
        while(low<=high){ // last occurence
            int mid=low+(high-low)/2;
            if(nums[mid]==target){
                arr[1]=mid;
                low=mid+1;
            }
            else if(nums[mid]<target){
                low=mid+1;
            }
            else{
                high=mid-1;
            }
        }
        
        return arr;
    }
}
class Solution {
    public List<Integer> findMissingElements(int[] nums) {
        List<Integer> ans=new ArrayList<>();
        Arrays.sort(nums);
        int max=Integer.MIN_VALUE, min=Integer.MAX_VALUE;
        for(int i=0; i<nums.length; i++){
            if(nums[i]>max) max=nums[i];
            if(nums[i]<min) min=nums[i];
        }
        int count=0;
        for(int i=min; i<=max; i++){
            if(nums[count]!=i) ans.add(i);
            else count++;
        }
        return ans;
    }
}
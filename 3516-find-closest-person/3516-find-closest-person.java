class Solution {
    public int findClosest(int x, int y, int z) {
        int ans=z-y;
        int ans1=z-x;
        ans=Math.abs(ans);
        ans1=Math.abs(ans1);
        if(ans>ans1) return 1;
        else if(ans1>ans) return 2;
        else return 0;
    }
}
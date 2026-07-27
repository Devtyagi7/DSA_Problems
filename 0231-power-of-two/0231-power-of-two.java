class Solution {
    public boolean isPowerOfTwo(int n) {
        for(long i=1; i<=n; i*=2){
            if(i==n) return true;
        }
        return false;
    }
}
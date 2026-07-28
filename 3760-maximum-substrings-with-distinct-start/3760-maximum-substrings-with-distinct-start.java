class Solution {
    public int maxDistinct(String s) {
        boolean[] seen = new boolean[26];
        int ans = 0;
        for (int i = 0; i < s.length(); i++) {
            int idx = s.charAt(i) - 'a';
            if (!seen[idx]) {
                seen[idx] = true;
                ans++;
            }
        }
        return ans;
    }
}
class Solution {
public:
    int ssze(vector<int> v){
        int ans=0;
        for(int i=0;i<26;i++){
            if(v[i]!=0) ans++;
        }
        return ans;
    }
    int maximumLengthSubstring(string s) {
        int n=s.length();
        vector<bool> st(26,false);
        
        for(int i=0;i<n;i++) {
            st[s[i]-'a']=true;
        }
        int sze=0;
        for(int i=0;i<26;i++) {
            if(st[i]==true) sze++;
        }

        vector<int> mp(26,0);

        int i=0,j=0;
        int ans=0;
        while(j<n){
            mp[s[j]-'a']++;
            while( mp[s[j]-'a'] >2) {    
                mp[s[i]-'a']--;
                i++;
            }
            ans=max(ans,j-i+1);
            j++;
        }
        return ans;
    }
};
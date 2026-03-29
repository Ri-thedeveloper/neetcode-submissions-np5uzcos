class Solution {
public:
    bool isAnagram(string s, string t) {
        if(s.size()!=t.size()) return false;
        sort(s.begin(),s.end());
        sort(t.begin(),t.end());
        // set<char>a;
        // set<char>b;
        for(int i=0;i<s.size();i++){
            if(s[i]!=t[i]) return false;
            
        }
        
         return true;
    }
};

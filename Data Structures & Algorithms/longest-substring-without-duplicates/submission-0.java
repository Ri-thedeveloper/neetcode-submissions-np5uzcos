class Solution {
    public int lengthOfLongestSubstring(String s) {
        int maxi=0;
        for(int i=0;i<s.length();i++){
            String a=s.substring(i,i+1);
            int len=0;
            for(int j=i+1;j<s.length();j++){
                if(!a.contains(s.substring(j,j+1))) a+=s.charAt(j);
                else break;
            }
            maxi=Math.max(maxi,a.length());
        }
        return maxi;
    }
}

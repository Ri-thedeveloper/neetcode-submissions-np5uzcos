class Solution {
    public String mergeAlternately(String word1, String word2) {
        int s1=word1.length();
        int s2=word2.length();
        String a=new String();
        int i=0;
        boolean b=true;
        while(b){
            if(s1!=0 && s2!=0){
                a+=word1.charAt(i);
                a+=word2.charAt(i);
                
                i++;
                s1--;
                s2--;
            }
            if(s2==0){
                a+=word1.substring(i,word1.length());
                b=false;
            }
            if(s1==0){
                a+=word2.substring(i,word2.length());
                b=false;
            }
        }
        return a;
    }
}
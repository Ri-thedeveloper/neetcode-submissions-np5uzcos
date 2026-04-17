class Solution {
    public boolean isPalindrome(String s) {
        String so=s.replaceAll("[^a-zA-Z0-9]","").toLowerCase();
        StringBuilder sb=new StringBuilder(so);
        String s1=sb.reverse().toString();
        return so.equals(s1);
    }
}

class Solution {
    public int maxArea(int[] heights) {
        int maxi=Integer.MIN_VALUE;
        int left=0;
        int v=0;
        int w=0;
        while(left<=heights.length-1){
        for(int i=left+1;i<heights.length;i++){
            w=i-left;
            v=Math.min(heights[left],heights[i])*w;
            maxi=Math.max(v,maxi);
        }
        left++;
    }
    return maxi;
}}

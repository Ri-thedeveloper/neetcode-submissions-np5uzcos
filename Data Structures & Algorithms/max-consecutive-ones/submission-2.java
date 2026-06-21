class Solution {
    public int findMaxConsecutiveOnes(int[] nums) {
        int l=0;
        int r=0;
        int size=0;
        while(r<=nums.length-1){
        if(nums[r]==0) l=r+1;
        size=Math.max(size,r-l+1);
        r++;
    }return size;}}

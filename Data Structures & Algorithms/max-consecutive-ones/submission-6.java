class Solution {
    public int findMaxConsecutiveOnes(int[] nums) {
        int l=0;
        int r=1;
        int maxi=0;
        if(nums.length<2) return nums[0];
        while(r<nums.length){
            if(nums[l]==1){
                while(r<nums.length){
                    if(nums[r]==1) r++;
                    else break;
                }
               maxi=Math.max(maxi,r-l);
               l=r+1;
               
            }
            else {l++;}
            r++;
            
        }
        return maxi;
    }
}
class Solution {
    public int findMaxConsecutiveOnes(int[] nums) {
        int maxi=0;
        for(int i=0;i<nums.length;i++){
            boolean a=true;
            int count=0;
            
            for(int j=i;j<nums.length;j++){
                if(nums[j]!=nums[i] && nums[i]==1){a=false;break;}
                else if(nums[i]==nums[j] && nums[i]==1)count++;
            }
            maxi=Math.max(maxi,count);
        }
        return maxi;
    }
}
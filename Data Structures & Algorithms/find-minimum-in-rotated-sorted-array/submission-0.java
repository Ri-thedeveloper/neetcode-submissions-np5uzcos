class Solution {
    public int findMin(int[] nums) {
        int b=0;
        for(int i=0;i<nums.length-1;i++){
            if(nums[i+1]<nums[i]) b=i+1;
        }
        return nums[b];
    }
}

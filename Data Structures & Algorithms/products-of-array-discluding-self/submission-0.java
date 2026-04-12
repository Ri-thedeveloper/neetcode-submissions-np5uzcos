class Solution {
    public int[] productExceptSelf(int[] nums) {
        int[] arr=new int[nums.length];
        for(int i=0;i<nums.length;i++){
            int product=1;
            for(int a=0;a<nums.length;a++){
            if(a==i) continue;
            else {product=product*nums[a];
            }}
            arr[i]=product;
        }
   return arr; }
}  

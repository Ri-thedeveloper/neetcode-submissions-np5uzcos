class Solution {
    public int maxProfit(int[] prices) {
       int maxi=Integer.MIN_VALUE;
       int diff=0;
       for(int i=0;i<prices.length-1;i++){
        int a=prices[i];
        for(int j=i+1;j<prices.length;j++){
            diff=prices[j]-a;
            maxi=Math.max(diff,maxi);
        }
       } 
       if(maxi<0) return 0;
       else return maxi;
    }
}

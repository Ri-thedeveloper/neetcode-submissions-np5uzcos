class Solution {
    public int mySqrt(int x) {
        // int a=(int)(Math.pow(x,0.5));
        // return a;
        if(x<3) return x;
        int left=2;
        int right=x/2;
        int mid=0;
        while(left<=right){
            
            mid=(right+left)/2;
            long s=(long)mid*mid;
            if(s==x) return mid;
            else if(s<x) left=mid+1;
            else right=mid-1;
        }
        return right;
    }
}
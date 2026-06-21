class Solution {
    public int[] replaceElements(int[] arr) {
        int[]ar=new int[arr.length];
        for(int i=0;i<arr.length;i++){
            int maxi=-1;
            for(int j=i+1;j<arr.length;j++){
                maxi=Math.max(maxi,arr[j]);
            }
            ar[i]=maxi;
        }
        return ar;
    }
}
class Solution {
    public int[][] transpose(int[][] matrix) {
        int r=matrix.length;
        int c=matrix[0].length;
        int [][] arr=new int[c][r];
        for(int a=0;a<r;a++){
            for(int b=0;b<c;b++){
 arr[b][a]=matrix[a][b];
            }
        }
               
          
        return arr;

    }
}
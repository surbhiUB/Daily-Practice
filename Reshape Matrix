class Solution {
    public int[][] matrixReshape(int[][] nums, int r, int c) {
        int n = nums.length;
        int m = nums[0].length;
        if((n*m)!=(r*c)){
            return nums;
        }
        int[][] B= new int[r][c];
        int p=0;
        int q=0;
        for(int i =0;i<n;i++){
            for(int j =0;j<m;j++){
                B[p][q]=nums[i][j];
                q++;
                if(q==c){
                    p++;
                    q=0;
                }
            }
        }
        return B;
    }
}

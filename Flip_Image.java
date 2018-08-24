class Solution {
    public int[][] flipAndInvertImage(int[][] A) {
int invertedImage[][] = new int[A.length][];
        for(int i = 0; i < A.length; i++)
        {
           int rev[] = reverseNum(A[i]);
           int inv[] = inverseNum(rev);
           invertedImage[i] = inv;  
        }
        return invertedImage;
    }
    
    private int[] reverseNum(int num[])
    {
        for(int i = 0; i < (num.length)/2; i++)
        {
            int temp = num[i];
            num[i]  = num[num.length - i - 1];
            num[num.length - i - 1] = temp;
        }
        return num;
    }
    
    private int[] inverseNum(int num[])
    {
        for(int i = 0; i < num.length; i++)
        {
             num[i] = num[i]^1;
        }
        return num;
    }
}

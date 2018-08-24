class Solution {
    public int[] fairCandySwap(int[] A, int[] B) {
        int s1 = 0;
        int s2 = 0;
        for(int a : A){
            s1 +=a;
        }
        for(int b : B){
            s2 += b;
        }
        int dif= Math.round((s1-s2))/2;
        HashSet<Integer> set= new HashSet<Integer>();
        for (int i : A){
            set.add(i);
        }
        for (int j : B){
            if(set.contains(dif+j))
                return new int[]{j+dif,j}; 
        }
        return new int[0];
        
    }
}

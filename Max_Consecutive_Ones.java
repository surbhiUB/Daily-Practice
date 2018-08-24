class Solution {
    public int findMaxConsecutiveOnes(int[] nums) {
        int cnt = 0;
        int maxS = 0;
        for(int i=0;i<nums.length;i++){
            if(nums[i]==1){
                cnt=cnt+1;
                maxS = Math.max(maxS,cnt);
            }
            else{
                cnt = 0;
            }
        }
        return maxS;
    }
}

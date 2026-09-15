class Solution {
    public int findMaxConsecutiveOnes(int[] nums) {
        int maxOnes=0;
        int l=0;
        int max=0;
        for(int i=0;i<nums.length;i++){
            if(nums[i]==1){
                max++;
            }
            else{
                max=0;
            }
            maxOnes=Math.max(maxOnes,max);
        }
        return maxOnes;
    }
}
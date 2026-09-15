class Solution {
    public int findMaxConsecutiveOnes(int[] nums) {
        int maxOnes=0;
        int max=0;
        for(int num:nums){
            if(num==1){
                max++;
                if(maxOnes<max){
                    maxOnes=max;
                }
            }
            else{
                max=0;
            }
            
        }
        return maxOnes;
    }
}
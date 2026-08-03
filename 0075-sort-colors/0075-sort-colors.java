class Solution {
    public void sortColors(int[] nums) {
        for(int i=0;i<nums.length-1;i++){
            for(int j=0;j<nums.length-1-i;j++){
                if(nums[j]>nums[j+1]){
                    swap(nums,j,j+1);
                }
            }
        }
    }
    private int[] swap(int[] nums,int l,int r){
        int temp=nums[l];
        nums[l]=nums[r];
        nums[r]=temp;
        return nums;
    }
}
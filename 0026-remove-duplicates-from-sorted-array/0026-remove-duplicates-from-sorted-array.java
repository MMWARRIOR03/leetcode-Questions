class Solution {
    public int removeDuplicates(int[] nums) {
        Set<Integer> set=new HashSet<>();
        int count=0;
        for(int i=1;i<nums.length;i++){
            if(nums[count]!=nums[i]){

                count++;
                nums[count]=nums[i];
            }
        }
        return count+1;
    }
}
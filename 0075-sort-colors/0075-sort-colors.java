class Solution {
    public void sortColors(int[] nums) {
        int r=0,b=0,w=0;
        for(int num:nums){
            if(num==0) r++;
            else if(num==1) w++;
            else b++;
        }
        int i=0;
        while(r>0){
            nums[i]=0;
            i++;
            r--;
        }
        while(w>0){
            nums[i]=1;
            i++;
            w--;
        }
        while(b>0){
            nums[i]=2;
            i++;
            b--;
        }
    }
}
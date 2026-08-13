class Solution {
    public int maxProduct(int[] nums) {
        if (nums == null || nums.length == 0) {
            return 0;
        }
        int maxProduct = nums[0];
        int currentMax = nums[0];
        int currentMin = nums[0];

        for (int i = 1; i < nums.length; i++) {
            int num = nums[i];

            int tempMax = currentMax;
            int tempMin = currentMin;

            currentMax = Math.max(num, Math.max(tempMax * num, tempMin * num));

            currentMin = Math.min(num, Math.min(tempMax * num, tempMin * num));

            maxProduct = Math.max(maxProduct, currentMax);
        }

        return maxProduct;
    }
}
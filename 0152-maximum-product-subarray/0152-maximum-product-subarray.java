
class Solution {
    public int maxProduct(int[] nums) {

        int max = nums[0];
        int maxProduct = 1;
        int minProduct = 1;

        for (int i = 0; i < nums.length; i++) {

            int temp = maxProduct * nums[i];

            maxProduct = Math.max(nums[i],
                         Math.max(temp, minProduct * nums[i]));

            minProduct = Math.min(nums[i],
                         Math.min(temp, minProduct * nums[i]));

            max = Math.max(max, maxProduct);
        }

        return max;
    }
}

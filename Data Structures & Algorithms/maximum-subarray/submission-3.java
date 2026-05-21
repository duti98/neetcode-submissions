class Solution {
    public int maxSubArray(int[] nums) {
        int finalSum = nums[0];
        int localSum = 0;
        for (int i=0; i<nums.length; i++) {
            if (localSum < 0) {
                localSum = 0;
            }
            localSum = localSum + nums[i];
            finalSum = Math.max(localSum, finalSum);
        }
        return finalSum;
    }
}

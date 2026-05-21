class Solution {
    public int maxSubArray(int[] nums) {
        int finalSum = nums[0];
        for (int i=0; i<nums.length; i++) {
            int j = i;
            int localSum = 0;
            while (localSum >= 0 && j < nums.length) {
                localSum = localSum + nums[j];
                j++;
                if (localSum > finalSum) {
                    finalSum = localSum;
                }
            }
        }
        return finalSum;
    }
}

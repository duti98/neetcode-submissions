class Solution {
    public int[] twoSum(int[] nums, int target) {
        //Arrays.sort(nums);
        int[] twoSumArray = new int[2];
        for (int i=1; i < nums.length; i++) {
            for (int j=0; j < i; j++) {
                if ((nums[i] + nums[j]) == target) {
                    twoSumArray[0] = j;
                    twoSumArray[1] = i;
                }
            }
        }
        return twoSumArray;
    }
}

class Solution {
    public int[] twoSum(int[] nums, int target) {
        Map<Integer, Integer> map = new HashMap<>();
        int[] numbers = new int[2];
        for (int i=0; i < nums.length; i++) {
            map.put(nums[i], i);
        }
        for (int k=0; k<nums.length; k++) {
            int difference = (target - nums[k]);
            if (map.containsKey(difference) && k != map.get(difference)) {
                numbers[0] = k;
                numbers[1] = map.get(difference);
                break;
            }
        } return numbers;
    }
}

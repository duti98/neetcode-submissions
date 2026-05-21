class Solution {
    public boolean hasDuplicate(int[] nums) {
        /*Map<Integer, Integer> map = new HashMap<>();
        for (int i=0; i<nums.length; i++) {
            if (map.containsKey(nums[i])){
                return true;
            } else {
                map.put(nums[i], i);
            }
        }
        return false;*/
        for (int i=0; i<nums.length; i++) {
            for (int k=i+1; k<nums.length; k++) {
                if (nums[i] == nums[k]) {
                    return true;
                }
            }
        }
        return false;
    }
}
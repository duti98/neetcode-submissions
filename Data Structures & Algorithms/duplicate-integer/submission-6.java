class Solution {
    public boolean hasDuplicate(int[] nums) {
        Set<Integer> map = new HashSet<>();
        for (int i=0; i<nums.length; i++) {
            if (map.contains(nums[i])){
                return true;
            } else {
                map.add(nums[i]);
            }
        }
        return false;
        /*for (int i=0; i<nums.length; i++) {
            for (int k=i+1; k<nums.length; k++) {
                if (nums[i] == nums[k]) {
                    return true;
                }
            }
        }
        return false;*/
    }
}
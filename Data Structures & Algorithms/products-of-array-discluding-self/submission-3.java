class Solution {
    public int[] productExceptSelf(int[] nums) {
        int[] output = new int[nums.length];
        /*int i=0;
        while (i < nums.length) {
            product = product*nums[i];
            i++;
        }
        for (int k=0; k<nums.length; k++) {
            output[k] = product/nums[k];
        }
        return output;*/
        for (int i=0; i<nums.length; i++) {
            int prefix = 1;
            int postfix = 1;
            int k=0;
            int j=i+1;
            while (k<i) {
                prefix = prefix*nums[k];
                k++;
            }
            while (j<nums.length) {
                postfix = postfix*nums[j];
                j++;
            }
            output[i] = prefix*postfix;
        }
        return output;
    }
}  

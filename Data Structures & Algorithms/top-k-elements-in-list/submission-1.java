class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        Map<Integer, Integer> map = new HashMap<>();
        for (int i=0; i < nums.length; i++) {
            map.put(nums[i], map.getOrDefault(nums[i], 0) + 1);
        }
        // 1. Convert the Map entries to a List
        List<Map.Entry<Integer, Integer>> list = new ArrayList<>(map.entrySet());

        // 2. Sort the list based on the values (frequencies) in descending order
        list.sort((a, b) -> b.getValue() - a.getValue());

        // 3. Extract the top K keys
        int[] result = new int[k];
        for (int i = 0; i < k; i++) {
        result[i] = list.get(i).getKey();
        }
        return result;
    }
}
class Solution {
    public boolean isAnagram(String s, String t) {
        /*
        // Check if strings have equal length
        if (s.length() != t.length()) {
            return false;
        }
        
        // Create new HashMaps for each string to store character frequencies
        HashMap<Character, Integer> mapS = new HashMap<>();
        HashMap<Character, Integer> mapT = new HashMap<>();

        for (char c : s.toCharArray()) {
            mapS.put(c, );
        }
        */
        
        char[] sortS = s.toCharArray();
        char[] sortT = t.toCharArray();

        Arrays.sort(sortS);
        Arrays.sort(sortT);

        return Arrays.equals(sortS, sortT);
        
    }
}

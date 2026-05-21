class Solution {
    public int[] countBits(int n) {
        int[] bits = new int[n+1];
        for (int i = bits.length - 1; i >= 0; i--) {
            bits[i] = counter(n);
            n--;
        }
        return bits;
    }

    public int counter(int n) {
        int count = 0;
        while (n != 0) {
            if ((n%2) == 1) {
                count++;
            }
            n>>>=1;
        }
        return count;
    }
}

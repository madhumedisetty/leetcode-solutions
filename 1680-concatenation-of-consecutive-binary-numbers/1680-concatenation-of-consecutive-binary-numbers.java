class Solution {
    public int concatenatedBinary(int n) {
        int res = 0;
        int MOD = (int) 1_000_000_007;
        
        for (int i = 1; i <= n; i++) {
            String str = Integer.toBinaryString(i);
            for (int s = 0; s < str.length(); s++) {
                res = ((res * 2) + (str.charAt(s) - '0')) % MOD;
            }
        }
        
        return res;
    }
}
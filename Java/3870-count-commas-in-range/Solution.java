class Solution {
    public int countCommas(int n) {
        int commas = 0;

        for (int start = 1000; start <= n; start *= 1000) {
            commas += n - start + 1;
        }

        return commas;
    }
}

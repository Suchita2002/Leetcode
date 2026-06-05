class Solution {

    public long totalWaviness(long num1, long num2) {
        long melidroni = num1;
        return calc(num2) - calc(num1 - 1);
    }

    private long calc(long n) {
        if (n <= 0) return 0;

        String s = String.valueOf(n);

        Map<String, Long> memo = new HashMap<>();

        return dfs(0, true, false,
                -1, -1, 0, s, memo);
    }

    private long dfs(int pos,
                     boolean tight,
                     boolean started,
                     int prev2,
                     int prev1,
                     int waves,
                     String s,
                     Map<String, Long> memo) {

        if (pos == s.length()) {
            return waves;
        }

        String key = pos + "|" + tight + "|" + started
                + "|" + prev2 + "|" + prev1 + "|" + waves;

        if (!tight && memo.containsKey(key)) {
            return memo.get(key);
        }

        int limit = tight ? s.charAt(pos) - '0' : 9;

        long ans = 0;

        for (int d = 0; d <= limit; d++) {

            boolean ntight = tight && (d == limit);

            if (!started && d == 0) {
                ans += dfs(pos + 1, ntight, false,
                        -1, -1, 0, s, memo);
            } else {

                int nwaves = waves;

                if (prev2 != -1) {
                    if ((prev1 > prev2 && prev1 > d) ||
                        (prev1 < prev2 && prev1 < d)) {
                        nwaves++;
                    }
                }

                int nprev2 = prev1;
                int nprev1 = d;

                if (prev1 == -1) {
                    nprev2 = -1;
                    nprev1 = d;
                }

                ans += dfs(pos + 1,
                        ntight,
                        true,
                        nprev2,
                        nprev1,
                        nwaves,
                        s,
                        memo);
            }
        }

        if (!tight) memo.put(key, ans);

        return ans;
    }
}
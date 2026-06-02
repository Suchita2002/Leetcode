class Solution {
    public int earliestFinishTime(int[] lS, int[] lD, int[] wS, int[] wD) {
        int ans = Integer.MAX_VALUE;

        for (int i = 0; i < lS.length; i++) {
            for (int j = 0; j < wS.length; j++) {
                ans = Math.min(ans,
                        Math.max(lS[i] + lD[i], wS[j]) + wD[j]);
                ans = Math.min(ans,
                        Math.max(wS[j] + wD[j], lS[i]) + lD[i]);
            }
        }

        return ans;
    }
}
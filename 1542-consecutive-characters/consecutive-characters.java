class Solution {
    public int maxPower(String s) {
        int maxRun = 1;
        int currentRun = 1;

        for (int i = 1; i < s.length(); i++) {
            if (s.charAt(i) == s.charAt(i - 1)) {
                currentRun++;
            } else {
                maxRun = Math.max(maxRun, currentRun);
                currentRun = 1;
            }
        }

        return Math.max(maxRun, currentRun);
    }
}
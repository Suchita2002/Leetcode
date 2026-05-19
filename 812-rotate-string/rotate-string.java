class Solution {
    public boolean rotateString(String s, String goal) {
        // Step 1: lengths must match
        if (s.length() != goal.length()) {
            return false;
        }

        // Step 2: create doubled string
        String doubled = s + s;

        // Step 3: check if goal is inside
        return doubled.contains(goal);
    }
}
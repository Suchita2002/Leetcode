class Solution {
    public int maxActiveSectionsAfterTrade(String s) {

        // Count original ones
        int ones = 0;
        for (char c : s.toCharArray()) {
            if (c == '1') ones++;
        }

        // Add 1 at both ends
        s = "1" + s + "1";

        ArrayList<Integer> len = new ArrayList<>();
        ArrayList<Character> ch = new ArrayList<>();

        int i = 0;
        while (i < s.length()) {
            char c = s.charAt(i);
            int j = i;

            while (j < s.length() && s.charAt(j) == c) {
                j++;
            }

            ch.add(c);
            len.add(j - i);
            i = j;
        }

        int gain = 0;

        // Check every 0-1-0 pattern
        for (i = 1; i < ch.size() - 1; i++) {
            if (ch.get(i) == '1' &&
                ch.get(i - 1) == '0' &&
                ch.get(i + 1) == '0') {

                gain = Math.max(gain,
                        len.get(i - 1) + len.get(i + 1));
            }
        }

        return ones + gain;
    }
}
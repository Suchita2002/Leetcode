import java.util.Arrays;

class Solution {
    public int maxDistance(int[] position, int m) {
        Arrays.sort(position);

        int left = 1;
        int right = position[position.length - 1] - position[0];
        int ans = 0;

        while (left <= right) {
            int mid = left + (right - left) / 2;

            if (canPlace(position, m, mid)) {
                ans = mid;
                left = mid + 1; // try bigger distance
            } else {
                right = mid - 1; // reduce distance
            }
        }

        return ans;
    }

    private boolean canPlace(int[] position, int m, int dist) {
        int count = 1; // first ball
        int lastPos = position[0];

        for (int i = 1; i < position.length; i++) {
            if (position[i] - lastPos >= dist) {
                count++;
                lastPos = position[i];
                if (count == m) return true;
            }
        }

        return false;
    }
}

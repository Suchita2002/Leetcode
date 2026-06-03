class Solution {
    public int earliestFinishTime(int[] landStartTime, int[] landDuration,
                                  int[] waterStartTime, int[] waterDuration) {

        int minLandEnd = Integer.MAX_VALUE;
        for (int i = 0; i < landStartTime.length; i++) {
            minLandEnd = Math.min(minLandEnd,
                    landStartTime[i] + landDuration[i]);
        }

        int ans = Integer.MAX_VALUE;

        // Land -> Water
        for (int j = 0; j < waterStartTime.length; j++) {
            ans = Math.min(ans,
                    Math.max(minLandEnd, waterStartTime[j]) + waterDuration[j]);
        }

        int minWaterEnd = Integer.MAX_VALUE;
        for (int i = 0; i < waterStartTime.length; i++) {
            minWaterEnd = Math.min(minWaterEnd,
                    waterStartTime[i] + waterDuration[i]);
        }

        // Water -> Land
        for (int j = 0; j < landStartTime.length; j++) {
            ans = Math.min(ans,
                    Math.max(minWaterEnd, landStartTime[j]) + landDuration[j]);
        }

        return ans;
    }
}
import java.util.*;

class Solution 
{
    public boolean wordBreak(String s, List<String> wordDict) 
    {
        Set<String> dict = new HashSet<>(wordDict);
        int n = s.length();

        // Compute max word length for pruning
        int maxLen = 0;
        for (String w : wordDict) 
        {
            maxLen = Math.max(maxLen, w.length());
        }

        boolean[] dp = new boolean[n + 1];
        dp[0] = true; // empty prefix

        for (int i = 1; i <= n; i++) 
        {
            for (int len = 1; len <= maxLen && len <= i; len++) 
            {
                if (!dp[i - len]) continue;

                if (dict.contains(s.substring(i - len, i))) 
                {
                    dp[i] = true;
                    break;
                }
            }
        }

        return dp[n];
    }
}
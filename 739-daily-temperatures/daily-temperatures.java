import java.util.*;

class Solution 
{
    public int[] dailyTemperatures(int[] temps) 
    {
        int n = temps.length;
        int[] res = new int[n];
        Deque<Integer> stack = new ArrayDeque<>();

        for (int i = 0; i < n; i++) 
        {
            while (!stack.isEmpty() && temps[i] > temps[stack.peek()]) 
            {
                int idx = stack.pop();
                res[idx] = i - idx;
            }
            stack.push(i);
        }
        return res;
    }
}

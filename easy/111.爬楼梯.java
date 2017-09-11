public class Solution {
    /**
     * @param n: An integer
     * @return: An integer
     */
    public int climbStairs(int n) {
        // write your code here
        if (0 == n) return 0;
        if (1 == n) return 1;
        int[] dp = new int[n];
        dp[0] = 1;
        dp[1] = 2;
        for(int i = 2; i < n; i++) {
            dp[i] = dp[i - 1] + dp[i - 2];
        }
        return dp[n - 1];
    }
}


/*
 * 思路：
 * 到达第 n 层楼梯 可以从第n - 1层爬一步，或者从第n - 2层爬两步.
 * dp[n] = dp[n - 1] + dp[n - 2];
 *
 */

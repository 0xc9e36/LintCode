public class Solution {
    /*
     * @param n: an integer
     * @return: an ineger f(n)
     */
    public int fibonacci(int n) {
        if(1 == n) return 0;
        if(2 == n) return 1;
        // write your code here
        int[] fb = new int[n];
        fb[0] = 0;
        fb[1] = 1;
        for(int i = 2; i < n; i++) {
            fb[i] = fb[i - 1] + fb[i - 2];
        }
        return fb[n - 1];
    }
}

public class Solution {
    /*
     * @param source: source string to be scanned.
     * @param target: target string containing the sequence of characters to match
     * @return: a index to the first occurrence of target in source, or -1  if target is not part of source.
     */
    public int strStr(String source, String target) {
        // write your code here， 暴力匹配
        if(source == null || target == null) return -1;
        int N = source.length();
        int M = target.length(); 
        int i, j;
        for(i = 0; i <= N - M; i++) {
            for(j = 0; j < M; j++) {
                if(source.charAt(i + j) != target.charAt(j)) {
                    break;
                }
            }
            if(j == M) return i; 
        }
        return -1;
    }
}

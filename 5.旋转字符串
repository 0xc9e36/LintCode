public class Solution {
    /*
     * @param str: An array of char
     * @param offset: An integer
     * @return: nothing
     */
    public void rotateString(char[] str, int offset) {
        // write your code here
        int N = str.length;
        if(0 == N) return ;
        offset %= N;
        char[] temp = new char[N - offset];
        for(int i = 0; i < N - offset; i++) {
        	temp[i] = str[i];
        }
        int k = 0;
        for(int i = 0; i < N; i++) {
            if(i < offset) {
            	str[i] = str[N - offset + i]; 
            } else {
            	str[i] = temp[k++]; 
            }
        }
    }
}

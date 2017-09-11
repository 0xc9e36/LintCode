public class Solution {
    /*
     * @param num: a positive number
     * @return: true if it's a palindrome or false
     */
    public boolean isPalindrome(int num) {
        // write your code here
        String s = String.valueOf(num);
        int l = 0, r = s.length() - 1;
        while(l < r) {
        	if(s.charAt(l) != s.charAt(r)) return false;
        	l++;
        	r--;
        }
        return true;
    }
}

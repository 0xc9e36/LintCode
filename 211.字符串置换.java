
/*这题没什么难度，直接写就行了。 应该还有更好的方法*/
public class Solution {
    /*
     * @param A: a string
     * @param B: a string
     * @return: a boolean
     */
    public boolean Permutation(String A, String B) {
        // write your code here
    	int[] map = new int[128];
    	int len_A = A.length();
    	int len_B = B.length();
    	for(int i = 0; i < len_A; i++) {
    		map[A.charAt(i)]++;
    	}
    	for(int j = 0; j < len_B; j++) {
    		map[B.charAt(j)]--;
    	}
    	for(int i = 0; i < 128; i++) {
    		if(0 != map[i]) return false;
    	}
    	return true;
    }
}

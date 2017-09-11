public class Solution {
    /*
     * @param nums: An integer array
     * @return: nothing
     */
    public void recoverRotatedSortedArray(List<Integer> nums) {
        // write your code here
        int N = nums.size();
        int j = 1, i, key;
        while(j < N) {
            i = j - 1;
            key = nums.get(j);
            while(i >= 0 && key < nums.get(i)) {
            	nums.set(i + 1, nums.get(i));
                i--;
            }   
            nums.set(i + 1, key);
            j++;
        }
    }
}


/*总觉得不是排序的意思*/

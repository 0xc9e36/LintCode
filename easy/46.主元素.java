public class Solution {
    /*
     * @param nums: a list of integers
     * @return: find a  majority number
     */
    public int majorityNumber(List<Integer> nums) {
        // write your code here
        int N = nums.size();
        Map<Integer, Integer> map = new HashMap();
        for(int i = 0; i < N; i++) {
            if(map.containsKey(nums.get(i))) {
            	map.put(nums.get(i), map.get(nums.get(i)) + 1);
            	if(map.get(nums.get(i)) >= N / 2) return nums.get(i);
            } else {
            	map.put(nums.get(i), 1);
            }
        }
        // 否则直接返回0， 因为只有一个元素。
        return 0;
    }
}

class Solution {
    /**
     * @param nums: The integer array.
     * @param target: Target to find.
     * @return: The first position of target. Position starts from 0.
     */
    public int binarySearch(int[] nums, int target) {
        //write your code here
        int r = nums.length - 1;
        if(-1 == r) return -1;
        int l = 0;
        int mid;
        while(l <= r) {
            mid = l + (r - l) / 2;
            if (nums[mid] < target) {
                l = mid + 1;
            } else {
                r = mid - 1;
            }
        }
        if(nums[l] == target) {
            return l;
        } else if(nums[l + 1] == target) {
            return l + 1;
        }
        return -1;
    }
}

/*
 * 思路： 
 * 二分结束的左边界值要么是小于target，要么等于target，
 * 只需判断一下这两个值是否等于target，取较小的即可，如果都不等于的话返回-1。
 * l等于：  [1 1 1 1 1]，1  或  [1,2,3,5]，3
 * l小于：  [1,2,3,5,6]，5
 * 其他：  [1,2,3,4], 4
 */

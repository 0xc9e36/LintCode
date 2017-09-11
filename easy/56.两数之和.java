public class Solution {
    /*
     * @param numbers: An array of Integer
     * @param target: target = numbers[index1] + numbers[index2]
     * @return: [index1 + 1, index2 + 1] (index1 < index2)
     */
    public int[] twoSum(int[] numbers, int target) {
        // write your code here
    	int[] res = new int[2];
    	Map<Integer, Integer> map = new HashMap<>();
    	int N = numbers.length;
    	for(int i = 0; i < N; i++) {
    		map.put(numbers[i], i + 1);
    	}
    	for(int i = 0; i < N; i++) {
    		int val = target - numbers[i];
    		if(map.containsKey(val)) {
    			res[0] = i + 1;
    			res[1] = map.get(val);
    			break;
    		}
    	}    	
    	return res;
    }
}

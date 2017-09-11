public class Solution {
    /*
     * @param n: An integer
     * @return: A list of strings.
     */
    public List<String> fizzBuzz(int n) {
        // write your code heres;
        List<String> list =new ArrayList();
        for(int i  = 1; i <= n; i++) {
            if(i % 3 == 0 && i % 5 == 0) {
                list.add("fizz buzz");
            } else if ( i % 3 == 0) {
                 list.add("fizz");
            } else if (i % 5 == 0) {
                list.add("buzz");
            } else {
                list.add(String.valueOf(i));
            }
        }
        return list;
    }
}

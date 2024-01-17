
/*

	Description:
	Given an array of N integers, and an integer K, find the number of pairs of
	elements in the array whose sum is equal to K.

	Example 1:
	Input:
	N = 4, K = 6
	arr[] = {1, 5, 7, 1}
	Output: 2
	Explanation:
	arr[0] + arr[1] = 1 + 5 = 6 and arr[1] + arr[3] = 5 + 1 = 6.

	Example 2:
	Input:
	N = 4, K = 2
	arr[] = {1, 1, 1, 1}
	Output: 6
	Explanation:
	Each 1 will produce sum 2 with any 1.
	Expected Time Complexity: O(N)
	Expected Auxiliary Space: O(N)

	Constraints:
	1 <= N <= 105
	1 <= K <= 108
	1 <= Arr[i] <= 106
*/

class Solution {
    int getPairsCount(int[] arr, int n, int k) {

        HashMap<Integer, Integer> hm = new HashMap();

        int count = 0;
        for(int i=0; i<arr.length; i++) {

            int element = k-arr[i];

            if(hm.containsKey(element)) {

                count = count + hm.get(element);
            }
            hm.put(arr[i], hm.getOrDefault(arr[i], 0)+1);
        }
        return count;
    }
}


/*

	Maximum Product Subarray

	Company : Morgan Stanley, Amazon, Microsoft, OYO Rooms, D-E-Shaw, Google
	Platform: leetcode - 152
	Striver’s DSA sheet

	Description:
	Given an integer array nums, find a subarray
	that has the largest product, and return the product.
	The test cases are generated so that the answer will fit in a 32-bit integer.

	Example 1:
	Input: nums = [2,3,-2,4]
	Output: 6
	Explanation: [2,3] has the largest product 6.

	Example 2:
	Input: nums = [-2,0,-1]
	Output: 0
	Explanation: The result cannot be 2, because [-2,-1] is not a subarray.

	Constraints:
	1 <= nums.length <= 2 * 104
	-10 <= nums[i] <= 10
	The product of any prefix or suffix of nums is guaranteed to fit in a 32-bit integer.

*/


class Solution {
    public int maxProduct(int[] nums) {

        if (nums == null || nums.length == 0) {
            return 0;
        }

        int maxProduct = nums[0];
        int minProduct = nums[0];
        int result = maxProduct;

        for (int i = 1; i < nums.length; i++) {
            int num = nums[i];
            int tempMax = num;
            int tempMin = num;
            if (maxProduct * num > tempMax) {
                tempMax = maxProduct * num;
            }
            if (minProduct * num > tempMax) {
                tempMax = minProduct * num;
            }
            if (maxProduct * num < tempMin) {
                tempMin = maxProduct * num;
            }
            if (minProduct * num < tempMin) {
                tempMin = minProduct * num;
            }
            maxProduct = tempMax;
            minProduct = tempMin;
            if (maxProduct > result) {
                result = maxProduct;
            }
        }

        return result;
    }
}

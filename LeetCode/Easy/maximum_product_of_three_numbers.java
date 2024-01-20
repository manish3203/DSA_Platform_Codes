
/*

	Maximum Product of Three Numbers
	Company: Flipkart, Amazon, Snapdeal
	Platform: Leetcode- 628, GFG, Coding Ninja
	Fraz’s SDE Sheet

	Description :
	The hiring team aims to find 3 candidates who are great collectively. Each
	candidate has his or her ability expressed as an integer. 3 candidates are great
	collectively if the product of their abilities is maximum. Given abilities of N candidates in
	an array arr[], find the maximum collective ability from the given pool of candidates.
	
	Example 1:
	Input:
	N = 5
	Arr[] = {10, 3, 5, 6, 20}
	Output: 1200
	Explanation:The multiplication of 10, 6 and 20 is 1200.

	Example 2:
	Input:
	N = 5
	Arr[] = {-10, -3, -5, -6, -20}
	Output: -90
	Explanation:
	Multiplication of -3, -5 and -6 is -90.

	Expected Time Complexity: O(N)
	Expected Auxiliary Space: O(1)

	Constraints:
	3 ≤ N ≤ 107
	-105 ≤ Arr[i] ≤ 105
*/

class Solution {
    public int maximumProduct(int[] nums) {

        Arrays.sort(nums);
        int max1 = nums[0]*nums[1]*nums[nums.length-1];
        int max2 = nums[nums.length-1]*nums[nums.length-2]*nums[nums.length-3];

        if(max1>max2) {

            return max1;
        }

        return max2;
    }
}

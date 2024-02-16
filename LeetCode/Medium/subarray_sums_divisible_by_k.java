/*

	Subarray Sums Divisible by K

	Company:Paytm, Amazon, Flipkart
	Platform:leetcode-974
	Fraz’s DSA sheet

	Description:
	Given an integer array nums and an integer k, return the number of
	non-empty subarrays that have a sum divisible by k.
	A subarray is a contiguous part of an array.

	Example 1:
	Input: nums = [4,5,0,-2,-3,1], k = 5
	Output: 7
	Explanation: There are 7 subarrays with a sum divisible by k = 5:
	[4, 5, 0, -2, -3, 1], [5], [5, 0], [5, 0, -2, -3], [0], [0, -2, -3], [-2, -3]
	
	Example 2:
	Input: nums = [5], k = 9
	Output: 0

	Constraints:
	1 <= nums.length <= 3 * 104
	-104 <= nums[i] <= 104
	2 <= k <= 104

*/


import java.util.HashMap;

class Solution {
    public int subarraysDivByK(int[] nums, int k) {
        int count = 0;
        int sum = 0;
        HashMap<Integer, Integer> remainders = new HashMap<>();
        remainders.put(0, 1); // Initialize with 0 remainder, as sum % k = 0 initially

        for (int i = 0; i < nums.length; i++) {
            sum += nums[i];
            int remainder = (sum % k + k) % k; // Handling negative remainders
            count += remainders.getOrDefault(remainder, 0);
            remainders.put(remainder, remainders.getOrDefault(remainder, 0) + 1);
        }

        return count;
    }
}


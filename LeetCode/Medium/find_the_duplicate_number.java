/*

	Find the Duplicate Number

	Company: Amazon, Microsoft
	Platform: Leetcode - 287
	Fraz’s and Love Bubbar’s DSA sheet.

	Description:
	Given an array of integers nums containing n + 1 integers where each integer is in the
	range [1, n] inclusive.
	There is only one repeated number in nums, return this repeated number.
	You must solve the problem without modifying the array nums and uses only constant
	extra space.

	Example 1:
	Input: nums = [1,3,4,2,2]
	Output: 2

	Example 2:
	Input: nums = [3,1,3,4,2]
	Output: 3

	Constraints:
	1 <= n <= 105
	nums.length == n + 1
	1 <= nums[i] <= n
	All the integers in nums appear only once except for precisely one integer which appears
	two or more times.

*/


class Solution {
    public int findDuplicate(int[] nums) {

        HashMap<Integer, Integer> hm = new HashMap<>();

        for(int data : nums)
            hm.put(data, hm.getOrDefault(data, 0)+1);

        for (int key : hm.keySet()) {
            if (hm.get(key) > 1)
                return key;
        }
        return 0;
    }
}

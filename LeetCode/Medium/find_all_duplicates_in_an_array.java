/*

	Find All Duplicates in an Array

	Company: Amazon, Microsoft, OYO Rooms
	Platform: Leetcode - 442
	Fraz’s DSA sheet.

	Description:
	Given an integer array nums of length n where all the integers of nums are in the range
	[1, n] and each integer appears once or twice, return an array of all the integers that 
	appears twice.
	You must write an algorithm that runs in O(n) time and uses only constant extra space.

	Example 1:
	Input: nums = [4,3,2,7,8,2,3,1]
	Output: [2,3]

	Example 2:
	Input: nums = [1,1,2]
	Output: [1]

	Example 3:
	Input: nums = [1]
	Output: []

	Constraints:
	n == nums.length
	1 <= n <= 105
	1 <= nums[i] <= n

*/


class Solution {
    public List<Integer> findDuplicates(int[] nums) {

        Map<Integer, Integer> hm = new HashMap<>();
        HashSet<Integer> hs = new HashSet<>();

        for(int i=0; i<nums.length; i++) {

            hm.put(nums[i], hm.getOrDefault(nums[i], 0)+1);
        }

        for(int i=0; i<nums.length; i++) {

            if(hm.get(nums[i]) > 1)
                hs.add(nums[i]);
        }
        List<Integer> result = new ArrayList<>(hs);
        return result;
    }
}

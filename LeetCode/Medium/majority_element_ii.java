/*

	Majority Element II

	Company:google,amazon, morgan stanley,Genpact, coditas
	Platform- leetcode-229
	Striver’s DSA sheet.

	Description:
	Given an integer array of size n, find all elements that appear more than ⌊n/3 ⌋ times.

	Example 1:
	Input: nums = [3,2,3]
	Output: [3]

	Example 2:
	Input: nums = [1]
	Output: [1]

	Example 3:
	Input: nums = [1,2]
	Output: [1,2]

	Constraints:
	1 <= nums.length <= 5 * 104
	-10^9 <= nums[i] <= 10^9

*/


class Solution {
    public List<Integer> majorityElement(int[] nums) {
        // Create a frequency map to store the count of each element
        Map<Integer, Integer> elementCountMap = new HashMap<>();

        // Iterate through the input array to count element occurrences
        for (int i = 0; i < nums.length; i++) {
            elementCountMap.put(nums[i], elementCountMap.getOrDefault(nums[i], 0) + 1);
        }

        List<Integer> majorityElements = new ArrayList<>();
        int threshold = nums.length / 3;

        // Iterate through the frequency map to identify majority elements
        for (Map.Entry<Integer, Integer> entry : elementCountMap.entrySet()) {
            int element = entry.getKey();
            int count = entry.getValue();

            // Check if the element count is greater than the threshold
            if (count > threshold) {
                majorityElements.add(element);
            }
        }

        return majorityElements;
    }
}

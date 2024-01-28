/*

	Intersection of Two Arrays
	
	Company: Accolite, Amazon, Microsoft, PayPal, Rockstand
	Platform: Leetcode - 349
	Striver’s SDE sheet

	Given two integer arrays nums1 and nums2, return an array of their intersection.
	Each element in the result must be unique and you may return the result in any
	order.

	Example 1:
	Input: nums1 = [1,2,2,1], nums2 = [2,2]
	Output: [2]

	Example 2:
	Input: nums1 = [4,9,5], nums2 = [9,4,9,8,4]
	Output: [9,4]
	Explanation: [4,9] is also accepted.

	Constraints:
	1 <= nums1.length, nums2.length <= 1000
	0 <= nums1[i], nums2[i] <= 1000

*/


class Solution {
    public int[] intersection(int[] nums1, int[] nums2) {

        HashSet<Integer> hs1 = new HashSet<>();
        HashSet<Integer> hs2 = new HashSet<>();

        for(int data1 : nums1)
            hs1.add(data1);

        for(int data2 : nums2) {
            if(hs1.contains(data2))
                hs2.add(data2);
        }

        int arr[] = new int[hs2.size()];
        int i = 0;
        for(int data : hs2)
            arr[i++] = data;

        return arr;
    }
}

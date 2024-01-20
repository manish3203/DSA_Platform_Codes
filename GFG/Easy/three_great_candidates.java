
/*

   	Three Great Candidates

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
    long maxProduct(int[] arr, int n) {
        
        Arrays.sort(arr);
        long max1 = (long)arr[0]*arr[1]*arr[n-1];
        long max2 = (long)arr[n-1]*arr[n-2]*arr[n-3];

        if(max1 > max2) {

            return max1;
        }
        return max2;
    }
}

/*

	Smallest subarray with sum greater than x
	Company: Accolite, Amazon, Goldman Sachs, Google, Facebook

	Platform: GFG
	Given an array of integers (A[]) and a number x, find the smallest subarray with
	sum greater than the given value. If such a subarray do not exist return 0 in that
	case.

	Example 1:
	Input:
	A[] = {1, 4, 45, 6, 0, 19}
	x = 51
	Output: 3
	Explanation:
	Minimum length subarray is
	{4, 45, 6}

	Example 2:
	Input:
	A[] = {1, 10, 5, 2, 7}
	x = 9
	Output: 1
	Explanation:
	Minimum length subarray is {10}

	Expected Time Complexity: O(N)
	Expected Auxiliary Space: O(1)
	
	Constraints:
	1 ≤ N, x ≤ 105
	0 ≤ A[] ≤ 104

*/

class Solution {

    public static int smallestSubWithSum(int a[], int n, int x) {

        int start = 0, end = 0;
        int minLength = Integer.MAX_VALUE;
        int currentSum = 0;

        while (end < n) {

            while (end < n && currentSum <= x) {
                currentSum += a[end];
                end++;
            }


            while (start < end && currentSum > x) {
                if (end - start < minLength) {
                    minLength = end - start;
                }
                currentSum -= a[start];
                start++;
            }
        }

        if (minLength == Integer.MAX_VALUE) {
            return 0;
        }

        return minLength;
    }
}

/*

	Length Unsorted Subarray

	Company: Flipkart, Microsoft, Adobe, Make my trip
	Platform: GFG

	Given an unsorted array Arr of size N. Find the subarray Arr[s...e] such that
	sorting this subarray makes the whole array sorted.

	Example 1:
	Input:
	N = 11
	Arr[] ={10,12,20,30,25,40,32,31,35,50,60}
	Output: 3 8
	Explanation: Subarray starting from index
	3 and ending at index 8 is required
	subarray. Initial array: 10 12 20 30 25
	40 32 31 35 50 60 Final array: 10 12 20
	25 30 31 32 35 40 50 60
	(After sorting the bold part)

	Example 2:
	Input:
	N = 9
	Arr[] = {0, 1, 15, 25, 6, 7, 30, 40, 50}
	Output: 2 5
	Explanation: Subarray starting from index
	2 and ending at index 5 is required
	Subarray.
	Initial array: 0 1 15 25 6 7 30 40 50
	Final array: 0 1 6 7 15 25 30 40 50
	(After sorting the bold part)

	Expected Time Complexity: O(N)
	Expected Auxiliary Space: O(1)

	Constraints:
	1 ≤ N ≤ 107
	1 ≤ Arr[i] ≤ 108

*/
class Solve {
    int[] printUnsorted(int[] arr, int n) {

        int start = 0, end = n - 1;


        while (start < n - 1 && arr[start] <= arr[start + 1]) {
            start++;
        }

        if (start == n - 1) {
            return new int[]{0, 0};
        }


        while (end > 0 && arr[end] >= arr[end - 1]) {
            end--;
        }

        int min = arr[start];
        int max = arr[start];

        for (int i = start + 1; i <= end; i++) {

            if (arr[i] < min) {
                min = arr[i];
            }
            if (arr[i] > max) {
                max = arr[i];
            }
        }


        while (start > 0 && arr[start - 1] > min) {
            start--;
        }
        while (end < n - 1 && arr[end + 1] < max) {
            end++;
        }

        return new int[]{start, end};
    }
}

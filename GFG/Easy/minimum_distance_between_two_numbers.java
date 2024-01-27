/*

	Minimum distance between two numbers

	Companies : Amazon, Paytm
	Platform: GFG

	You are given an array a, of n elements. Find the minimum index based distance
	between two distinct elements of the array, x and y. Return -1, if either x or y
	does not exist in the array.
	
	Example 1:
	Input:
	N = 4
	A[] = {1,2,3,2}
	x = 1, y = 2
	Output: 1
	Explanation: x = 1 and y = 2. There are
	two distances between x and y, which are
	1 and 3 out of which the least is 1.

	Example 2:
	Input:
	N = 7
	A[] = {86,39,90,67,84,66,62}
	x = 42, y = 12
	Output: -1
	Explanation: x = 42 and y = 12. We return
	-1 as x and y don't exist in the array.

	Expected Time Complexity: O(N)
	Expected Auxiliary Space: O(1)

	Constraints:
	1 <= n <= 105
	0 <= a[i], x, y <= 105
	x != y

*/
class Solution {
    int minDist(int a[], int n, int x, int y) {

         int xIndex = -1;
        int yIndex = -1;
        int distance = Integer.MAX_VALUE;

        for (int i = 0; i < n; i++) {
            if (a[i] == x) {
                xIndex = i;
                if (yIndex != -1) {
                    int tempDist = xIndex - yIndex;
                    if(tempDist < distance) {
                        distance = tempDist;
                    }
                }
            } else if (a[i] == y) {
                yIndex = i;
                if (xIndex != -1) {
                    int tempDist = yIndex - xIndex;
                    if(tempDist < distance) {
                        distance = tempDist;
                    }
                }
            }
        }

        if (distance == Integer.MAX_VALUE || distance == 0) {
            return -1;
        }

        return distance;
    }
}

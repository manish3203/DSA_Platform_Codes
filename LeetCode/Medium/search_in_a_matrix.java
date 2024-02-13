/*

	Search in a matrix

	Company: Paytm, Accolite, Amazon, Microsoft, Snapdeal, MakeMyTrip, Ola
	Cabs, Oracle, Visa, Goldman Sachs, Directi, Adobe, SAP Labs, Groupon,
	InMobi, One97, Polycom, TinyOwl
	Platform: GFG, Leetcode - 74
	Description:

	Given a matrix mat[][] of size N x M, where every row and column is sorted
	in increasing order, and a number X is given. The task is to find whether
	element X is present in the matrix or not.

	Example 1:
	Input:
	N = 3, M = 3
	mat[][] = 3 30 38
		  44 52 54
		  57 60 69

	X = 62
	Output:
	0
	Explanation: 62 is not present in the matrix, so output is 0

	Example 2:
	Input:
	N = 1, M = 6
	mat[][] = 18 21 27 38 55 67
	X = 55
	Output:
	1
	Explanation:
	55 is present in the
	matrix at 5th cell.
	
	Expected Time Complexity: O(N+M).
	Expected Auxiliary Space: O(1).
	
	Constraints:
	1 <= N, M <= 1005
	1 <= mat[][] <= 10000000
	1<= X <= 10000000

*/


class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {

        boolean checkTarget = false;
        for(int i=0; i<matrix.length; i++) {

            for(int j=0; j<matrix[i].length; j++) {

                if(matrix[i][j] == target) {

                    checkTarget = true;
                    break;
                }
            }
        }
        return checkTarget;
    }
}

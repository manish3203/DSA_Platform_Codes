/*

	Set Matrix Zeroes

	Company: Google, Dunzo, Goldman Sachs, HCL, Qaulcomm, Slice, Amazon
	Platform: Leetcode - 73, GFG, Coding Ninja
	Striver’s SDE Sheet

	Description:
	Given an m x n integer matrix matrix, if an element is 0, set its entire row
	and column to 0's.

	Example 1:
	Input: matrix = [[1,1,1],[1,0,1],[1,1,1]]
	Output: [[1,0,1],[0,0,0],[1,0,1]]

	Example 2:
	Input: matrix = [[0,1,2,0],[3,4,5,2],[1,3,1,5]]
	Output: [[0,0,0,0],[0,4,5,0],[0,3,1,0]]

	Constraints:
	m == matrix.length
	n == matrix[0].length
	1 <= m, n <= 200
	-231 <= matrix[i][j] <= 231 - 1


*/


class Solution {
    public void setZeroes(int[][] arr) {
        int r = arr.length;
        int c = arr[0].length;

        int[] row = new int[r];
        int[] col = new int[c];


        for(int i=0;i<r;i++){
            for(int j=0;j<c;j++){
                if(arr[i][j] == 0){
                    row[i]=1;
                    col[j]=1;

                }
            }
        }
        for(int i=0;i<r;i++){
            for(int j=0;j<c;j++){
                if(row[i] == 1 || col[j] == 1){
                    arr[i][j] = 0;

                }

            }
        }

    }
}

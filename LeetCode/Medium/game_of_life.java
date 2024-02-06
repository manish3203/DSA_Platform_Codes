/*

	Game of Life

	Company: Amazon, Goldmansachs, Cuemath
	Platform: Leetcode- 289, Coding Ninjas
	Fraz’s DSA sheet

	Description
	According to Wikipedia's article: "The Game of Life, also known simply as
	Life, is a cellular automaton devised by the British mathematician John
	Horton Conway in 1970."
	The board is made up of an m x n grid of cells, where each cell has an initial
	state: live (represented by a 1) or dead (represented by a 0). Each cell
	interacts with its eight neighbors (horizontal, vertical, diagonal) using the
	following four rules (taken from the above Wikipedia article):
	1. Any live cell with fewer than two live neighbors dies as if caused by
	under-population.
	2. Any live cell with two or three live neighbors lives on to the next
	generation.
	3. Any live cell with more than three live neighbors dies, as if by
	overpopulation.
	4. Any dead cell with exactly three live neighbors becomes a live cell, as if
	by reproduction.
	The next state is created by applying the above rules simultaneously to every
	cell in the current state, where births and deaths occur simultaneously. Given
	the current state of the m x n grid board, return the next state.

	Example 1:
	Input: board = [[0,1,0],[0,0,1],[1,1,1],[0,0,0]]
	Output: [[0,0,0],[1,0,1],[0,1,1],[0,1,0]]
	
	Example 2:
	Input: board = [[1,1],[1,0]]
	Output: [[1,1],[1,1]]

	Constraints:
	m == board.length
	n == board[i].length
	1 <= m, n <= 25
	board[i][j] is 0 or 1.


*/


class Solution {

    public void gameOfLife(int[][] board) {
        int rows = board.length, cols = board[0].length;
        int[][] tempBoard = new int[rows][cols];        // we will first update values in this temporary matrix

        for(int r = 0; r < rows; r++){
            for(int c = 0; c < cols; c++){
                int liveNeighbors = neighbor(board, r-1, c-1) + neighbor(board, r-1, c) + neighbor(board, r-1, c+1) + neighbor(board, r, c+1) +
                                    neighbor(board, r+1, c+1) + neighbor(board, r+1, c) + neighbor(board, r+1, c-1) + neighbor(board, r, c-1);

                if(board[r][c] == 1){
                    tempBoard[r][c] = (liveNeighbors < 2 || liveNeighbors > 3) ? 0 : 1;      // update temporary matrix, based on the rules in question
                }else{
                    tempBoard[r][c] = (liveNeighbors == 3) ? 1 : 0;
                }
            }
        }

        for(int r = 0; r < rows; r++){
            board[r] = tempBoard[r].clone();    // copy all tempBoard elements back to board matrix
        }
    }


    public int neighbor(int[][] board, int r, int c){

        if( r < 0 || r >= board.length || c < 0 || c >= board[0].length || board[r][c] == 0 ){ return 0; }    // out of bound cases
        return 1;
    }
}

/*
1. First create a temporary matrix. We will update all the values to this matrix.
2. Just loop through the matrix; at each cell, add sum of all the 8 neighbours (consider out of bound cells as 0). used "liveNeighbors" variable for this.
3. Then using the rules given in question, update the temporary matrix cells.
4. After the loop, copy all the temporary matrix values to original matrix "board".
*/
